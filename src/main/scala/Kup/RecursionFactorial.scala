package Kup

class RecursionFactorial {
  def factorial(num: Int): Int =
    if(num == 1 || num == 0)1
    else (num * factorial(num - 1))

}


