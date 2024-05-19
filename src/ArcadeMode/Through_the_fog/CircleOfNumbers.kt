package ArcadeMode.Through_the_fog

fun main(args: Array<String>) {
    print(circleOfNumbers(10,7))
}

/*fun circleOfNumbers(n: Int, firstNumber: Int): Int {
    val uppNumber = mutableListOf<Int>()
    val downNumber = mutableListOf<Int>()
    var result = 0
    var i = 0

    while(i<n/2){
        uppNumber.add(i)
        downNumber.add((n/2)+i)
        i++
    }

    var k = 0; var l = 0
    while (k<uppNumber.size && l<downNumber.size){
        if(uppNumber[k]==firstNumber){
            result = downNumber[l]
        }
        else if (downNumber[l]==firstNumber){
            result = uppNumber[k]
        }
        k++
        l++
    }


    return result
}*/
fun circleOfNumbers(n: Int, firstNumber: Int): Int {

    return (n/2 + firstNumber)%n
}