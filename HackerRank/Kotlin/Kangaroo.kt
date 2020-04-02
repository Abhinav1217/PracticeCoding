object Kangaroo {

    fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {

        val no = "NO".toUpperCase()
        val yes = "YES".toUpperCase()

       // var position1 = x1
       // var position2 = x2

        // Condition for ignoring x1<x2 constraint

        var position1:Int
        var position2:Int
        val jump1:Int
        val jump2:Int

        if (x1<x2){
            position1 = x1
            jump1 = v1
            position2 = x2
            jump2 = v2
        } else {

            position1 = x2
            jump1 = v2
            position2 = x1
            jump2 = v1
        }


        // Edge Cases where they will never be able to meet.
        if ((x1 < x2 && v1 < v2) || (x1 > x2 && v1 > v2) ){
            return no
        }
        
        // Since we already returned edge case, We can assume position1 < position2
        while (position1 <= position2){

            if (position1 == position2){
                return yes
            }

            position1 += jump1
            position2 += jump2
        }

        return no

    }


    @JvmStatic
    fun main(args: Array<String>) { 

        var x1 = 0  // Starting position for kangroo 1
        var v1 = 3  // Jump Distance for kangroo 1

        var x2 = 4  // Starting position for kangroo 2
        var v2 = 2  // Jump Distance for kangroo 2

        var result = kangaroo(x1,v1,x2,v2)
        println(result) // YES

        x1 = 0
        v1 = 2

        x2 = 5
        v2 = 3

        result = kangaroo(x1,v1,x2,v2)
        println(result) // NO

    }
}
