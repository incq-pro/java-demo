package section1.functions

fun multiplyByTwo(x: Int): Int {
    println("Inside multiplyByTwo")
    return x * 2
}

fun main() {
    var r = multiplyByTwo(1)
    println(r)
    r = multiplyByTwo(2)
    println(r)
}