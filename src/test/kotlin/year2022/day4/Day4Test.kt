package year2022.day4

import kotlin.test.Test
import kotlin.test.assertEquals

class Day4Test {

    private val input = "2-4,6-8\n" +
            "2-3,4-5\n" +
            "5-7,7-9\n" +
            "2-8,3-7\n" +
            "6-6,4-6\n" +
            "2-6,4-8"

    private val day4 = Day4(input)

    @Test
    fun testPart1() {
        assertEquals(2, day4.part1())
    }

    @Test
    fun testPart2() {
        assertEquals(4, day4.part2())
    }
}