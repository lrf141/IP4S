/*
*  IP4S/src/main/scala/IPLcore.scala
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
import ip4s.core.Conversion

class IPLcore extends CoreFunction{

    override def read(name:String):Array[Array[Tuple4[Int,Int,Int,Int]]] = {
        
        //load image 
        val img:BufferedImage = ImageIO.read(new File(name))

        //convert to Array
        Conversion.convertToArray(img)
    }

    override def read(file:File):Array[Array[Tuple4[Int,Int,Int,Int]]] = {
         //load image 
        val img:BufferedImage = ImageIO.read(file)
        
        //convert to Array
        Conversion.convertToArray(img)
    }

    override def write(name:String):Unit={

    }

    override def write(file:File):Unit={

    }

}