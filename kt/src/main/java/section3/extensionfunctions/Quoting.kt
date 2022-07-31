package section3.extensionfunctions

import atomictest.eq


fun String.singleQuote() = "'$this'"

fun String.doubleQuote() = "\"$this\""

fun main() {
    "Hi".singleQuote() eq "'Hi'"
    "Hi".doubleQuote() eq "\"Hi\""
}