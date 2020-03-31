object GradingStudent {


fun gradingStudents(grades: Array<Int>): Array<Int> {
    
    val returnGrade = Array<Int>(grades.size){0}
    
    for (i in grades.indices) {
        val current = grades[i]

returnGrade[i] = if (current < 38 ){
             current
        } else {
            val nextFive = 5 - (current % 5) + current
            
            if ((current % 5) < 3) {
                 current
            } else {
                 nextFive
            }
        }
    }


return returnGrade
}


    @JvmStatic
    fun main(args: Array<String>) {

    val grades = arrayOf(73,67,38,33)
    val result = gradingStudents(grades)
        println(result.joinToString("\n"))
    }

}
