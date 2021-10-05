package InterviewPractice

import Main.PlaygroundJava

class FirstNotRepeatingCharacter {
  companion object {
    @JvmStatic
    fun main(args:Array<String>){
      var inputString = "adsadsdsadsadsadsadasdsaadsdasadsasdadsadsadsadsdasadsadsadsadsdsasdaadsadsadsadsadsadsdsadasadsadsadsdasdasdsaadssdaadsadsasdasdadadsasdasdadsadsadsadsasdasdasdasddsaadsasdasdasdadsasdasdl"
      PlaygroundJava.printLine(firstNotRepeatingCharacter(inputString))
    }
    fun firstNotRepeatingCharacter(str: String): Char {
      var s: String = str
      for(c  in s){
        if(s.count { c1: Char -> c1 == c  }==1){
          return c
        }
        else if(s.length >1){
          s=s.replace(c.toString(),"")
        }
        else if(s.isNotEmpty()){
          return s.single()
        }
      }
      return '_'
    }
  }
}