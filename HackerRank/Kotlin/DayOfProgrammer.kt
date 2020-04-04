import java.text.SimpleDateFormat
import java.util.Calendar

object DayOfProgrammer {

    fun calendarDate(year:Int, day:Int):String{
        val cal = Calendar.getInstance()
        cal.set(Calendar.YEAR, year)
        cal.set(Calendar.DAY_OF_YEAR, day)
        val date = SimpleDateFormat("dd.MM.yyyy")
        return date.format(cal.getTime())
    }

    fun isLeap (year:Int):Boolean {
        var result = false
        // For both Julian and Gregorian
        if (year % 4 == 0){
            result = true
        }
        // Extra check for Gregorian
        if (year >= 1919){
            if ((result && year % 100 != 0) || (year % 400 == 0)){
                result = true
            }
        }
        return result
    }

    fun dayOfProgrammer(year: Int): String {
        val no_of_days:Int

        if (year == 1918 ){
            // This is transition year so add 14 days
            no_of_days = (255+14)
        } else if ((year < 1918) && (year % 100 == 0)) {
            no_of_days = 255
        } else {
           no_of_days = 256
        }

        return calendarDate(year, no_of_days)

        // Alternate Solution
        /*
        val result:String

        if (year == 1918) { // transition
        result = "26.09.1918"
        // } else if ((year < 1918 && year % 4 == 0) || (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        } else if (isLeap(year)) {
            result = "12.09.$year"
        } else {
            result = "13.09.$year"
        }
         return result
        */

    }

    @JvmStatic
    fun main(args: Array<String>) {
        var year:Int
        var result:String

        println("Scenerio 0")
        year = 1984
        result = dayOfProgrammer(year)
        println(result) // 12.09.1984

        println("Scenerio 1")
        year = 2017
        result = dayOfProgrammer(year)
        println(result) // 13.09.2017

        println("Scenerio 2")
        year = 2016
        result = dayOfProgrammer(year)
        println(result) // 12.09.2016

        println("Scenerio 3")
        year = 1800
        result = dayOfProgrammer(year)
        println(result) // 12.09.1800
    }
}
