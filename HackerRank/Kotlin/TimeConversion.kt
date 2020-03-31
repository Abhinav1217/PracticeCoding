object TimeConversion {

    fun padding_str(c:Int) :String {
        if (c >= 10)
            return c.toString()
        else
            return "0" + c
    }

    fun getNumber(date: String): String {
        
    val dt_str_arr = date.toUpperCase() // convert string to uppercase for case insensivity
                        .replace("AM", "") 
                        .replace("PM", "")
                        .split(":")
                        .toTypedArray() // Convert to array 
    
    var dt_int_arr = IntArray(dt_str_arr.size)
    
    for (i in dt_str_arr.indices) {
        dt_int_arr[i] = dt_str_arr[i].toInt()
    }

        if (date.toUpperCase().contains("AM")) {
            
            if (dt_int_arr[0]==12){
                dt_int_arr[0] = 0
            } 
        } else {
            if (dt_int_arr[0]<12){
                dt_int_arr[0] += 12
            } 
        }

         return padding_str(dt_int_arr[0]) + ":" + padding_str(dt_int_arr[1]) + ":" + padding_str(dt_int_arr[2])
    }
    

    @JvmStatic
    fun main(args: Array<String>) {

    var result = getNumber("12:30:20PM")
    println(result)
    
    result = getNumber("1:10:20pm")
    println(result)
    
    result = getNumber("1:02:20am")
    println(result)

    result = getNumber("12:05:45PM")
    println(result)
    result = getNumber("12:05:45am")
    println(result)

    }

}
