package section1.loopingandranges

fun main() {
    var sum = 0
    for (n in 10..100) {
        sum += n
    }
    println("sum is $sum")
}