package year2022.day6

import kotlin.test.Test
import kotlin.test.assertEquals

class Day6Test {

    private val testInput = "mjqjpqmgbljsphdztnvjfqwrcgsmlb"
    private val day6 = Day6(testInput)

    @Test
    fun testPart1() {
        assertEquals(7, day6.part1())
    }

    @Test
    fun testPart2() {
        assertEquals(19, day6.part2())
    }
}