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

trait CoreFunction{
    
    def read(name:String):BufferedImage
    def read(file:File):BufferedImage

    def write(name:String):Unit
    def write(file:File):Unit

    //まだ実装しない
    //def show(name:Any):Unit
}
