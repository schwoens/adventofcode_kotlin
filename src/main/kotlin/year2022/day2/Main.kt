package year2022.day2

fun main() {

    val input = Day2::class.java.getResource("/year2022/day2.txt")!!.readText()
    val day2 = Day2(input)

    println("Part 1: ${day2.part1()}")
    println("Part 2: ${day2.part2()}")
}