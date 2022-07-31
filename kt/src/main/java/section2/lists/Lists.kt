package section2.lists

import atomictest.*
import atomictest.eq


fun main() {
    val ints = listOf(1, 2, 3, 4, 5, 6)
    ints eq "[1, 2, 3, 4, 5, 6]"   // [1]
    var result = ""
    for (i in ints) {
        result += "$i "
    }
    result eq "1 2 3 4 5 6"
}