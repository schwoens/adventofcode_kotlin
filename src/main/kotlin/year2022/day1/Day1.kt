package year2022.day1

class Day1(private val input: String) {

    fun part1(): Int {
        return getMaxTotalCalories(1)
    }

    fun part2(): Int {
        return getMaxTotalCalories(3)
    }
    private fun getMaxTotalCalories(top: Int): Int {

        var totalCalories = mutableListOf<Int>()

        for (elf in this.input.split("\n\n")) {
            totalCalories.add(getTotalCalories(elf))
        }

        totalCalories = totalCalories.sorted().toMutableList()

        var maxTotalCalories = 0

        for (i in 1..top) {
            maxTotalCalories += totalCalories.removeAt(totalCalories.size-1)
        }

        return maxTotalCalories
    }

    private fun getTotalCalories(elf: String): Int {
        var totalCalories = 0
        for (line in elf.split("\n")) {
            totalCalories += line.toInt()
        }
        return totalCalories
    }


}