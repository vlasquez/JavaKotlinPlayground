package ArcadeMode.rains_of_reason

fun main(args: Array<String>) {
    print(arrayReplace(mutableListOf(3, 2, 3), 1, 3))
}

fun arrayReplace(inputArray: MutableList<Int>, elemToReplace: Int, substitutionElem: Int): MutableList<Int> {
    inputArray.replaceAll { e ->
        if (e == elemToReplace)
            substitutionElem
        else
            e
    }
    return inputArray
}
