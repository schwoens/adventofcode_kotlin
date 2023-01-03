package year2022.day7

fun main() {

    val input = Day7::class.java.getResource("/year2022/day7.txt")!!.readText()
    val day7 = Day7(input)

    println("Part 1: ${day7.part1()}")
}