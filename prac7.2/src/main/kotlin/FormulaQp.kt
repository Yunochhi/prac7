class FormulaQp (val p:Int, discipline:String, studentsCount:Int, examHours:Double):Exam(discipline, studentsCount, examHours)
{
    fun getQp():Double
    {
        val qp = getQ() * (100 - p) / 100
        return qp
    }
}