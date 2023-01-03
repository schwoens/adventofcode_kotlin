package year2022.day7

class Day7(private val input: String) {

    fun part1(): Int {
        return FileTree.fromTerminalOutput(input, 70000000).getSizeSum(100000)
    }

    fun part2(): Int {
        return FileTree.fromTerminalOutput(input, 70000000).findSmallestDeleteSize(30000000)
    }
}