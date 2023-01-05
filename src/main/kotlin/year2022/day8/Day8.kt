package year2022.day8

import kotlin.streams.toList

class Day8(private val input: String) {

    fun part1(): Int {
        return countVisibleTrees()
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

    private fun getGrid(): List<List<Int>> {
        return input.split("\n")
            .map {
                line -> line.chars()
                .map { char -> char.toChar().digitToInt() }
                .toList()
            }
    }
}