package year2022.day7

import kotlin.test.Test
import kotlin.test.assertEquals

class Day7Test {

    private val testInput = "\$ cd /\n" +
            "\$ ls\n" +
            "dir a\n" +
            "14848514 b.txt\n" +
            "8504156 c.dat\n" +
            "dir d\n" +
            "\$ cd a\n" +
            "\$ ls\n" +
            "dir e\n" +
            "29116 f\n" +
            "2557 g\n" +
            "62596 h.lst\n" +
            "\$ cd e\n" +
            "\$ ls\n" +
            "584 i\n" +
            "\$ cd ..\n" +
            "\$ cd ..\n" +
            "\$ cd d\n" +
            "\$ ls\n" +
            "4060174 j\n" +
            "8033020 d.log\n" +
            "5626152 d.ext\n" +
            "7214296 k"

    private val day7 = Day7(testInput)

    @Test
    fun testPart1() {
        assertEquals(95437, day7.part1())
    }
}