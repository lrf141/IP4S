import org.scalatest.Assertions
import org.scalatest.FunSpec
import org.scalatest.Matchers._
import org.junit.Test

import scala.io.Source

import ip4s.core._
import ip4s.IPL
import java.io.File

class TestRead extends FunSpec{
    
    describe("spec"){
        it("match pixel value test 1"){
            val img = (new IPL).read(new File("src/test/resources/Lenna.png"))
            //this value is based OpenCV + Python
            img(0)(0).alpha should be (255)
            img(0)(0).red should be (226)
            img(0)(0).green should be (137)
            img(0)(0).blue should be (125)
        }

        it("match pixel value test2"){
            val img = (new IPL).read(new File("src/test/resources/Lenna.png"))
            //this value is based OpenCV + Python
            img(0)(10).alpha should be (255)
            img(0)(10).red should be (228)
            img(0)(10).green should be (135)
            img(0)(10).blue should be (126)
        }
    }
}