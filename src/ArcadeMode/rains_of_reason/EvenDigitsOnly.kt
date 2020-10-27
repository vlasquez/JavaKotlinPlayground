package ArcadeMode.rains_of_reason

fun main(args: Array<String>) {
    print(evenDigitsOnly(642386))
}

fun evenDigitsOnly(n: Int): Boolean {
    var s = n.toString()
    var result = true
    s.forEach {
        if (it.toInt() % 2 != 0) {

            result = false
            return result
        }
    }
    return result
}