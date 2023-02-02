
class Sol {

protected long largestPrimeFactor(long num) {
    while (true) {
        long factor = getSmallestPrimeFactor(num);
        if (factor < num) {
           num =  num / factor;
        } else {
            return num;
        }
    }
}


protected long getSmallestPrimeFactor(long input) {

    /**
     * Fundamentals of Mathematics
     * 1. Negative numbers, `0` and `1`, are not prime.
     * 1. `2` is the only even prime number. It is also the smallest prime number.
     * 2. `3` is smallest odd prime number.
     * 3. Incrementing by `+2` instead of `+1` will skip all even numbers, halving our loops.
     * 4. You only need to loop through sqrt of number to find all divisable numbers.
     */
    if (input == 2L) {
        return input;
    }

    for (int i = 3; i <= Math.sqrt(input); i=i+2) {
        if (input % i == 0L) {
            return i;
        }
    }
    return input;
}


public static void main(String args[]) {

    Long n = 600_851_475_143L;
    System.out.println((new Sol()).largestPrimeFactor(n));
}

}
