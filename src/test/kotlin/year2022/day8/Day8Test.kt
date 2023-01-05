package year2022.day8

import kotlin.test.Test
import kotlin.test.assertEquals

class Day8Test {

    private val testInput = "30373\n" +
            "25512\n" +
            "65332\n" +
            "33549\n" +
            "35390"

    private val day8 = Day8(testInput)

    @Test
    fun testPart1() {
        assertEquals(21, day8.part1())
    }
}