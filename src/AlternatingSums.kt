class AlternatingSums {

  companion object {
    @JvmStatic
    fun main(args: Array<String>){
      val s : MutableList<Int> = arrayListOf(50,60,60,45,70)
      PlaygroundJava.printLine(alternatingSums(s))
    }
    private fun alternatingSums(list: MutableList<Int>): MutableList<Int> {
      var weight = arrayListOf<Int>(0,0)

      for (i in 0 until list.size){
        if(i == 0 || i % 2!=1 ){
          var weightSum = weight[0]+list[i]
          weight[0] = weightSum
        }
        else{
          var weightSum = weight[1]+list[i]
          weight[1] = weightSum
        }
      }

      return weight
    }
  }
}