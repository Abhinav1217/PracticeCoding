object ElectronicShop{

    fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {

        keyboards.sort()
        drives.sort()

        var max = -1 // Default return

        var i = 0
        var j = drives.size - 1
        var cost:Int

        while( i < keyboards.size && j >= 0){
             cost = keyboards[i] + drives[j]
             if (cost>b){
                 j--
             } else {
                 if (cost > max) {
                    max = cost
                 }
                 i++
             }
        }

        return max

    }

    @JvmStatic
    fun main(args: Array<String>) {

        var b:Int   // Budget
        // var n:Int   // No of Keyboard models
        // var m:Int   // No of USB models
        var keyboards:Array<Int> // Array of Keyboard models
        var drives:Array<Int> // Array of USB models

        b = 10
        keyboards = arrayOf(3,1)
        drives = arrayOf(5,2,8)
        println("Scenerio 0: " + getMoneySpent(keyboards, drives, b)) // 9

        b = 5
        keyboards = arrayOf(4)
        drives = arrayOf(5)
        println("Scenerio 1: " + getMoneySpent(keyboards, drives, b)) // -1

    }
}
