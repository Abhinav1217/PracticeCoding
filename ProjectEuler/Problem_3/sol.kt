const val n: Long = 600_851_475_143

fun main() {
    println(largestPrimeFactor(n))
}

fun largestPrimeFactor(input: Long): Long {
    var num: Long = input   // because in kotlin, only val is allowed as function arguments.
    while (true) {
        var factor:Long = getSmallestPrimeFactor(num)
        if (factor < num) {
           num =  num / factor;
        } else {
            return num;
        }
    }
}

fun getSmallestPrimeFactor(input: Long): Long {

    /**
     * Fundamentals of Mathematics
     * 1. Negative numbers, `0` and `1`, are not prime.
     * 1. `2` is the only even prime number. It is also the smallest prime number.
     * 2. `3` is smallest odd prime number.
     * 3. Incrementing by `+2` instead of `+1` will skip all even numbers, halving our loops.
     * 4. You only need to loop through sqrt of number to find all divisable numbers.
     */
    if (input == 2L) {
        return input
    } // early exit
    for (i in 3..Math.sqrt(input.toDouble()).toLong() step 2) {
        if (input % i == 0L) {
            return i
        }
    }
    return input
}
