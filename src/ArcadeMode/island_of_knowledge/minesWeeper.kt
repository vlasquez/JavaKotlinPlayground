package ArcadeMode.island_of_knowledge

fun main(args: Array<String>) {
    print(minesweeper(mutableListOf(mutableListOf(false, false, false),
            mutableListOf(false, false, false))))
}


fun minesweeper(matrix: MutableList<MutableList<Boolean>>): MutableList<MutableList<Int>> =
        (matrix.indices).map { i ->
            (matrix[i].indices).map { j ->
                matrix.slice(maxOf(0, i - 1)..minOf(i + 1, matrix.lastIndex))
                        .flatMap { it.slice(maxOf(0, j - 1)..minOf(j + 1, matrix[i].lastIndex)) }
                        .count { it } - if (matrix[i][j]) 1 else 0
            }.toMutableList()
        }.toMutableList()