const val HERO_NAME = "Madrigal"
var playerLevel = 5

fun main() {
    println("$HERO_NAME announces her presence to the world")
    println(playerLevel)

    val playeClass = "paladin"

    val hasBrefiendedBarbarians = true
    val hasAngeredBarbarians = false

    val quest: String = obtainQuest(playerLevel, hasAngeredBarbarians, hasBrefiendedBarbarians, playeClass)

    println("The hero approaches tho bounty board, It reads:")
    println(quest)

    println("Time passes...")
    println("The hero returns from her quest.")

    playerLevel += 1
    println(playerLevel)
}

private fun obtainQuest(
    playerLevel: Int,
    hasAngeredBarbarians: Boolean,
    hasBrefriendedBarbarians: Boolean,
    playerClass: String
): String {
    val quest: String = when (playerLevel) {
        1 -> "Meet Mr. Bubbles in the land of soft things."
        in 2..5 -> {
            // Check whether diplomacy is an option
            val canTalkToBarbarians = !hasAngeredBarbarians &&
                    (hasBrefriendedBarbarians || playerClass == "barbarian")
            if (canTalkToBarbarians) {
                "Convince the barbarians to call of their invasion."
            } else {
                "Save the town from the barbarian invasion"
            }
        }

        6 -> "Locate the enchanted sword."
        7 -> "Recover the long-lost artifact of creation"
        8 -> "Defeat Nogartse, bringer of death ant eater of worlds."
        else -> "There are no quests right now"
    }
    return quest
}
