/*
*  IP4S/src/main/scala/core/Conversion.scala
* 
*  Copyright (C) 2017 K.Takeuchi
*
*  This object has the function of converting image data and 
*  its format into easy-to-handle format.
*/

package ip4s
package core

import java.awt.image.BufferedImage

import ip4s.core.Pixel

object Conversion{

    private[this] val base = 0xff

    //ピクセルの値をpixelの要素として色別に変換
    private def convertToPixel(value:Int):Pixel = {
        
        val alpha = ( value >>> 24 )
        val red   = ( value >>  16 ) & base
        val green = ( value >>  8  ) & base
        val blue  = ( value        ) & base
        new Pixel(alpha,red,green,blue)

    }

    //Pixelクラスの保持する値を元に16進数値に変換する
    private def convertToHexValue(pixel: Pixel):Int 
        = pixel.alpha << 24 | pixel.red << 16 | pixel.green << 8 | pixel.blue

    //画像を二次元配列化する
    def convertToArray(img:BufferedImage):Array[Array[Pixel]] = {
        //get image info
        val width:Int = img.getWidth
        val height:Int = img.getHeight
        
        //define image array
        var image = Array.ofDim[Pixel](height,width)

        //set pixel value
        for(h <- 0 to height-1){
            for(w <- 0 to width-1){
                image(h)(w) = convertToPixel(img.getRGB(w,h))
            }
        }
        image
    }


    //二次元配列化されている値を画像として生成する
    def convertToImage(img:Array[Array[Pixel]]):BufferedImage = {
        
        //get size
        val width:Int = img(0).length
        val height:Int = img.length

        //only ARGB yet
        val write:BufferedImage 
            = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB)

        for(h <- 0 to height-1){
            for(w <- 0 to width-1){
                //translate into image
                write.setRGB(w,h,convertToHexValue(img(h)(w)));
            }
        }
        write
    }


}
