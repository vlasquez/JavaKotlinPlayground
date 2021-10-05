package Tournaments

import Main.PlaygroundJava

class CreateAnagram {
  companion object {
      @JvmStatic
      fun main(args: Array<String>) {
        var s = "AABAA"
        var t = "BBAAA"

        PlaygroundJava.printLine(createAnagram(s,t))
      }

    fun createAnagram(s:String, t: String): Int{
      var hs = HashMap<Char,Int>()
      var ht = HashMap<Char,Int>()
      var count = 0
      for(c in s) {
        if (hs.containsKey(c)) {
          var i = hs[c]!! + 1
          hs[c] = i
        } else {
          hs[c] = 1

        }
      }
        for(c in t){

        if(ht.containsKey(c)){
          var i = ht[c]!! + 1
          ht[c] = i
        }
        else{
          ht[c] = 1
        }
        }
      for(c in ht){
        if(!hs.containsKey(c.key)){
          count++
        }
        else if(hs[c.key]!! < c.value){
          count++
        }
      }
      return count
    }
  }

}