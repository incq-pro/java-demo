package section4.lambdas

fun main() {
    var l = listOf<String>("1", "2", "3")
    var l2 = l.map({ i -> "[" + i + "]" })
    println(l2)
    var l3 = l.map { "[$it]" }
    println(l3)
}