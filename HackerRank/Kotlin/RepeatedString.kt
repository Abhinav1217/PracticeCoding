object RepeatedString{

    fun repeatedStringWithoutLooping(s: String, n: Long):Long{

        var a_count:Long = 0
        var length = s.length

        for (char in s){
            if (char == 'a'){
                a_count++
            }
        }

        // edge case
        if (a_count == length.toLong()){ return n }
        else if (a_count == 0.toLong()){ return 0 }

        // normal case
        var count = (n/length) * (a_count)
        val reminder = (n%length).toInt()
        if (reminder != 0){
            for (i in 0..reminder-1){
                if (s[i] == 'a') { count++ }
            }
        }
        return count
    }

    fun repeatedString(s: String, n: Long): Long {
        var count:Long = 0
        val length:Int = s.length
        var position:Int
        // edge case
        if (s.length == 1 && s.equals("a", ignoreCase = true )){
            count = n
        }else {
            for (i in 0..n-1){
                position = (((length+i) % length)).toInt()
                // println("char at ${position} is ${s[position]}")
                if (s[position] == 'a') { count++ }
            }
        }
        return count
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var n:Long
        var s:String

        s = "aba"
        n = 10
        println("Scenerio 1: ${repeatedStringWithoutLooping(s,n)}") // 7

        s = "abcac"
        n = 10
        println("Scenerio 2: ${repeatedStringWithoutLooping(s,n)}")   // 4

        s = "a"
        n = 1000000000000
        println("Scenerio 3: ${repeatedStringWithoutLooping(s,n)}")   // 1000000000000

    }
}
