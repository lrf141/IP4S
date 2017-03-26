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
import ip4s.core.{Conversion,Pixel}

class IPLcore extends CoreFunction{

    override def read(name:String):Array[Array[Pixel]] 
        = Conversion.convertToArray( ImageIO.read( new File(name) ) )

    override def read(file:File):Array[Array[Pixel]] 
        = Conversion.convertToArray( ImageIO.read( file ) )

    override def write(name:String):Unit={

    }

    override def write(file:File):Unit={

    }

}