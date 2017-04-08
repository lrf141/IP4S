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
            val ipl = new IPLcore
            val img = ipl.read(new File("src/test/resources/Lenna.png"))
            ipl.write("lenna2")
        }
    }
}