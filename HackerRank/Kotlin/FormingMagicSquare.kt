 object FormingMagicSquare{

     /**
        everyone is brute-forcing it so why shouldn't i.
        There is another approch I can think of another approach
        but it takes ((n-1)*2) loops to calculate therefore it is not efficient.
        Therefore this is a rare case where brute force is cheaper.
      */

     val perMatrix = arrayOf(
         arrayOf(8, 1, 6, 3, 5, 7, 4, 9, 2),
         arrayOf(6, 1, 8, 7, 5, 3, 2, 9, 4),
         arrayOf(4, 9, 2, 3, 5, 7, 8, 1, 6),
         arrayOf(2, 9, 4, 7, 5, 3, 6, 1, 8),
         arrayOf(8, 3, 4, 1, 5, 9, 6, 7, 2),
         arrayOf(4, 3, 8, 9, 5, 1, 2, 7, 6),
         arrayOf(6, 7, 2, 1, 5, 9, 8, 3, 4),
         arrayOf(2, 7, 6, 9, 5, 1, 4, 3, 8)
         )

     fun diffMagicSquare(s: Array<Array<Int>>): Int {

         val flat_s = s.flatten()

         var diff = Int.MAX_VALUE
         var locDif:Int

         for ( arr in perMatrix ){
             locDif = 0
             for (i in arr.indices){
                locDif += Math.abs(arr[i] - flat_s[i])
             }

             if (locDif < diff ) {diff = locDif}
         }

         return diff
     }


    @JvmStatic
    fun main(args: Array<String>) {
        var s = Array<Array<Int>>(3, { Array<Int>(3, { 0 }) })

        s = arrayOf(
            arrayOf(4,9,2),
            arrayOf(3,5,7),
            arrayOf(8,1,5)
        )


        println("\n Scenerio 1 3x3:")
        // println(formingMagicSquare(s))
        println(diffMagicSquare(s))

        println("\n Scenerio 3 3x3:")

        s = arrayOf(
            arrayOf(2,7,6),
            arrayOf(9,5,1),
            arrayOf(4,3,8)
        )
        // println(formingMagicSquare(s))
        println(diffMagicSquare(s))

        println("\n Scenerio 4 3x3:")

        s = arrayOf(
            arrayOf(4,8,2),
            arrayOf(4,5,7),
            arrayOf(6,1,6)
        )
        // println(formingMagicSquare(s))
        println(diffMagicSquare(s))

        println("\n Scenerio 4 3x3:")

        s = arrayOf(
            arrayOf(4,4,7),
            arrayOf(3,1,5),
            arrayOf(1,7,9)
        )
        // println(formingMagicSquare(s))
        println(diffMagicSquare(s))

    }
}
