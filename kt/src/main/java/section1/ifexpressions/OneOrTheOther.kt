package section1.ifexpressions

fun oneOrTheOther(exp: Boolean): String =
    if (exp)
        "True"
    else
        "False"


fun main() {
    var r = oneOrTheOther(true)
    println(r)
    r = oneOrTheOther(false)
    println(r)
}