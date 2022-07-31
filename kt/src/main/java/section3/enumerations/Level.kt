package section3.enumerations

import atomictest.*
import atomictest.eq

enum class Level {
    Overflow, High, Medium, Low, Empty
}

fun main() {
    Level.Overflow eq "Overflow"
}