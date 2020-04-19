object LeftRotation{

    fun rotLeft(a: Array<Int>, d: Int): Array<Int> {

        val n = a.size
        var arr = Array<Int>(n){0}

        for (i in 0 until n){
            arr[i] = a[((d + i) % n)]
        }

        return arr
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var d:Int
        var a:Array<Int>

        d = 2
        a = arrayOf(1,2,3,4,5)
        println(rotLeft(a,d).joinToString(" "))  // 5,1,2,3,4
    }
}
