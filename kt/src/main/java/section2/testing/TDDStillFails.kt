package section2.testing

import atomictest.*
import atomictest.eq

fun calculateBMI(lbs: Int, height: Int): String {
    return "Overweight"
}

fun main() {
    calculateBMI(1, 2) eq "Overweight"
}