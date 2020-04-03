object DivisableSumPair {

    fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {

        var count = 0
        var sum:Int

        for (i in 0 until (n - 1)) {
            for (j in (i+1) until (n)){
                sum = ar[i] + ar[j]
                if (sum % k == 0) { count++ }
            }
        }

        return count
    }

    @JvmStatic
    fun main(args: Array<String>) {
        
        var n:Int           // integer Length of array
        var k:Int           // Integer to divide the pair sum by
        var ar:Array<Int>   // Array of Integers

        println("Scenerio 0")
        n = 6
        k = 3
        ar = arrayOf(1,3,2,6,1,2)

        println(divisibleSumPairs(n,k,ar)) // 5

        println("Scenerio 1")
        n = 6
        k = 5
        ar = arrayOf(1,2,3,4,5,6)
        
        println(divisibleSumPairs(n,k,ar)) // 3
    }
}
