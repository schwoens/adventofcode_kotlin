package year2022.day2

import kotlin.test.Test
import kotlin.test.assertEquals

class Day2Test {

    private val testInput = "A Y\n" +
            "B X\n" +
            "C Z"

    private var day2 = Day2(testInput)

    @Test
    fun testPart1() {
        assertEquals(15, day2.part1())
    }

    @Test
    fun testPart2() {
        assertEquals(12, day2.part2())
    }
}