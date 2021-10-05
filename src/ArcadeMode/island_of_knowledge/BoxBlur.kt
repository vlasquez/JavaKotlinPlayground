package ArcadeMode.island_of_knowledge


fun main(args: Array<String>) {
    print(boxBlur(mutableListOf(mutableListOf(7, 4, 0, 1),
            mutableListOf(5, 6, 2, 2),
            mutableListOf(6, 10, 7, 8),
            mutableListOf(1, 4, 2, 0))))
}

fun boxBlur(image: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    var upper = 0
    var down = 0
    val blurArray = MutableList(image.size - 2) { MutableList(image[0].size - 2) { 0 } }

    while ((image.size) - upper >= 3 &&(image[0].size) - down >= 3) {
        var result = 0

        for (i in 0 until 3) {
            for (j in 0 until 3) {

                result += image[upper + i][down + j]
            }
        }
        blurArray[upper][down] = (result / 9)
        if ((image[0].size - 1) - down >= 3) {
            down++
        } else {
            upper++
            down = 0
        }


    }
    return blurArray
}