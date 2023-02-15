open class Cabel(val name: String, val cableVeins: Int, val diameters:Double)
{
    fun getQ():Double
    {
        val q = diameters / cableVeins
        return q
    }
}