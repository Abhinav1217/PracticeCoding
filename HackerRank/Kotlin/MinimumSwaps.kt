object MinimumSwaps{

    fun minimumSwaps(arr: Array<Int>): Int {

        var k:Int
        var temp:Int
        val n = arr.size - 1
        var minSwaps = 0

        // since you can not manually modify iterator in for loop in kotlin
        // Use while.
        var i = 0
        while (i < n){
            // It is predetermined that sorted array is a[i] = i+1
            if (i < arr[i] - 1){
                // This line is needed to prevent index out of bound
                // When we find final number.
                k = Math.min(n, arr[i] - 1)
                temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                minSwaps++
                // we go back one step because we moved one step when we swapped.
                i--
            }
            i++
        }
        return minSwaps
    }

    @JvmStatic
    fun main(args: Array<String>) {

        var arr:Array<Int>

        arr = arrayOf(7, 1, 3, 2, 4, 5, 6)
        println("Case 1: "+ minimumSwaps(arr))  // 5

        arr = arrayOf(4,3,1,2)
        println("Case 1: "+ minimumSwaps(arr))  // 3
    }
}
