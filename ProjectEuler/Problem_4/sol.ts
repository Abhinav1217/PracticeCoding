/**
 * Note that Maximum product is
 *  999x999 = 998001
 * which fits the range of int.
 */

class Palindrome {

    public static largestPalindrome(): number {

        let res = 0;

        /**
         * Since we are looking for "Largest" palindrome, we go from higher to lower
         */
        for (var i = 1000; i > 100; i--) {
            for (var j = 1000; j > 100; j--) {
                let product = i * j;
                if ((new Palindrome()).isPalindrome(product)) {
                   /**
                    * We could have added an AND clause in above condition
                    * but this way, we can break and reduse loop cycles.
                    */
                    if (product > res) {
                        res = product;
                    } else {
                        break;
                    }
                }

                /**
                 * We can probably make an early break via conditions, here too,
                 * to reduce the loop cycle, but logic is yet to be tested.
                 */
            }
        }
        return res;
    }


    private isPalindrome(num: number): boolean {
        let str = num.toString();
        /**
         * we check if first letter is same as last letter,
         * and meet at middle.
         */
        for (let i = 0; i < (str.length / 2); i++){
            if (str[i] !== str[str.length-i-1]){
                return false
            }
        }
        return true
    }
}

console.log(Palindrome.largestPalindrome())
