object BirthdayChocolate {

    fun birthday(s: Array<Int>, d: Int, m: Int): Int {

        var no_of_ways = 0
        var sum = 0

        // Edge Cases
        if (s.size < m){
            return 0
        } else if (s.size == m) {
            for (ival in s){
                sum += ival
            }
            if (sum < d) {
                return 0
            } else if (sum == d) {
                return 1
            }
        }
      
        // Sliding window
        // for kotlin `until` you need to add 1 to arr.size for the <= condition
        for (i in 0 until (s.size - m + 1)){
        sum = 0
            for (j in i until (i+m)) {
                sum += s[j]
            }

            if (sum == d) {
                no_of_ways++
            }
        }

        return no_of_ways
    }


    @JvmStatic
    fun main(args: Array<String>) {
        
        var s:Array<Int>    // Numbers on the chocolate square
        var d:Int           // Birth Day
        var m:Int           // Birth Month


        //  Sample 0
        s = arrayOf(1, 2, 1, 3, 2) 
        d = 3 
        m = 2 

        println (birthday(s,d,m)) // 2

        
        // Sample 1
         s = arrayOf(4) 
         d = 4 
         m = 1 

        println (birthday(s,d,m)) // 1
        
        // Sample 2
         s = arrayOf(1, 1, 1, 1, 1, 1) 
         d = 3 
         m = 2 

        println (birthday(s,d,m)) // 0

        // Sample 3
        s = arrayOf(2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1)
        d = 18
        m = 7

        println (birthday(s,d,m)) // 3

    }
}
