package year2022.day6

fun main() {

    val input = Day6::class.java.getResource("/year2022/day6.txt")!!.readText()
    val day6 = Day6(input)

    println("Part 1: ${day6.part1()}")
    println("Part 2: ${day6.part2()}")
}