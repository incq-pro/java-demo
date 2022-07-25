package section1.functions

fun multiplyByThree(x: Int) = x * 3

fun multiplyByFour(x: Int): Int = x * 4

fun main() {
    var r = multiplyByThree(3)
    println(r)

    r = multiplyByFour(4)
    println(r)
}