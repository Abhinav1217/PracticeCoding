object PermutationEquation{

    fun permutationEquation(p: Array<Int>): Array<Int> {
        var invert_map = HashMap<Int,Int>()
        var result = Array<Int>(p.size){0}
        for (i in p.indices){
            invert_map.put(p[i], i+1)
        }
        for (i in 1..p.size){
            result[i-1]  = invert_map.get(invert_map.get(i))!!


        }
        return result
    }

    @JvmStatic
    fun main(args: Array<String>) {

        var p:Array<Int>
        var result:Array<Int>

        p = arrayOf(2,3,1)
        println("Scenerio 1: " + permutationEquation(p).joinToString(",")) // 2,3,1

        p = arrayOf(4,3,5,1,2)
        println("Scenerio 2: " + permutationEquation(p).joinToString(",")) // 1,3,5,4,2

        p = arrayOf(5,2,1,3,4)
        println("Scen,erio 3: " + permutationEquation(p).joinToString(",")) // 4,2,5,1,3
    }

}
