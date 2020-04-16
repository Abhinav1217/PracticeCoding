object AngryProfessor {
    fun angryProfessor(k: Int, a: Array<Int>): String {
        val yes = "YES"
        val no = "NO"
        var count = 0
            for (value in a){
                if (value <= 0) { count ++ }
            }
        return if (count >= k){ no } else { yes }

    }

    @JvmStatic
    fun main(args: Array<String>) {
        var k:Int
        var a:Array<Int>

        k = 3
        a = arrayOf(-1,-3,4,2)
        println("String 1: " + angryProfessor(k, a))    // YES

        k = 2
        a = arrayOf(0,-1,2,12)
        println("String 1: " + angryProfessor(k, a))    // NO

    }
}
