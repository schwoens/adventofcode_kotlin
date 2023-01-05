package year2022.day8

import kotlin.streams.toList

class Day8(private val input: String) {

    fun part1(): Int {
        return countVisibleTrees()
    }

    fun part2(): Int {
        return getHighestScenicScore()
    }

    private fun countVisibleTrees(): Int {

        var count = 0
        val grid = getGrid()
        for (y in grid.indices) {
            for (x in grid[y].indices) {
                if (treeIsVisible(x, y, grid)) {
                    count++
                }
            }
        }
        return count
    }

    private fun treeIsVisible(x: Int, y: Int, grid: List<List<Int>>): Boolean {

        val height = grid[y][x]

        var xray = 1
        var visible = true
        while (x + xray < grid[y].size) {
            if (grid[y][x+xray] >= height) {
                visible = false
            }
            xray++
        }

        if (visible) {
            return true
        }

        xray = -1
        visible = true
        while (x + xray >= 0) {
            if (grid[y][x+xray] >= height) {
                visible = false
            }
            xray--
        }

        if (visible) {
            return true
        }

        var yray = 1
        visible = true
        while (y + yray < grid.size) {
            if (grid[y+yray][x] >= height) {
                visible = false
            }
            yray++
        }

        if (visible) {
            return true
        }

        yray = -1
        visible = true
        while (y + yray >= 0 ) {
            if (grid[y+yray][x] >= height) {
                visible = false
            }
            yray--
        }

        return visible
    }

    private fun getHighestScenicScore(): Int {
        val grid = getGrid()
        val scenicScores = mutableSetOf<Int>()

        for (y in grid.indices) {
            for (x in grid[y].indices) {
                scenicScores.add(getScenicScore(x, y, grid))
            }
        }
        return scenicScores.max()
    }

    private fun getScenicScore(x: Int, y: Int, grid: List<List<Int>>): Int {
        val height = grid[y][x]

        var rightView = 0
        var xray = 1
        while (x + xray < grid[y].size) {
            rightView++
            if (grid[y][x + xray] >= height) {
                break
            }
            xray++
        }

        var leftView = 0
        xray = -1
        while (x + xray >= 0) {
            leftView++
            if (grid[y][x + xray] >= height) {
                break
            }
            xray--
        }

        var downView = 0
        var yray = 1
        while (y + yray < grid.size) {
            downView++
            if (grid[y + yray][x] >= height) {
                break
            }
            yray++
        }

        var upView = 0
        yray = -1
        while (y + yray >= 0) {
            upView++
            if (grid[y + yray][x] >= height) {
                break
            }
            yray--
        }

        return rightView * leftView * downView * upView
    }

    private fun getGrid(): List<List<Int>> {
        return input.split("\n")
            .map {
                line -> line.chars()
                .map { char -> char.toChar().digitToInt() }
                .toList()
            }
    }
}