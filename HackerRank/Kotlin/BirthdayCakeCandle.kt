object BirthdayCakeCandle {

    // Complete the birthdayCakeCandles function below.
    fun birthdayCakeCandles(ar: Array<Int>): Int {
        ar.sortDescending()
        // println(ar.joinToString())
        var count = 0
        for (i in ar.indices){
            if (ar[0] == ar[i]){
                count++
            }
            
        }
        return count
    }

    @JvmStatic
    fun main(args: Array<String>) {

        val ar = arrayOf(3, 2, 1, 3)
        val result = birthdayCakeCandles(ar)

        println(result)
    }
}
