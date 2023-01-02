package year2022.day5

import kotlin.test.Test
import kotlin.test.assertEquals

class Day5Test {

    private val testInput = "    [D]    \n" +
            "[N] [C]    \n" +
            "[Z] [M] [P]\n" +
            " 1   2   3 \n" +
            "\n" +
            "move 1 from 2 to 1\n" +
            "move 3 from 1 to 3\n" +
            "move 2 from 2 to 1\n" +
            "move 1 from 1 to 2"

    private val day5 = Day5(testInput)

    @Test
    fun testPart1() {
        assertEquals("CMZ", day5.part1())
    }

    @Test
    fun testPart2() {
        assertEquals("MCD", day5.part2())
    }
}