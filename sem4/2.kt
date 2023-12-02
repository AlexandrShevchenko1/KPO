fun main(args: Array<String>) {
    val input = readln()
    val strs = input.split(' ').toTypedArray()
    println(input)
    for (i in 1..3) {
        println(strs.last())
    }
}