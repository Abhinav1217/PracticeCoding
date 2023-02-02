
var sum:Int = 0;
fun main(){

    for (i in 3..(1000-1)) {
        if (i%3 == 0){
            sum += i;
        } else if ( i%5 == 0) {
            sum += i;
        }
    }

    println(sum);
}

