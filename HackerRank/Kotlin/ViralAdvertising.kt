object ViralAdvertising {

    fun viralAdvertising(n: Int): Int {

        var shared = 5
        var liked = 0.0
        var cumulative = 0
        for (day in 1..n){
            liked = Math.floor((shared / 2).toDouble())
            shared = (liked*3).toInt()
            cumulative += liked.toInt()
        }

        return cumulative

    }

    @JvmStatic
    fun main(args: Array<String>) {
        var n:Int

        n = 3
        println("Scenerio 1: " + viralAdvertising(n))   // 9

        n = 5
        println("Scenerio 2: " + viralAdvertising(n))   // 24

    }
}
