object JumpingCloud{

    fun jumpingOnClouds(c: Array<Int>): Int {
        var count = 0
        var i = 0
        val n = c.size
        while(i < n-1){
            // There can be no 2 consicutive '1' in this array
            // Shortest path is maximum usage of maximum jump distance (i.e 2)
            // if jump 2 is '1' then i++ else i+2
            // also start and end node is sure to be '0'
            if(i+2 < n && c[i + 2] != 1){
                i = i + 2;
                count++;
            }
            else{
                i++;
                count++;
            }
        }
        return count
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var c:Array<Int>

        c = arrayOf(0,0,0,0,1,0)
        println("Scenerio 1: " + jumpingOnClouds(c))    //  3

        c = arrayOf(0,0,1,0,0,1,0)
        println("Scenerio 1: " + jumpingOnClouds(c))    //  4
    }
}
