object PageCount{
    fun pageCount(n: Int, p: Int): Int {
        var countFront = 0
        var countBack = 0
        // Make sure there is always an odd page at the end
        var pageCount = if (n % 2 == 0){n + 1} else {n}

        // Start from front of book and check on right side only
        for ( i in 1 until pageCount step 2){
            // println("front I is $i")
            if (p == i || p == (i-1)) {break}
            countFront++
        }

        // Start from back of book and check on right side only
        for ( i in pageCount downTo 1 step 2){
            // println("back I is $i")
            if (p == i || p == (i-1)) {break}
            countBack++
        }
        // println("Back is $countBack and front is $countFront")
        return Math.min(countBack, countFront)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var n:Int // No of pages in book
        var p:Int // Page number to turn to

        n = 6
        p = 2
        println("Scenerio 0: " + pageCount(n,p)) // 1

        n = 5
        p = 4
        println("Scenerio 1: " + pageCount(n,p)) // 0

        n = 7
        p = 3
        println("Scenerio 2: " + pageCount(n,p)) // 1

        n = 6
        p = 5
        println("Scenerio F: " + pageCount(n,p)) // 1


    }

}
