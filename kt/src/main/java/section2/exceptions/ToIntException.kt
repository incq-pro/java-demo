package section2.exceptions

import atomictest.*
import atomictest.capture
import atomictest.eq


fun erroneousCode() {
    val i = "1$".toInt()
}

fun main() {
    capture {
        "1$".toInt()
    } eq "NumberFormatException: " +
            """For input string: "1$""""

    "1$".toIntOrNull() eq null
}