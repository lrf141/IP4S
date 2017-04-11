import org.scalatest.Assertions
import org.scalatest.FunSpec
import org.scalatest.Matchers._
import org.junit.Test

import scala.io.Source

import ip4s.core._
import java.io.File

class TestWrite extends FunSpec{
    
    describe("spec"){
        it("image write test that based array"){
            val ipl = new IPLcore
            val img = ipl.read(new File("src/test/resources/Lenna.png"))
            //pass string value
            ipl.write("lenna2",img)
            val file = new File("./lenna2.png")
            file.exists() should be (true)
        }
        it("image write test2 that based array"){
            val ipl = new IPLcore
            val img = ipl.read(new File("src/test/resources/Lenna.png"))
            //pass File value
            ipl.write(new File("./lenna3.png"),img)
            val file = new File("./lenna3.png")
            file.exists() should be (true)
        }
    }
}