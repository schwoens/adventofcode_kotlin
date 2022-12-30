package year2022.day1

import kotlin.test.Test
import kotlin.test.assertEquals

class Day1Test {

    private val testInput = "1000\n" +
            "2000\n" +
            "3000\n" +
            "\n" +
            "4000\n" +
            "\n" +
            "5000\n" +
            "6000\n" +
            "\n" +
            "7000\n" +
            "8000\n" +
            "9000\n" +
            "\n" +
            "10000"

    private var day1 = Day1(testInput)

    @Test
    fun testPart1() {
        assertEquals(24000, day1.part1())
    }

    @Test
    fun testPart2() {
        assertEquals(45000, day1.part2())
    }

}