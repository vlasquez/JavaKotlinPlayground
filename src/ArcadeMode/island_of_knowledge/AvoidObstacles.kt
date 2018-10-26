package ArcadeMode.island_of_knowledge

import Main.PlaygroundJava

class AvoidObstacles {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      var list = arrayListOf<Int>(1000,999)
      PlaygroundJava.printLine(avoidObstacles2(list))

    }

    fun avoidObstacles2(inputArray: MutableList<Int>): Int =
        (1..1000).first { jump -> inputArray.all { it % jump != 0 } }
  }
}
