object MigratoryBirds {

    fun migratoryBirds(arr: Array<Int>): Int {

        val type = arrayOf(0,0,0,0,0)

        for (value in arr){
            type[value-1]++
        }

        var max = 0;
        var maxType = 0
        for (i in 0..4){
            if (type[i] > max ){
                maxType = i+1
                max = type[i]
            }
        }

        return maxType
    }




    fun altMigratoryBirds(arr: Array<Int>): Int {
        var maxCount = 0
        var maxType = 0
        var count = 0
        var type = 0

        // This Line is complexiy O(nlog n). So this solution with fail test-case-2 with 73K elements.
        arr.sort()

        // other than that this algo works for sorted algo
        for (value in arr){

            if (type != value){
                if (count > maxCount){
                    maxCount = count
                    maxType = type
                }
                // new count values
                type = value
                count = 1
            } else {
                count++
            }
        }
        return maxType
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var arrCount:Int        // Size of array
        var arr:Array<Int>      // Array of Integers

        println("Scenerio 0")
        arr = arrayOf(1,4,4,4,5,3)

        println(migratoryBirds(arr)) // 4


        println("Scenerio 1")
        arr = arrayOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)

        println(migratoryBirds(arr)) // 3


        println("Scenerio 2")
        arr = arrayOf(1,1,2,2,3)

        println(migratoryBirds(arr)) // 1

        println("FailedScenerio")

        arrCount = readLine()!!.trim().toInt()

        arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
        println(migratoryBirds(arr)) // 5
    }

}
