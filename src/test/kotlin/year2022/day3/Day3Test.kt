package year2022.day3

import kotlin.test.Test
import kotlin.test.assertEquals

class Day3Test {

    val testInput = "vJrwpWtwJgWrhcsFMMfFFhFp\n" +
            "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL\n" +
            "PmmdzqPrVvPwwTWBwg\n" +
            "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn\n" +
            "ttgJtRGJQctTZtZT\n" +
            "CrZsJsPPZsGzwwsLwLmpwMDw"

    val day3 = Day3(testInput)

    @Test
    fun testPart1() {
        assertEquals(157, day3.part1())
    }

    @Test
    fun testPart2() {
        assertEquals(70, day3.part2())
    }
}