package Tournaments

import Main.PlaygroundJava

class SqrtSumOfSquares {
  companion object {
    @JvmStatic
    fun main(args:Array<String>){
      var inputString = 5
          PlaygroundJava.printLine(sqrt(inputString))
    }
    fun sqrt(n: Int): Int {
      var nt = 0
      for (i in 1..n){
        nt+=(Math.pow(i.toDouble(),2.toDouble())).toInt()
      }
      return nt
    }
  }
}