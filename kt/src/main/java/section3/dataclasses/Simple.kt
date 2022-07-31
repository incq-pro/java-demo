package section3.dataclasses

import atomictest.*
import atomictest.eq

data class Simple(
    var arg1: String,
    var arg2: Int,
)

fun main() {
    var v1 = Simple("s", 1)
    var v2 = Simple("s", 1)
    v1.arg1 eq "s"
    v1.arg2 eq 1
    v1 eq "Simple(arg1=s, arg2=1)"
    v1 eq v2
}