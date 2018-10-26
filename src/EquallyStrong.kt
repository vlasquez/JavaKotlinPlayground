class EquallyStrong {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      //val a: MutableList<Int> = arrayListOf(-1000, 0, -2, 0)
      val yourLeft: Int = 10
      val yourRight: Int = 15
      val friendsLeft: Int = 10
      val friendsRight: Int = 15
      PlaygroundJava.printLine(equallyStrong(yourLeft, yourRight, friendsLeft, friendsRight))
    }

    fun equallyStrong(yourLeft: Int, yourRight: Int, friendsLeft: Int, friendsRight: Int): Boolean {
      return maxOf(yourLeft,yourRight) == maxOf(friendsLeft,friendsRight) && minOf(friendsLeft,friendsRight)== minOf(yourLeft,yourRight)
    }

  }

}