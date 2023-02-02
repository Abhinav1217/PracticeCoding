/**
 * Basically looking for LCM of all numbers in 1 - 20
 */

var x = 0;
var y = 0;
var z = 0;

fun getGDC(a:Int, b:Int):Int{

    x = a; 
    y = b;

    while (y != 0) {    // Euclidean algorithm, but using loop instead of recurssion.
        z = x % y;  // Next element.
        x = y;
        y = z;
    }
    return x;
}

fun getLCM(arr:Array<Int>):Int{
    var lcm = 0;
    for (i in 0..arr.size-2){
        lcm = (arr[i] * arr[i+1]) / getGDC(arr[i], arr[i+1]);
    }
    
    return lcm;
}

fun main(){

    val arr = arrayOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
    println(getLCM(arr));
}
