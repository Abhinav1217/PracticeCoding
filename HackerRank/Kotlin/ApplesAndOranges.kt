object ApplesAndOranges {

    fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
   
        var landedApples:Int =0
        var landedOranges:Int =0

        // Apples 
        for (current in apples){
            var position = current + a 
            if (position >= s && position <= t ){
                landedApples += 1
            }
        }

        // Oranges 
        for (current in oranges){
            var position = current + b 
            if (position >= s && position <= t ){
                landedOranges += 1
            }
        }


        println(landedApples)
        println(landedOranges)
    }




    @JvmStatic
    fun main(args: Array<String>) {

       val s = 7    // Start point of house
       val t = 11   // end point of house
       val a = 5    // Location of Apple Tree
       val b = 15   // Location of Orange 
       
    //  val m = 3    // range of apple array
    //  val n = 2    // range of orange array

       val apples = arrayOf(-2, 2, 1)   // array of apples fallen
       val oranges = arrayOf(5, -6)     // array of orange dallen
       

       countApplesAndOranges(s, t, a, b, apples, oranges)

    // Expected Output 1, 1

    }
}
