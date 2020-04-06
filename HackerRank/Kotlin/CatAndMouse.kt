object CatAndMouse {

    fun catAndMouse(x:Int, y:Int, z:Int): String {

        val diffA = Math.abs(x-z)
        val diffB = Math.abs(y-z)
        val diff:Int = diffA - diffB

        val Result =  if (diff > 0){"Cat B"}
                        else if (diff < 0){"Cat A"}
                        else if (diff == 0){"Mouse C"}
                        else {""}
        return Result
    }



    @JvmStatic
    fun main(args: Array<String>) {
        var q:Array<IntArray> // No. Of queries
        var x:Int // Cat A's Location
        var y:Int // Cat B's Location
        var z:Int // Mouse C's location


        println("Sample output 0:")
        q = arrayOf(
            intArrayOf(1,2,3),
            intArrayOf(1,3,2)
        )

        for (arr in q){
            x = arr[0]
            y = arr[1]
            z = arr[2]
            println(catAndMouse(x,y,z))
        } // Cat B \n Mouse C

    }
}
