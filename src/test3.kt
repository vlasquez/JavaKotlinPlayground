import kotlin.math.min


/*
 Maximum Units on a Truck

You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:

    numberOfBoxesi is the number of boxes of type i.
    numberOfUnitsPerBoxi is the number of units in each box of the type i.

You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck. You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.

Return the maximum total number of units that can be put on the truck.

Example 1:

Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
Output: 8
Explanation: There are:
- 1 box of the first type that contains 3 units.
- 2 boxes of the second type that contain 2 units each.
- 3 boxes of the third type that contain 1 unit each.
You can take all the boxes of the first and second types, and one box of the third type.
The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8.

Example 2:

Input: boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize = 10
Output: 91

*/

/*private fun maximumUnits(boxTypes: Array<Array<Int>>, truckSize: Int): Int {
/*    Arrays.sort(boxTypes) { a: Array<Int>, b: Array<Int> ->
        println("b:${b[1]}, a:${a[1]} = ${b[1] - a[1]}")
        b[1] - a[1]
    }*/
    boxTypes.sortByDescending { it[1] }

    var result = 0
    var mTruckSize = truckSize
    boxTypes.forEach {
        val count = min(it[0], mTruckSize)
        result += count * it[1]
        mTruckSize -= count
        if (mTruckSize == 0) return result
    }
    return result
}

fun main(args: Array<String>) {
    val boxTypes = arrayOf(arrayOf(5, 10), arrayOf(2, 5), arrayOf(4, 7), arrayOf(3, 9))
    val truckSize = 10
    println(maximumUnits(boxTypes, truckSize))
    "asd".tr
    val studentMap = mutableMapOf<String,Int>()
    studentMap.for_, vEach { fdo, u ->  }


}*/