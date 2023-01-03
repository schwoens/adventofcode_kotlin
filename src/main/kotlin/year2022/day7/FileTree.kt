package year2022.day7

class FileTree(private val root: Directory, private val totalSpace: Int) {

    companion object {

        fun fromTerminalOutput(terminalOutput: String, totalSpace: Int): FileTree {

            var currentDirectory = Directory("/")
            val fileTree = FileTree(currentDirectory, totalSpace)

            var split: List<String>

            for (line in terminalOutput.split("\n")) {
                split = line.split(" ")

                if (split[1] == "cd") {
                    if (split[2] == "/") {
                        continue
                    }
                    if (split[2] == "..") {
                        currentDirectory = currentDirectory.parentDirectory!!
                        continue
                    }
                    currentDirectory.addSubdirectory(Directory(split[2]))
                    currentDirectory = currentDirectory.subdirectories.last()
                } else if (split.first().toIntOrNull() != null) {
                    currentDirectory.addFile(File(split[1], split[0].toInt()))
                }
            }
            return fileTree
        }
    }

    fun print() {
        root.print()
    }

    fun getSizeSum(max: Int): Int {
        val sizes = root.getSizes()
        var sum = 0
        for (value in sizes) {
            if (value <= max) {
                sum += value
            }
        }
        return sum
    }

    fun getAvailableSpace(): Int {
        return totalSpace - root.getSize()
    }

    fun findSmallestDeleteSize(neededSpace: Int): Int {

        val deleteMinimum = neededSpace - getAvailableSpace()
        var sizes = root.getSizes()
        sizes = sizes.filter { it >= deleteMinimum }

        return sizes.min()
    }
}
