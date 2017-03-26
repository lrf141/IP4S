/*
*  IP4S/src/main/scala/function/CoreFunction.scala
* 
*  Copyright (C) 2017 K.Takeuchi
*
*  Declare the core function of this wrapper with a trait.
*/

package ip4s
package function

import java.io.File

trait CoreFunction{
    
    //return value change later
    def read(name:String):Unit
    def read(file:File):Unit

    def write(name:String):Unit
    def write(file:File):Unit

    def show(name:Any):Unit
}
