package year2022.day1

fun main() {
    val input = Day1::class.java.getResource("/year2022/day1.txt")!!.readText()
    val day1 = Day1(input)

    println("Part 1: ${day1.part1()}")
    println("Part 2: ${day1.part2()}")
}