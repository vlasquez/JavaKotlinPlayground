package Tournaments

import Main.PlaygroundJava

class StringsConstruction {
  companion object {
    @JvmStatic
    fun main(args: Array<String>){
      var s = "abs"
      var x = "abccba"
      PlaygroundJava.printLine(stringsConstruction(s,x))
    }
    fun stringsConstruction(a:String,b:String) : Int{
      var st  = 0
      for(c in a){
        var c = (b.count { c1: Char -> c1 == c  })
        if(st<c){
          st = c
        }
        if(c==b.length){
          st=a.length
        }
      }
      return st

    }
  }
}