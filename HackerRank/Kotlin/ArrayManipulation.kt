object ArrayManipulation {

    fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Long {


        var a:Int
        var b:Int
        var k:Int
        var sum = 0L
        var max = Long.MIN_VALUE
        var arr = Array<Long>(n+2, { 0 })
        for(ops in queries){
            a = ops[0]
            b = ops[1] + 1
            k = ops[2]

            arr[a] = arr[a] + k
            arr[b] = arr[b] - k


            // Time complexity = O(n*m)
            // for (i in a..b){
            //     arr[i] = arr[i] + k
            // }
        }

        // println(arr.joinToString(", "))
        for (i in 0..n ){
            sum += arr[i];
            max = Math.max(max, sum);
        }

        // Time Complexity = O(n+m)
        return max

    }


    @JvmStatic
    fun main(args: Array<String>) {
        var n:Int   // size of array
        n = 5
        var queries = arrayOf(
            arrayOf(1,2,100),
            arrayOf(2,5,100),
            arrayOf(3,4,100)
        )

        println(arrayManipulation(n, queries))
    }
}
