object Tree{
    fun utopianTree(n: Int): Int {
        var height = 1
        for ( cycle in 1 .. n){
            when {
                (cycle % 2 == 0) -> {height = height + 1}
                (cycle % 2 != 0) -> {height = height * 2}
            }
        }
        return height
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var t:Int // Size of array
        var ar:Array<Int>

        t = 3
        ar = arrayOf(0,1,4)
        for (tItr in 1..t) {
            println("Scenerio cycle $tItr: " + utopianTree(ar[tItr - 1]))
        }
    }

}
