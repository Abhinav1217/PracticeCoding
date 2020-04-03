object BreakingRecords {


fun breakingRecords(scores: Array<Int>): Array<Int> {
    
    var highCount = 0
    var lowCount = 0
    var currentHigh = scores[0]
    var currentLow = scores[0]

    for (current in scores){
        if (current > currentHigh){
            highCount ++
            currentHigh = current
        }

        if (current< currentLow){
            lowCount ++
            currentLow = current
        }

    }

    return arrayOf(highCount, lowCount)

}    



@JvmStatic
fun main(args: Array<String>) {
//    val number_of_games = 9
   var scores = arrayOf(10, 5, 20, 20, 4, 5, 2, 25, 1)

   val result = breakingRecords(scores)
   println(result.joinToString(" "))


   scores = arrayOf(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)
   println(breakingRecords(scores).joinToString(" "))


}
}
