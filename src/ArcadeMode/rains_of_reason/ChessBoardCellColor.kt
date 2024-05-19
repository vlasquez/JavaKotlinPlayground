package ArcadeMode.rains_of_reason

fun main(args: Array<String>) {
    print(chessBoardCellColor("C8","H1"))
}

fun chessBoardCellColor(cell1: String, cell2: String): Boolean {
    val letterMap = hashMapOf<String, Int>(
        "A" to 1,
        "B" to 2,
        "C" to 3,
        "D" to 4,
        "E" to 5,
        "F" to 6,
        "G" to 7,
        "H" to 8
    )

    if((letterMap.getValue(cell1[0].toString()) % 2 == 0) == (cell1[1].toInt() % 2 == 0)
        && ((letterMap.getValue(cell2[0].toString()) % 2 == 0)) == (cell2[1].toInt() % 2 == 0)){
        return true
    }
    if((letterMap.getValue(cell1[0].toString()) % 2 == 0) == ((letterMap.getValue(cell2[0].toString()) % 2 == 0))
        &&(cell1[1].toInt() % 2 == 0) == (cell2[1].toInt() % 2 == 0)){
        return true
    }

    if((letterMap.getValue(cell1[0].toString()) % 2 == 0) == (cell2[1].toInt() % 2 == 0) && ((letterMap.getValue(cell2[0].toString()) % 2 == 0))
        == (cell1[1].toInt() % 2 == 0)){
        return true
    }

    return false
}