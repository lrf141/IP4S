/*
*  IP4S/src/main/scala/function/FileExtensionParser.scala
* 
*  Copyright (C) 2017 K.Takeuchi
*
*  A class that implements a function for determining the file extension
*/

object FileExtensionParser{

    val dot:String = "."
    val extensionNameList:List[String] = List("gif", "jpeg", "jpg", "png", "wbmp")
    

    /*
    get file extension as String
    return file extension name as String
    */
    def parse( file_name:String ):String = {

        //split filename by dot
        val split:Array[String] = file_name.split(this.dot)

        //get last value in split Array[String]
        val maybe_extension:String = split.last

        //search file extension
        var find_flag:Boolean = false
        for(extension <- this.extensionNameList){
            if( extension.equals( maybe_extension ) )
                find_flag = true
        }

        //return file extension
        if(find_flag) maybe_extension else "none"
            
    }

}