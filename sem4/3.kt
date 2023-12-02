fun GetNumOfUniqueElements(array: Array<Int>): Int {
    if(array.isEmpty())
        return 0

    var count = 1
    var cur = array[0]
    for(element in array) {
        if(cur < element) {
            ++count
            cur = element
        }
    }
    return count
}

fun main() {
    // the user enters a sorted array of numbers separated by a space
    val nums_str = readln().split(' ').toTypedArray()
    val ints = nums_str.map { it.toInt() }.toTypedArray()
    println(GetNumOfUniqueElements(ints)) // correct answer is 5
}