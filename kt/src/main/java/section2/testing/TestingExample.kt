package section2.testing

import atomictest.*
import atomictest.eq

fun main() {
    val v1 = 11
    val v2 = "Ontology"

    v1 eq 11
    v2 eq "Ontology"

    v2 eq "aaa"
}