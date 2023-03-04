import main.kotlin.narrate

var heroName: String = ""
fun main() {

    heroName = promptHeroName()
    // main.kotlin.changeNarratorMood()
    narrate("$heroName, ${createTitle(heroName)}, heads to the town square")
    visitTavern()
}

private fun promptHeroName() : String {
    narrate("A hero enters the town of Kronstadt. What is their name?") { message ->
        // Prints the message in yellow
        "\u001b[33;1m$message\u001b[0m"
    }

    /*
    val input = readlnOrNull() ?: ""
    require(heroName != null && heroName.isNotEmpty()) {
        "The hero must have a name."
    }
    return input
    */

    val heroName = "Madrigal"
    println(heroName)
    return heroName
}
private fun createTitle(name: String): String {
    return when {
        name.all { it.isDigit() } -> "The Identifiable"
        name.none { it.isLetter() } -> "The Witness Protection Member"
        name.count { it.lowercase() in "aeiou" } > 4 -> "The Master of Vowels"
        else -> "The Renowned Hero"
    }
}