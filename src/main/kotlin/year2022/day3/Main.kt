package year2022.day3

fun main() {

    val input = Day3::class.java.getResource("/year2022/day3.txt")!!.readText()
    val day3 = Day3(input)

    println("Part 1: ${day3.part1()}")
}