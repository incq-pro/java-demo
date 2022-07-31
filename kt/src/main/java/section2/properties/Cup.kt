package section2.properties

class Cup {
    var percentFull = 0
}

fun main() {
    val c1 = Cup()
    val c2 = Cup()
    c1.percentFull = 50
    c2.percentFull = 60
    println(c1.percentFull)
    println(c2.percentFull)
}