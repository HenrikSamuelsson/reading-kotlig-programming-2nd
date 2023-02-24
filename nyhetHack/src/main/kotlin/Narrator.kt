package nyhetHack.src.main.kotlin

fun narrate(
    message: String
) {
    println({
        val numExclamationPoints = 3
        message.uppercase() + "!".repeat(numExclamationPoints)
    }())
}
