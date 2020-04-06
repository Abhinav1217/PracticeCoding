object PickingNumbers {

    fun pickingNumbers(a: Array<Int>): Int {

        a.sort()
        var max = 0

        for (i in a.size - 1 downTo 0 ){
            var count = 1
            for ( j in i -1 downTo 0){
                if ((a[i] - a[j]) < 2){
                    count++
                }
            }
            if (count > max) {
                max = count
            }
        }

        return max

    }




    @JvmStatic
    fun main(args: Array<String>) {

        var a :Array<Int>

        a = arrayOf(1, 2, 2, 3, 1, 2)
        println("Scenerio 0: " + pickingNumbers(a)) // 5

        a = arrayOf(4,6,5,3,3,1)
        println("Scenerio 1: " + pickingNumbers(a)) // 3

    }
}
