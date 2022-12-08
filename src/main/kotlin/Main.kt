fun main() {
    val dices = arrayOf(
        Dice(DiceSides.Four),
        Dice(DiceSides.Six),
        Dice(DiceSides.Eight),
        Dice(DiceSides.Ten),
        Dice(DiceSides.Twelve),
        Dice(DiceSides.Twenty),
        Dice(DiceSides.Hundred)
    )

    for (dice in dices) {
        println("rolled ${dice.roll()} on ${dice.title}")
    }
}