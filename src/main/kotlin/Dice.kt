import kotlin.random.Random

class Dice(private val sides: DiceSides) : Comparable<Dice>, Cloneable {
    val maxValue: Int = sides.amount
    val title = "d$maxValue"

    fun roll() = Random.nextInt(1, maxValue + 1)

    override fun compareTo(other: Dice): Int {
        return maxValue.compareTo(other.maxValue)
    }

    override fun clone(): Any {
        return Dice(sides)
    }
}