package ArcadeMode.exploring_the_waters

import Main.PlaygroundJava

class ArrayChange {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      //val a: MutableList<Int> = arrayListOf(-1000, 0, -2, 0)
      val a: MutableList<Int> = arrayListOf(2,1,10,1)
      PlaygroundJava.printLine(arrayChange(a))
    }

    fun arrayChange(list: MutableList<Int>): Int {
      var count = 0

      for(i in 1 until list.size){
        while(list[i]<=list[i-1]){
          ++count
          ++list[i]
        }
      }
      return count
    }
    }
}