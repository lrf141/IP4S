import org.scalatest.Assertions
import org.scalatest.FunSpec
import org.scalatest.Matchers._
import org.junit.Test

import scala.io.Source

import ip4s.core._
import java.io.File

class TestWrite extends FunSpec{
    
    describe("spec"){
        it("test1"){
            val img = (new IPLcore).read(new File("src/test/resources/Lenna.png"))
            (new IPLcore).write("lenna2")
        }
    }
}