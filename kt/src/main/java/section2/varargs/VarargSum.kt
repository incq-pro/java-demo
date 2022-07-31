package section2.varargs

fun sum(vararg x: Int): Int {
    var result = 0
    for (i in x) {
        result += i
    }
    return result
}

fun main() {
    println(sum(1, 2, 3, 4, 5, 6))
}