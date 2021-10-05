package Tournaments

import Main.PlaygroundJava

class CircleOfNumbers {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      //val a: MutableList<Int> = arrayListOf(-1000, 0, -2, 0)
      val a: Int = 10
      val fin = 2
      PlaygroundJava.printLine(circleOfNumbers(a, fin))
    }

    fun circleOfNumbers(n: Int, firstNumber: Int): Int {

      return (firstNumber + n / 2) % n
    }
  }
}