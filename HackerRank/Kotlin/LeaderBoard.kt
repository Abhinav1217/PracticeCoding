object LeaderBoard {

    fun altMet(scores: Array<Int>, alice: Array<Int>): Array<Int> {

        var result = Array<Int>(alice.size){0}
        var sc = java.util.ArrayDeque<Int>() // Because Stacks in Java are considered bad

        for (i in scores.indices){
            if (i == 0 || sc.peek() != scores[i]){ sc.push(scores[i])}
        }

        for (i in alice.indices){
            while ( !sc.isEmpty() && sc.peek() <= alice[i]) { sc.pop() }
           result[i] = sc.size + 1

        }

        return result

    }


    fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): Array<Int> {
        /**  This is currently not working for some reason yet to be found out */


        // Scores are in sorted decending order
        // alice scores are in sorted acending order.

        var sortedSet = HashSet(scores.asList()).sorted()
        var result = Array<Int>(alice.size){0}
        var index:Int

        for (key in alice.indices){
            index = sortedSet.binarySearch(alice[key])

            result[key] = if (index < 0){
                            Math.abs(index)
                        } else {
                            index + 1
                        }
        }

        result.reverse()
        return result
    }


    @JvmStatic
    fun main(args: Array<String>) {
        // var scoreCount:Int
        var scores:Array<Int>

        // var aliceCount:Int
        var alice:Array<Int>

        // Scenerio 1
        // scoreCount = 7
        // aliceCount = 4
        scores = arrayOf(100,100,50,40,40,20,10)
        alice = arrayOf(5,25,50,120)
        println("Scenerio 1: \n" + altMet(scores, alice).joinToString(" ")) // 6, 4, 2, 1


        scores = arrayOf(100, 90, 90, 80, 75, 60)
        alice = arrayOf(50,65,77,90,102)
        println("Scenerio 2: \n" + altMet(scores, alice).joinToString(" ")) // 6, 5,4,2,1
    }
}
