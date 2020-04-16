object SavePrisoner {
    fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
        var prisoner = (s+(m-1)) % n

        return if (prisoner == 0) {n} else {prisoner}

    }

    @JvmStatic
    fun main(args: Array<String>) {

        var n:Int   // Number of Prisoners
        var m:Int   // Number of Sweets
        var s:Int   // Start Chair Number

        n = 5
        m = 2
        s = 1
        println("Scenerio 1: " + saveThePrisoner(n,m,s)) // 2

        n = 5
        m = 2
        s = 2
        println("Scenerio 1: " + saveThePrisoner(n,m,s)) // 3
    }
}
