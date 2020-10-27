package ArcadeMode.rains_of_reason

fun variableName(name: String): Boolean {

    name.forEach {
        if (it.toInt() in 32..47)
            return false
        if (it.toInt() in 91..94)
            return false
        if (it.toInt() == 96)
            return false
        if (it.toInt() in 123..126)
            return false
    }
    return !name.contains('-') && !name[0].isDigit() && name[0] != ' '
}