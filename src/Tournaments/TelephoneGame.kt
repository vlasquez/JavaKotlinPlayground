package Tournaments

import Main.PlaygroundJava

class TelephoneGame {
  companion object {
    @JvmStatic
    fun main(args:Array<String>){
      var inputString = arrayListOf<String>("abc",
          "cba")
      PlaygroundJava.printLine(telephoneGame(inputString))
    }
    fun telephoneGame(messages: MutableList<String>): Int {
      var index = -1
      for(i in 1 until messages.size){
        if(messages[0] != messages[i]){
          index = i
          break
        }
      }
      return index
    }
  }
}