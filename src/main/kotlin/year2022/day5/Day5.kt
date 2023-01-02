package year2022.day5

typealias Stack = MutableList<Char>
typealias CrateMap = MutableMap<Int, Stack>

class Day5(private val input: String) {

    fun part1(): String {
        val crates = getCratesFromDrawing(getDrawing())
        return getTopCrateLabels(
            followInstructions(getInstructions(), crates)
        )
    }

    fun part2(): String {
        val crates = getCratesFromDrawing(getDrawing())
        return getTopCrateLabels(
            followInstructions(getInstructions(), crates, true)
        )
    }

    private fun getCratesFromDrawing(drawing: String): CrateMap {

        val lines = drawing.split("\n").reversed()
        val drawingSize = lines.first().length

        val crates = mutableMapOf<Int, Stack>()

        var index = 1
        while (index < drawingSize) {
            val key = lines.first()[index].digitToInt()
            crates[key] = mutableListOf<Char>()
            for (line in lines.filterNot { it == lines.first() }) {
                try {
                    if (line[index] != ' ') {
                        crates[key]!!.add(line[index])
                    }
                } catch (_: StringIndexOutOfBoundsException) {
                    continue
                }
            }
            index += 4
        }
        return crates
    }

    private fun getDrawing(): String {
        return input.split("\n\n").first()
    }

    private fun getInstructions(): List<String> {
        return input.split("\n\n").last().split("\n")
    }

    private fun followInstructions(instructions: List<String>, crates: CrateMap, moveMultiple: Boolean = false): CrateMap {

        var amount: Int
        var from: Int
        var to: Int

        var split: List<String>
        var moveList: Stack

        for (instruction in instructions) {

            split = instruction.split(" ")

            amount = split[1].toInt()
            from = split[3].toInt()
            to = split[5].toInt()

            if (moveMultiple) {
                moveList = mutableListOf<Char>()
                for (time in 1..amount) {
                    moveList.add(crates[from]!!.removeLast())
                }
                crates[to]!!.addAll(moveList.reversed())
            } else {
                for (time in 1..amount) {
                    crates[to]!!.add(crates[from]!!.removeLast())
                }
            }
        }
        return crates
    }

    private fun getTopCrateLabels(crates: CrateMap): String {

        var string = ""
        for (key in crates.keys.sorted()) {
            string += crates[key]!!.last()
        }
        return string
    }
}