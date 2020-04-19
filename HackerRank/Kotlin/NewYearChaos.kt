object NewYearChaos{

    fun minimumBribes(q: Array<Int>): Unit {

        var a = q.clone()
        var n = a.size - 1
        var chaotic = false
        var bribe_count = 0
        for (i in n downTo 1)
        {
                if (a[i - 1] == i + 1)
                {
                    a[i - 1] = a[i]
                    bribe_count++
                }
                else if (i >= 2 && a[i - 2] == i + 1)
                {
                    a[i - 2] = a[i - 1]
                    a[i - 1] = a[i]
                    bribe_count += 2
                }
                else if (a[i] != i + 1)
                {
                    chaotic = true
                    break
                }

                // println(" position is $i")
        }

        if (chaotic) { println("Too chaotic") }
        else{
             println(bribe_count)
             println(a.joinToString(", "))
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var arr:Array<Int>

        arr = arrayOf(1,2,3,4,5)
        minimumBribes(arr)  // 0

        arr = arrayOf(2,1,5,3,4)
        minimumBribes(arr)  // 3

        arr = arrayOf(2,5,1,3,4)
        minimumBribes(arr)  // Too chaotic

        arr = arrayOf(5,1,2,3,7,8,6,4)
        minimumBribes(arr)  // Too chaotic
        // 1,2,5,3,7,8,4
        arr = arrayOf(1,2,5,3,7,8,6,4)
        minimumBribes(arr)  // 7
    }
}
