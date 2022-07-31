package section2.constructors

class Allen(name : String) {
    val greeting = "Poor $name"
}

fun main() {
    val a = Allen("mayun")
    println(a.greeting)
//    val b = Allen()
}
