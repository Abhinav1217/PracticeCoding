object FindDigits{

    fun findDigits(n: Int): Int {
        var count = 0
        var digit:Int
        var scr = n.toString().toCharArray()
        for(char in scr ){
            digit = Integer.valueOf(char.toString())
            if (digit != 0 && n % digit == 0) {count++}
        }

        return count

    }
    @JvmStatic
    fun main(args: Array<String>) {
        var n:Int

        n = 12
        println("Scenerio 1 " + findDigits(n))  //2

        n = 1012
        println("Scenerio 2 " + findDigits(n))  //3
    }
}
