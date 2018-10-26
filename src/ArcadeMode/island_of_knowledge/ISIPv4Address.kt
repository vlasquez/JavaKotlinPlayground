package ArcadeMode.island_of_knowledge

import Main.PlaygroundJava

class ISIPv4Address {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val a= "1.1.1.1a"

      PlaygroundJava.printLine(
          isIPv4Address(a))
    }

    fun isIPv4Address(ip: String): Boolean {
      var seg: List<String> = ip.split(".")

      if(seg.size!=4)
        return false
      else{
        for(a in seg ) {
          if(a == "" ||!a.matches("-?\\d+(\\.\\d+)?".toRegex())||(a.toLong() > 255)){
            return false
          }
        }
      }
      return true

    }
}
}