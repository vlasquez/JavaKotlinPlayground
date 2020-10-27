package ArcadeMode.rains_of_reason

fun main(args: Array<String>) {
    print(alphabeticShift("aaaabbbccd"))
}


fun alphabeticShift(inputString: String): String {
    var result: String = ""
    inputString.forEachIndexed { index, c ->
        result += (c.toInt() + 1).toChar()
        result = result.replace('{', 'a')
    }
    return result
}