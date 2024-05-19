import Main.isValid
import java.math.BigInteger

fun main(args: Array<String>) {
    var s = "1"
   for (i:Int in 0..400){
       s += s
    }

    println(solution(s))
}

fun solution(s:String): Int {
    var number = s.toBigInteger(2)
    var operations = 0

    while (number != BigInteger.ZERO){
        if(number.mod(2.toBigInteger())== BigInteger.ZERO){
            number = number.div(2.toBigInteger())
            operations++
        }else{
            number = number.minus(BigInteger.ONE)
            operations++
        }
    }
    return operations
}