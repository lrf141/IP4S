/*
*  IP4S/src/main/scala/Pixel.scala
* 
*  Copyright (C) 2017 K.Takeuchi
*
*  This class holds the RGB value of a pixel
*/

package ip4s
package core

class Pixel(_a:Int,_r:Int,_g:Int,_b:Int){
    var alpha = _a
    var red   = _r
    var green = _g
    var blue  = _b
}