/**
 * Note that Maximum product is
 *  999x999 = 998001
 * which fits the range of Int.
 */

fun largestPalindrome(): Int {

    var res = 0;

    /**
     * Since we are looking for "Largest" palindrome, we go from higher to lower
     */
    for (i in 1000 downTo 100 ) {
        for (j in 1000 downTo 100) {
            var product = i * j;
            if (isPalindrome(product)) {
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

fun isPalindrome(num: Int): Boolean {
    val str = num.toString();
    /**
     * we check if first letter is same as last letter,
     * and meet at middle.
     */
    for (i in 0 .. (str.length / 2)){
        if (!str[i].equals(str[str.length-i-1])){

            return false
        }
    }
    return true
}

 fun main(){
    println(largestPalindrome())
 }
