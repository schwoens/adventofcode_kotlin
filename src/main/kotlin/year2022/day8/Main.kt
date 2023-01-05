package year2022.day8

fun main() {

    val input = Day8::class.java.getResource("/year2022/day8.txt")!!.readText()
    val day8 = Day8(input)

    println("Part 1: ${day8.part1()}")
    println("Part 2: ${day8.part2()}")
}