object CircularArrayRotation {

    fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {

        var arr = Array<Int>(queries.size){0}

        var n = a.size
        for (i in queries.indices){
            // (index - k) is the rotated index.
            // % n will bound rotation of (index - k) to -n .. n
            // + will shift the boundries to 0 .. 2n
            // % n will bound it to 0 .. n
            arr[i] = a[(((queries[i] - k) % n) + n) % n]
        }

        return arr
    }

    @JvmStatic
    fun main(args: Array<String>) {

        var k:Int
        var a:Array<Int>
        var queries:Array<Int>
    }
}
