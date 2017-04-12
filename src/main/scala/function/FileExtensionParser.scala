/*
*  IP4S/src/main/scala/function/FileExtensionParser.scala
* 
*  Copyright (C) 2017 K.Takeuchi
*
*  A class that implements a function for determining the file extension
*/

import scala.util.parsing.combinator._

object FileExtensionParser extends JavaTokenParsers{

    def dot             = "."
    def extension_lower = "gif" | "jpeg" | "jpg" | "png" | "wbmp"
    def extension_upper = "GIF" | "JPEG" | "JPG" | "PNG" | "WBMP"

}