package year2022.day2

class Day2(private val input: String) {

    fun part1(): Int {
        return getTotalScore()
    }

    fun part2(): Int {
        return getTotalScoreAlt()
    }

    private fun getTotalScore(): Int {
        var totalScore = 0
        for (instruction in input.split("\n")) {
            totalScore += getScore(instruction)
        }
        return totalScore
    }

    private fun getTotalScoreAlt(): Int {
        var totalScore = 0
        for (instruction in input.split("\n")) {
            totalScore += getScoreAlt(instruction)
        }
        return totalScore
    }

    private fun getScore(instruction: String): Int {

        return when(instruction) {
            "A X" -> 1 + 3
            "A Y" -> 2 + 6
            "A Z" -> 3 + 0
            "B X" -> 1 + 0
            "B Y" -> 2 + 3
            "B Z" -> 3 + 6
            "C X" -> 1 + 6
            "C Y" -> 2 + 0
            "C Z" -> 3 + 3
            else -> 0
        }
    }

    private fun getScoreAlt(instruction: String): Int {

        return when(instruction) {
            "A X" -> 3 + 0
            "A Y" -> 1 + 3
            "A Z" -> 2 + 6
            "B X" -> 1 + 0
            "B Y" -> 2 + 3
            "B Z" -> 3 + 6
            "C X" -> 2 + 0
            "C Y" -> 3 + 3
            "C Z" -> 1 + 6
            else -> 0
        }
    }
}