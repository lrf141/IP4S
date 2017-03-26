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
    
    def read(name:String):Array[Array[Tuple4[Int,Int,Int,Int]]]
    def read(file:File):Array[Array[Tuple4[Int,Int,Int,Int]]]

    def write(name:String):Unit
    def write(file:File):Unit

    //まだ実装しない2017/03/26
    //def show(name:Any):Unit
}
