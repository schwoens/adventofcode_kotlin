package year2022.day5

fun main() {

    val input = Day5::class.java.getResource("/year2022/day5.txt")!!.readText()
    val day5 = Day5(input)

    println("Part 1: ${day5.part1()}")
    println("Part 2: ${day5.part2()}")
}