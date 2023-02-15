fun main()
{
    println("Введите название дисциплины: ")
    val predmet:String = readln().toString()
    println("Введите количество студентов: ")
    val students:Int = readln().toString().toInt()
    println("Введите время продолжительности экзамена (в часах): ")
    val hours:Double = readln().toString().toDouble()
    val examen: Exam = Exam(predmet, students, hours)

    println("Введите процент двоек: ")
    val procDvoek:Int = readln().toString().toInt()
    val formula: FormulaQp = FormulaQp(procDvoek, predmet, students, hours )

    println("По дисциплине $predmet, Qp = ${formula.getQp()}")
}