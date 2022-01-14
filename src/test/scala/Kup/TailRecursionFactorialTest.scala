package Kup

import org.scalatest.funsuite.AnyFunSuite
class TailRecursionFactorialTest extends AnyFunSuite {
  val obj = new TailRecursionFactorial
  //case 1
  test(" Test TailRecursionFactorialTest Case 1."){
    val temp:Int=720
    assert(obj.factorial(6)===temp)
  }
  //case 2
  test(" Test TailRecursionFactorialTest Case 2."){
    val temp:Int=120

     assert(obj.factorial(5)===temp)
  }

}
