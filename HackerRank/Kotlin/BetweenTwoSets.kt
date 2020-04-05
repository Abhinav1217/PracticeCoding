object BetweenTwoSets{



    /** Get Greatest common factor between two numbers */
    fun getGCF(a:Int, b:Int):Int {
        if (a == 0){
            return b
        }
        return getGCF(b%a, a)
    }

    /** get Greatest common factor between set of numbers represented by array of Int */
    fun getGCF(a:Array<Int>):Int {

        var result = a[0]
        for (i in 1 until a.size ) {
            result = getGCF(result, a[i])
        }
        return result
    }

    /** Get Least Common Multiple between two numbers */
    fun getLCM(a:Int, b:Int):Int {
        return ((a*b)/getGCF(a,b))
    }


    /** get Least Common Multiple between set of numbers represented by array of Int */
    fun getLCM(a:Array<Int>):Int {
        var result = a[0]
        for (i in 1 until a.size ) {
            result = getLCM(result, a[i])
        }
        return result
    }

    fun getTotalX(a:Array<Int>, b:Array<Int>):Int{
        var finalCount = 0

        var lcm = getLCM(a)

        var gcf = getGCF(b)

    // Below is converted from Java's For loop code.
    // for(int i = lcm, j =2; i<=gcf; i=lcm*j,j++) {  if(gcf%i==0){ finalCount++;} }

        var i = lcm  // We start from LCM
        var j = 2 // We ignore 0, 1 for math rules.
        // checking numbers between LCM and GCF
        while (i <= gcf) {
            if (gcf % i == 0) {
                finalCount++
            }
            i = lcm * j // Incrementing value of lcm by J times.
            j++ // Loop Incrementing.
        }


        return finalCount;
    }


    @JvmStatic
    fun main(args: Array<String>) {

        // val n = 2 // Size of first array
        // val m = 3 // Size of second array

        val arr = arrayOf(2,4)
        val brr = arrayOf(16,32,96)

        var total = getTotalX(arr,brr)

        println(total) // 3

    }
}
