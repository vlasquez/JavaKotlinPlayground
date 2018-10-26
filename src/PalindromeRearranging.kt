class PalindromeRearranging {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      //val a: MutableList<Int> = arrayListOf(-1000, 0, -2, 0)
      val a: String = "abbcabb"
      PlaygroundJava.printLine(palindromeRearranging(a))
    }

    fun palindromeRearranging(string: String): Boolean {
      var set : MutableSet<Char> = mutableSetOf()
      var sum = 0

      for (c in string) {

       set.add(c)
      }

      for(c in set){
        sum+= string.count { c1: Char -> c1 == c  } %2
      }
      return sum <= 1
    }
  }
}