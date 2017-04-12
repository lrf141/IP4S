/*
*  IP4S/src/main/scala/function/CoreFunction.scala
* 
*  Copyright (C) 2017 K.Takeuchi
*
*  Declare the core function of this wrapper with a trait.
*/

package ip4s
package function

import javax.imageio.ImageIO
import java.awt.image.BufferedImage
import java.io.File

import ip4s.core.Pixel

trait CoreFunction{
    
    def read(name:String):Array[Array[Pixel]]
    def read(file:File):Array[Array[Pixel]]

    def write(name:String, image:Array[Array[Pixel]]):Unit
    def write(file:File, image:Array[Array[Pixel]]):Unit
    
}
