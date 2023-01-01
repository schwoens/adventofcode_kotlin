package year2022.day4

fun main() {

    val input = Day4::class.java.getResource("/year2022/day4.txt")!!.readText()
    val day4 = Day4(input)

    println("Part 1: ${day4.part1()}")
    println("Part 2: ${day4.part2()}")
}