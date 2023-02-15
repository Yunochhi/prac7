fun main()
{
    println("Введите вид кабеля: ")
    val name: String = readln().toString()
    println("Введите количество жил в кабеле: ")
    val veins: Int = readln().toString().toInt()
    println("Введите диаметр кабеля: ")
    val diametr: Double = readln().toString().toDouble()
    val cabelq: Cabel = Cabel(name, veins, diametr)


    println("Ваш кабель в оплетке? (да/нет)")
    val p: String = readln().toString()
    val cabelQp: Formula = Formula(p, name, veins, diametr)
    println("Qp кабеля <<$name>> = ${cabelQp.getQp()}")
}