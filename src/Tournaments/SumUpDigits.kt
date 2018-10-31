package Tournaments

import Main.PlaygroundJava

class SumUpDigits {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      var inputString = "2 apples, 12 oranges"
      PlaygroundJava.printLine(sumUpDigits(inputString))
    }


    fun sumUpDigits(inputString: String): Int {
      var a = inputString.replace("\\D+".toRegex(),"")
      if(a.isEmpty()){
        return 0
      }

      var sum = 0
      for(i in a){
        //print(i)
        if(i.toString() != ""){
          sum+=i.toString().toInt()

        }
      }
      return sum
    }
  }
}