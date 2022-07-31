package section3.color

class Color3(
    val red: Int = 0,
    val green: Int = 0,
    val blue: Int = 0,
) {
    override fun toString() = "($red, $green, $blue)"
}

fun main() {
    val c = Color3(red = 1, blue = 2)
    println(c)
}