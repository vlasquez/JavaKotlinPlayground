package Tournaments

import Main.PlaygroundJava

class CountIncreasingSequences {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      var n = 1
      var k = 4

      PlaygroundJava.printLine(countIncreasingSequences(n,k))
    }

    fun countIncreasingSequences(n: Int, k: Int):Int{
      //N!/K!*(n-k)!
      var kfact = 1
      var nfact2 = 1
      var nkfact = 1
      for (i in 1 .. k){
        kfact *= i
      }

      for(i in 1..n){
        nfact2 *= i
      }
      for(i in 1..(n-k)){
        nkfact*=i
      }
      return(kfact*nkfact)/(nfact2)

    }
  }
}