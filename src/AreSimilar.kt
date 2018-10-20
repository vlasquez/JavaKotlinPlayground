import java.util.Arrays

class AreSimilar {
  companion object {
    @JvmStatic
    fun main(args: Array<String>){
      val a : MutableList<Int> = arrayListOf(4, 6, 3)
      val b : MutableList<Int> = arrayListOf(4, 6, 3)
      PlaygroundJava.printLine(areSimilar(a,b))
    }
    private fun areSimilar(a: MutableList<Int>, b: MutableList<Int>): Boolean {
      return a.sorted() == b.sorted() && a.zip(b).filter { it.first != it.second }.count() < 3
    }
    private fun areSimilarNaive(a: MutableList<Int>, b: MutableList<Int>): Boolean{
      a.sort()
      b.sort()
      var count : Int = 0
      if(a.size != b.size){
        return false
      }
      for(i in 0 until a.size){
        if(a[i] != b[i]){
          ++count        }
      }

       a.sort()

       b.sort()
      return a == b && count <3
    }
  }
}