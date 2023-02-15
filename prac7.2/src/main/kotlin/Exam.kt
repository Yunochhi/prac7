open class Exam(val discipline: String, val studentsCount:Int, val examHours:Double)
{
    fun getQ():Double
    {
        val q = studentsCount / examHours
        return q
    }
}