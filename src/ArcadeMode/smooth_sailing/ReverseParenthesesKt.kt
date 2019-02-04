package ArcadeMode.smooth_sailing

import Main.PlaygroundJava

class ReverseParenthesesKt {
  companion object {
    @JvmStatic
    fun main(args: Array<String>){
      val s = "a(bcdefghijkl(mno)p)q"
      val s2 = "co(de(fight)s)"
      PlaygroundJava.printLine(
          reverseParentheses(s2))
    }
    private fun reverseParentheses(s: String): String {

      val start = s.lastIndexOf("(")+1
      val end = s.indexOf(")")
      var stringInParentheses=""
      if (start != -1 && end != -1){
        stringInParentheses = s.removeRange(start,start)
        stringInParentheses = s.removeRange(end,start)
      }
      else{
        return stringInParentheses
      }
      return reverseParentheses(stringInParentheses)
    }
  }



}