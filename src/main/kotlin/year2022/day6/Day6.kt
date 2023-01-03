package year2022.day6

class Day6(private val input: String) {

    fun part1(): Int {
        return getFirstStartPosition()
    }

    fun part2(): Int {
        return getFirstStartPosition("message")
    }

    private fun getFirstStartPosition(mode: String = "packet"): Int {

        val sequenceLength = when (mode) {
            "packet" -> 4
            "message" -> 14
            else -> 0
        }

        var queue = ""
        for (index in input.indices) {
            if (queue.length >= sequenceLength) {
                if (queue.length == queue.toSet().size) {
                    return index
                }
                queue = queue.removeRange(0, 1)
            }
            queue += input[index]
        }
        return 0
    }
}