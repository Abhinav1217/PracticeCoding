`object DiagnoalDifference {
    fun difference(arr: Array<IntArray>): Int {
        // Initialize sums of diagonals
        var d1 = 0
        var d2 = 0
        for (i in 0 until arr.size) {
            d1 += arr[i][i]
            d2 += arr[i][arr.size - i - 1]
        }

        // Absolute difference of the sums
        // across the diagonals
        return Math.abs(d1 - d2)
    }

    /* Driver program to test above function */
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = arrayOf(
            intArrayOf(11, 2, 4),
            intArrayOf(4, 5, 6),
            intArrayOf(10, 8, -12)
        )
        println(difference(arr))
    }
}
