package interfaces

interface Computer {

    fun prompt(): String

    fun calculateAnswer(): Int

}

class Desktop : Computer {
    override fun prompt(): String = "Hello"
    override fun calculateAnswer(): Int = 11
}

class DeepThought : Computer {
    override fun prompt() = "Thinking..."
    override fun calculateAnswer() = 42
}

class Quantum : Computer {
    override fun prompt() = "Probably..."
    override fun calculateAnswer() = -1
}

fun main() {
    var computers = listOf(Desktop(), DeepThought(), Quantum())
    println(computers.map { it.calculateAnswer() })
}