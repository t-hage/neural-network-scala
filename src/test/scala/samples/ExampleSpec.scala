package samples

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{BeforeAndAfter, FunSpec, Matchers}

@RunWith(classOf[JUnitRunner])
class ExampleSpec extends FunSpec with Matchers with BeforeAndAfter {

  describe("A Stack") {

    it("should pop values in last-in-first-out order") {

      1 shouldBe 1
    }
  }
}
