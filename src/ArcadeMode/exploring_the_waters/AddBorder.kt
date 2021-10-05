package ArcadeMode.exploring_the_waters

import Main.PlaygroundJava

class AddBorder {
  companion object {
    @JvmStatic
    fun main(args: Array<String>){
      val s : MutableList<String> = arrayListOf("aa","**","zz")
      PlaygroundJava.printLine(addBorder(s))
    }
    private fun addBorder(list: MutableList<String>): MutableList<String> {
      var char = "*"
      for(i in 0 until list.size){
        list[i] = char+list[i]+char
      }
      var length = list[0].length
      char = char.repeat(length)
      list.add(0,char)
      list.add(list.size,char)
      return list
    }
  }
}