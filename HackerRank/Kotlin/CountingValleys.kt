object CountingValleys{

    fun countingValleys(n: Int, s: String): Int {

        var steps = s.toUpperCase().toCharArray()
        var altitude = 0
        var valleyStatus = false
        var valleyCount = 0

        for (terrain in steps){
            if (terrain.equals('U') ){
                altitude++
                }
            else if (terrain.equals('D')) {
                altitude--
                }

            if (!valleyStatus && altitude < 0){
                valleyCount++
                valleyStatus = true
            }

            if ( altitude >= 0){
                valleyStatus = false
            }

        }

        return valleyCount

    }

    @JvmStatic
    fun main(args: Array<String>) {
        var n:Int
        var s:String


        n = 8
        s = "UDDDUDUU"
        println("Scenerio 0: " + countingValleys(n, s)) // 1


        n = 8
        s = "DDUUUUDD"
        println("Scenerio 1: " + countingValleys(n, s)) // 1

    }
}
