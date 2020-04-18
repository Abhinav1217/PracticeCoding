object HourGlass{



    fun hourglassSum(arr: Array<Array<Int>>): Int {
        // we know this is going to be a 6x6 square matrix

        val length = arr.size -1
        var maximum = -100
        var sum:Int
        // going vertical
        for (i in 1 until length){
            // Going Horizontal
            for (j in 1 until length){
                sum = 0
                sum += arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1]
                sum +=                 arr[i][j]
                sum += arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1]

                if (sum > maximum) {maximum = sum}
                // println( "sum of arr[$i][$j] is $sum")
            }
        }
        return maximum
    }


    @JvmStatic
    fun main(args: Array<String>) {

        var arr:Array<Array<Int>>

        // arr = arrayOf(
        //         arrayOf(0, 1, 0, 0, 0, 0),
        //         arrayOf(1, 1, 1, 0, 0, 0),
        //         arrayOf(1, 1, 1, 0, 0, 0),
        //         arrayOf(0, 0, 2, 4, 4, 0),
        //         arrayOf(0, 0, 0, 2, 0, 0),
        //         arrayOf(0, 0, 1, 2, 4, 0)
        // )

        // println("Scenerio 1 ${hourglassSum(arr)}")  // 19

        // arr = arrayOf(
        //         arrayOf( -9, -9, -9,  1, 1, 1),
        //         arrayOf(  0, -9,  0,  4, 3, 2),
        //         arrayOf( -9, -9, -9,  1, 2, 3),
        //         arrayOf(  0,  0,  8,  6, 6, 0),
        //         arrayOf(  0,  0,  0, -2, 0, 0),
        //         arrayOf(  0,  0,  1,  2, 4, 0)
        // )

        // println("Scenerio 2 ${hourglassSum(arr)}")  // 28


        arr = arrayOf(
                arrayOf(-1, -1,  0, -9, -2, -2),
                arrayOf(-2, -1, -6, -8, -2, -5),
                arrayOf(-1, -1, -1, -2, -3, -4),
                arrayOf(-1, -9, -2, -4, -4, -5),
                arrayOf(-7, -3, -3, -2, -9, -9),
                arrayOf(-1, -3, -1, -2, -4, -5)
        )

        println("Test Case 3 ${hourglassSum(arr)}")  // -6

        arr = arrayOf(
            arrayOf(  0, -4, -6,  0, -7, -6),
            arrayOf( -1, -2, -6, -8, -3, -1),
            arrayOf( -8, -4, -2, -8, -8, -6),
            arrayOf( -3, -1, -2, -5, -7, -4),
            arrayOf( -3, -5, -3, -6, -6, -6),
            arrayOf( -3, -6,  0, -8, -6, -7)
        )

        println("Test Case 7 ${hourglassSum(arr)}")  // -19

    }
}
