package ArcadeMode.rains_of_reason

fun main(args: Array<String>) {
    print(alphabeticShift("crazy"))
}


fun alphabeticShift(inputString: String): String {
    var result: String = ""
    return inputString.fold(""){
        str, c -> str + if(c=='z') 'a' else c.inc()
    }
}