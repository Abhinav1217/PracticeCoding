object HurdleRace {

    fun hurdleRace(k: Int, height: Array<Int>): Int {

        var count = 0
        height.sortDescending() // This way Largest value will be at index 0
        if (k < height[0]) {
            count = height[0] - k
        }
        return count
    }

    @JvmStatic
    fun main(args: Array<String>) {

        // var n:Int // Number of Hurdles
        var k:Int // Maximum Jump Height
        var height:Array<Int> // Height of each Hurdle
        //  var result = hurdleRace(k, height)

        // n = 5
        k = 4
        height = arrayOf(1,6,3,5,2)
        println("Scenerio 1: " + hurdleRace(k, height)) // 2


        // n = 5
        k = 7
        height = arrayOf(2,5,4,5,2)
        println("Scenerio 2: " + hurdleRace(k, height)) // 0
    }
}
