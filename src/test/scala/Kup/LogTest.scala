package Kup

import org.scalatest.funsuite.AnyFunSuite


class LogTest extends AnyFunSuite {
  val log = new Log
   //case 1
  test("Test Log Case 1.") {
   val temp =s"[INFO]:I Love Scala."
    assert(log.log("I Love Scala.") === temp)
  }
   //case 2
  test("Test Log Case 2.") {
    val temp =s"[INFO]:Welcome"
    assert(log.log("Welcome") === temp)
  }





}
