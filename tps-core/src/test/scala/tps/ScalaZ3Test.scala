package tps
package test

import org.scalatest.FunSuite
import org.scalatest.Matchers

class ScalaZ3Test extends FunSuite with Matchers {
  test("z3 is accessible and has correct version") {
    try {
      z3.scala.version should startWith ("Z3 4.3")
    } catch {
      case e: java.lang.UnsatisfiedLinkError => 
        fail("Cannot access Z3:" + e)
    }
  }
}
