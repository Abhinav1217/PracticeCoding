object CloudJumpingRevisited{

    fun jumpingOnClouds(c: Array<Int>, k: Int): Int {
        var energy = 100
        var i=0
        var n = c.size
        do{
            i = (i+k) % n
            energy -= (1 + 2*c[i])
        } while(i!=0)

        return energy
    }

    @JvmStatic
    fun main(args: Array<String>) {

        // var n:Int        //   Size of array

        var k:Int           //  Jump Distance
        var c:Array<Int>    //  Cloud types

        k = 2
        c = arrayOf(0,0,1,0,0,1,1,0)
        println("Scenerio 1: " + jumpingOnClouds(c, k)) //  92

        k = 2
        c = arrayOf(0,0,1,0)
        println("Scenerio 1: " + jumpingOnClouds(c, k)) //  96

        k = 3
        c = arrayOf(1,1,1,0,1,1,0,0,0,0)
        println("Scenerio 1: " + jumpingOnClouds(c, k)) //  80
    }
}
