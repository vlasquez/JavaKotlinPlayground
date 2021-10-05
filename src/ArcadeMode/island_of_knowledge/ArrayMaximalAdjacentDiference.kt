package ArcadeMode.island_of_knowledge

import Main.PlaygroundJava

class ArrayMaximalAdjacentDiference {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val a: MutableList<Int> = arrayListOf(2,4,1,0)

      PlaygroundJava.printLine(
          arrayMaximalAdjacentDifference(
              a))
    }

    fun arrayMaximalAdjacentDifference(list:MutableList<Int>): Int {
      var maximalAdjacentDiference: Int = 0

      for(i in 1 until list.size-1){
        var tmp = maxOf(maximalAdjacentDiference,Math.abs(list[i]-list[i+1]))
        maximalAdjacentDiference = maxOf(maximalAdjacentDiference,tmp)
      }

    return maximalAdjacentDiference
    }

  }
}