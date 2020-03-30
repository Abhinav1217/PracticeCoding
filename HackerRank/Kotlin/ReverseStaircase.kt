
object ReverseStaircase {

// Complete the staircase function below.
fun simpleStaircase(n: Int) {
    for (i in 1 until n + 1) {
        for (j in 1 until n + 1) {
            if (i + j > n) {
                print("#")
            } else {
                print(" ")
            }
        }
        println("")
    }
}

@JvmStatic
fun main(args: Array<String>) {
    val n = 6
    simpleStaircase(n)
}
}
