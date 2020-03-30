object PlusMinusRatio {
// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>) {

var posCount = 0.0
var negCount = 0.0
var zeroCount = 0.0
val size = arr.size

    for (i in arr.indices) {
        when {
           (arr[i] == 0) -> zeroCount += 1
           (arr[i] < 0) -> negCount += 1
         (arr[i] > 0) -> posCount += 1
        }
    }

println("%.6f".format(posCount / size))
println("%.6f".format(negCount / size))
println("%.6f".format(zeroCount / size))
}

@JvmStatic
fun main(args: Array<String>) {

val arr = arrayOf(-4, 3, -9, 0, 4, 1)
    plusMinus(arr)
}
}
