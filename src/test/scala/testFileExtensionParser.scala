import org.scalatest.Assertions
import org.scalatest.FunSpec
import org.scalatest.Matchers._
import org.junit.Test

import scala.io.Source

import ip4s.core._
import ip4s.function.FileExtensionParser
import java.io.File

class TestFileExtensionParser extends FunSpec{
    
    describe("spec"){
        it("test file extension parser no.1"){
            val name:String = "lenna.png"
            FileExtensionParser.parse(name) should be ("png")
        }
    }
}