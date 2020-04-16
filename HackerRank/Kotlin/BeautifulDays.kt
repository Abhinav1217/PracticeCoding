object BeautifulDays {

    fun beautifulDays(i: Int, j: Int, k: Int): Int {
        var count = 0
        var diff:Int
        for ( day in i..j){
            diff = Math.abs(day - day.toString().reversed().toInt())
            if (diff % k == 0){ count++ }
        }

        return count
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var i:Int   // Starting Day Number
        var j:Int   // Ending Day Number
        var k:Int   // Divisor

        i = 20
        j = 23
        k = 6
        println("Scenerio 1: " + beautifulDays(i,j,k))
    }
}
