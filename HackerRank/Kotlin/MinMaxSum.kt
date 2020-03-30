object MinMaxSum {
    // Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>) {

arr.sort()
// Long is 64bit integer.
var min: Long = 0
var max: Long = 0

for (i in 0 until arr.size - 1) {
    min += arr[i]
}

for (i in 1 until arr.size) {
    max += arr[i]
}

println("$min $max")
}

@JvmStatic
fun main(args: Array<String>) {
    val arr = arrayOf(396285104, 573261094, 759641832, 819230764, 364801279)
    miniMaxSum(arr)
}
}
