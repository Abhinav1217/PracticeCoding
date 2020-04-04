object SockMerchant {

    fun sockMerchant(n: Int, ar: Array<Int>): Int {

        // HashMap is Key, Value Datastructure, HashSet is better in this scenerio
        val pairMap = HashSet<Int>()

        var matchingPair:Int = 0
        for (sockType in ar) {
            if (!pairMap.contains(sockType)){
                pairMap.add(sockType)
            } else {
                matchingPair++
                pairMap.remove(sockType)
            }

        }
        return matchingPair
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var n:Int           // Number of sock in pile
        var ar:Array<Int>   // Color of each sock

        print("Scenerio 0: ")
        n = 9
        ar = arrayOf(10,20,20,10,10,30,50,10,20)
        println(sockMerchant(n, ar)) // 3

        print("Scenerio 2: ")
        n = 7
        ar = arrayOf(1,2,1,2,1,3,2)
        println(sockMerchant(n, ar)) // 2

        print("Scenerio failed: ")
        n = 20
        ar = arrayOf(4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5)
        println(sockMerchant(n, ar)) // 9
    }
}
