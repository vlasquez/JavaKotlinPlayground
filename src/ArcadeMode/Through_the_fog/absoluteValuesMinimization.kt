package ArcadeMode.Through_the_fog

import kotlin.math.abs


fun main(args: Array<String>) {
    print(absoluteValuesSumMinimization(mutableListOf(2,3)))
}

/*fun absoluteValuesSumMinimization(a: MutableList<Int>): Int {
    var result = 0

    var min = 0
    a.forEach{item ->
        var sum = 0
        a.forEach{nested->
            sum+= Math.abs(item-nested)
        }

        if(min==0){
            min = sum
            result = item
        }
        if (sum<min){
            min = sum
            result = item
        }else if(sum==min){
            if(item<result){
                result= item
            }
        }
    }

    return result
}*/

fun absoluteValuesSumMinimization(a: MutableList<Int>): Int  = a[a.lastIndex/2]
