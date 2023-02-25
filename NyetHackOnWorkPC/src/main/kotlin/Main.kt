fun main() {
    narrate("A hero enters the town of Kronstadt. What is their name?") { message ->
        // Prints the message in yellow
        "\u001b[33;1m$message\u001b[0m"
    }
    val heroName = readlnOrNull() ?: ""
    changeNarratorMood()
    narrate("$heroName heads to the town square")
}
