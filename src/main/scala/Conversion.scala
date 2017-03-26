/*
*  IP4S/src/main/scala/Conversion.scala
* 
*  Copyright (C) 2017 K.Takeuchi
*
*  This object has the function of converting image data and 
*  its format into easy-to-handle format.
*/

package ip4s
package core

import java.awt.image.BufferedImage

object Conversion{

    private[this] val base = 0xff

    //ピクセルの値をタプルの要素として色別に変換
    private def convertToTuple(value:Int):(Int,Int,Int,Int) = {
        val alpha = ( value >>> 24 ) & base
        val red   = ( value >>> 16 ) & base
        val green = ( value >>> 8  ) & base
        val blue  = ( value        ) & base
        (alpha,red,green,blue)
    }

    def convertToArray(img:BufferedImage):Array[Array[Tuple4[Int,Int,Int,Int]]] = {
        //get image info
        val width:Int = img.getWidth
        val height:Int = img.getHeight
        

        //define image array
        var image = Array.ofDim[Tuple4[Int,Int,Int,Int]](height,width)

        for(h <- 0 to height){
            for(w <- 0 to width){
                image(h)(w) = convertToTuple(img.getRGB(w,h))
            }
        }
        image
    }

}
