package year2022.day4

class Day4(private val input: String) {

    fun part1(): Int {
        return countFullyContainedAssignments()
    }

    fun part2(): Int {
        return countPartlyContainedAssignments()
    }

    private fun countPartlyContainedAssignments(): Int {

        var count = 0
        for (line in input.split("\n")) {
            if (AssignmentPair.fromString(line).onePartlyContainsOther()) {
                count++
            }
        }
        return count
    }

    private fun countFullyContainedAssignments(): Int {

        var count = 0
        for (line in input.split("\n")) {
            if (AssignmentPair.fromString(line).oneFullyContainsOther()) {
                count++
            }
        }
        return count
    }
}
