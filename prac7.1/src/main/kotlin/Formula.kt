open class Formula (val p:String, name: String, cableVeins: Int, diameters: Double):Cabel(name, cableVeins, diameters)
{
    fun getQp():Double
    {
        if (p == "да" || p == "Да")
        {
            val qp = 2 * getQ()
            return qp
        }
        else if (p == "нет" || p == "Нет")
        {
            val qp = 0.7 * getQ()
            return qp
        }
        return getQp()
    }
}