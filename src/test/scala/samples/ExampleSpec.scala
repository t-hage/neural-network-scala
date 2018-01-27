package samples

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{BeforeAndAfter, FunSpec, Matchers}

@RunWith(classOf[JUnitRunner])
class ExampleSpec extends FunSpec with Matchers with BeforeAndAfter {

  describe("Unit tests") {

    it("should be successful") {

      1 shouldBe 1
    }


    it("should fail") {

      1 shouldBe 2
    }
  }
}
