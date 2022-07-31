package section2.constructors

class Scientist(val name: String) {
    override fun toString(): String = "Scientist($name)"
}

fun main() {
    val s = Scientist("mayun")
    println(s)
}