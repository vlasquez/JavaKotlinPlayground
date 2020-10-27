package Main

fun main(args: Array<String>) {
    //print(alternatingSort(mutableListOf(1, 3, 5, 6, 4, 2)))
    //println(twoSum(intArrayOf(2,7,11,15), 9))
    //println(reverse())
    //println(isPalindrome())
    //print(romanToInt())
    //println(rotateImage(mutableListOf(mutableListOf(1, 2, 3), mutableListOf(4, 5, 6), mutableListOf(7, 8, 9))))
    theJanitor("abacaba")
    print(ex())
}

/** take the first element from an array, then the last, then the second, then the last but one in an alternating way.
return Boolean whether the elements are sorted **/
fun alternatingSort(a: MutableList<Int>): Boolean {
    var up = 0
    var result: Boolean
    val b = mutableListOf<Int>()
    var down = a.size - 1

    while (up <= a.size / 2) {
        if (b.size < a.size) {
            b.add(a[up])
            b.add(a[down])
        }

        up++
        down--
    }

    result = b.asSequence().zipWithNext { a, b -> a < b }.all { it }
    return result
}

/**
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */
fun twoSum(nums: IntArray, target: Int): IntArray {

    var targetMap = hashMapOf<Int, Int>()
    for (i in nums.indices) {
        val expectedIndex = target - nums[i]
        if (targetMap.containsKey(expectedIndex)) {
            return intArrayOf(i, targetMap[expectedIndex]!!)
        }
        targetMap[nums[i]] = i
    }
    throw IllegalArgumentException("No two sum solution")
}

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 */
fun reverse(x: Int = 1534236469): Int {
    var x = x
    var result: Long = 0
    while (x != 0) {
        val pop = x % 10
        x /= 10
        result = result * 10 + pop
        if (result > Int.MAX_VALUE || result < Int.MIN_VALUE) {
            return 0
        }

    }
    return result.toInt()
}

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */

fun isPalindrome(x: Int = 1234567899): Boolean {
    return try {
        x > 0 && x.toString().reversed().toInt() == x

    } catch (ex: NumberFormatException) {
        false
    }
}

/**For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
 **/
fun romanToInt(s: String = "MCMXCIV"): Int {

    val rome = hashMapOf<Char, Int>('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
    var number = 0
    for (i in s.indices) {

        number += if (i > 0 && rome[s[i - 1]]!! < rome[s[i]]!!) {
            rome[s[i]]!! - 2 * rome[s[i - 1]]!!
        } else {
            rome[s[i]]!!
        }
    }
    return number
}

fun rotateImage(a: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {

    var rotated = MutableList(a.size) { MutableList(a.size) { 0 } }
    for (i in 0 until a.size) {
        for (j in 0 until a[0].size) {
            val temp = a[i][j]
            rotated[j][(a.size - 1) - i] = temp
        }
    }
    return rotated
}

fun sss(n: Int = 2124, k: Int = 1): Int {
    var result = 0
    var s = n.toString()

    for (element in s) {
        if (s.length < k) break
        val divisor = s.take(k).toInt()
        if (n % divisor == 0) {
            result++
        }
        s = s.replace(element.toString(), "", false)
    }

    return result
}

fun theJanitor(word: String): MutableList<Int> {
    var janitorwith = mutableListOf<Int>()
    for (c in "abcdefghijklmnopqrstuvwxyz") {
        val lastIndex = word.lastIndexOf(c)
        if (lastIndex != -1) {
            val firstIndex = word.indexOf(c)
            janitorwith.add(lastIndex - firstIndex + 1)
        } else {
            janitorwith.add(0)
        }
    }
    janitorwith.filter {
        it > 2
    }
    return janitorwith
}

fun ex(array: MutableList<Int>? = mutableListOf(-5, 4, -2, 3, 1, -1, -6, -1, 0, 5)): Int {
    var res = 10
    array!!.forEach {
        if (res < 1) {
            return res
        }
        res += it
    }
    return res
}
