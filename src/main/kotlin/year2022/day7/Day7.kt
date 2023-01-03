package year2022.day7

class Day7(private val input: String) {

    fun part1(): Int {
        return FileTree.fromTerminalOutput(input).getSizeSum(100000)
    }
}