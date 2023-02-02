
/**
 * Fundamentals of Mathematics.
 * 1. Every integer is a product of prime numbers.
 * 2. If we divide the integer with its smallest prime factor,
 *    then the last prime factor remaining is the largest prime.
 */


class PrimeFactor {

    public largestFactor(n: number): number {
        while(true) {
            var factor = this.primeFactor(n);
            if (factor < n) {
                n /= factor;
            } else {
                return n;
            }
        }
    }

    public primeFactor(n: number): number {

        if (n % 2 === 0) return 2;

        /**
         * Fundamentals of Mathematics
         *  1. 2 is the only even prime number.
         *  2. 3 is smallest odd prime number.
         *  3. Incrementing +2 instead of +1 will skip all even numbers, halving our loops.
         *  4. You only need to loop through sqrt of number to find all divisable numbers.
         */

        for (let i = 3, s = Math.sqrt(n); i <= s; i += 2) {
            if (n % i === 0) {
                return i;
            }
        }
        return n;
    }

}

// let n = 13195;
let n = 600_851_475_143;

console.log(new PrimeFactor().largestFactor(n))
