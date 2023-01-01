package year2022.day3

class Day3(private val input: String) {

    fun part1(): Int {
        return getPrioritySum()
    }

    fun part2(): Int {
        return getGroupPrioritySum()
    }

    private fun getPrioritySum(): Int {

        var prioritySum = 0
        for (rucksack in input.split("\n")) {
            prioritySum += getPriority(rucksack)
        }
        return prioritySum
    }

    private fun getGroupPrioritySum(): Int {

        var prioritySum = 0
        val group = mutableListOf<String>()
        val rucksacks = input.split("\n")

        for (index in rucksacks.indices) {
            if (index % 3 == 0 && index != 0) {
                prioritySum += getGroupPriority(group)
                group.clear()
            }
            group.add(rucksacks[index])
        }
        prioritySum += getGroupPriority(group)
        return prioritySum
    }

    private fun getGroupPriority(group: MutableList<String>): Int {

        for (item in group.first()) {
            if (item in group[1] && item in group[2]) {
                return getPriorityValue(item)
            }
        }
        return 0
    }

    private fun getPriority(rucksack: String): Int {

        val compartment1 = rucksack.substring(0, rucksack.length / 2)
        val compartment2 = rucksack.substring(rucksack.length / 2)

        for (item in compartment1) {
            if (item in compartment2) {
                return getPriorityValue(item)
            }
        }
        return 0
    }

    private fun getPriorityValue(item: Char): Int {
        val ascii = item.code

        if (item.isUpperCase()) {
            return ascii - 64 + 26
        }
        return ascii - 96
    }
}