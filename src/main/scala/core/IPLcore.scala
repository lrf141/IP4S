/*
*  IP4S/src/main/scala/core//IPLcore.scala
* 
*  Copyright (C) 2017 K.Takeuchi
*
*  A class that implements the core function of this wrapper.
*  This class has main functions of reading, writing and displaying images.
*/

package ip4s
package core

import javax.imageio.ImageIO
import java.awt.image.BufferedImage
import java.io.File

import ip4s.function.CoreFunction
import ip4s.core.{Conversion,Pixel}
import ip4s.ImageViewer.View

class IPLcore extends CoreFunction{

    //読み込んだ画像を二次元配列として保持する
    private[this] var image:Array[Array[Pixel]] = null

    //画像を二次元配列として読み込む
    override def read(name:String):Array[Array[Pixel]] = {
        
        this.image = Conversion.convertToArray( ImageIO.read( new File(name) ) )
        image
        
    }

    override def read(file:File):Array[Array[Pixel]] = {
        
        this.image = Conversion.convertToArray( ImageIO.read( file ) )
        image

    }



    //二次元配列化されている画像データを画像として出力する
    override def write(name:String):Unit = {

        try{
            ImageIO.write( Conversion.convertToImage(this.image), "png", (new File(name+".png")) )
        }catch{
            case e:Exception => e.printStackTrace()
        }

    } 

    override def write(file:File):Unit={

        try{
            ImageIO.write( Conversion.convertToImage(this.image), "png", file )
        }catch{
            case e:Exception => e.printStackTrace()
        }

    }

    //open image viewer
    def show( image:Array[Array[Pixel]] ):Unit = {
        val win:View = new View(Conversion.convertToImage(image),image(0).size,image.size);
        win.show();
    } 


}