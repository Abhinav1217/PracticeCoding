var first = 1
var second = 2
var sum = 0
fun main(){

    while (second < 4_000_000){
        if (second % 2 == 0) {
            sum += second
        }

        second = second + first
        first = second - first
    }

    println(sum)
}
