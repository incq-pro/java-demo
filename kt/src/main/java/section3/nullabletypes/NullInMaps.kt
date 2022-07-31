package section3.nullabletypes

import atomictest.*
import atomictest.eq

fun main() {
    val m = mapOf(1 to "a", 2 to "b")
    m[3] eq null
}