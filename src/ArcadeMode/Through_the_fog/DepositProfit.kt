package ArcadeMode.Through_the_fog

import kotlin.math.ceil
import kotlin.math.ln

fun main(args: Array<String>) {
    print(depositProfit(1,1,200))
}

/*fun depositProfit(deposit: Int, rate: Int, threshold: Int): Int {
    var result = 0
    var profit = deposit.toDouble()

    while(profit<threshold){
        profit += (profit*rate)/100
        result++
        println(profit)
    }
ceil(ln((threshold/deposit).toDouble())/ ln((rate/100+1).toDouble()))
    return result
}*/

fun depositProfit(deposit: Int, rate: Int, threshold: Int): Int {
    return ceil(ln((threshold/deposit.toDouble()))/ ln((rate+1/100.toDouble()))).toInt()
}
