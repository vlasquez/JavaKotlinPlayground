package Tournaments

import Main.PlaygroundJava

class AlphabetSubsequence {
  companion object {
    @JvmStatic
    fun main(args:Array<String>){
    var s = "effg"
      PlaygroundJava.printLine(alphabetSubsequence(s))
    }
    fun alphabetSubsequence(s:String):Boolean{
      for(c in 1 until s.length){
        if(s[c]<= s[c-1]){
          return false
        }
      }
      return true
    }
  }
}