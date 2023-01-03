package year2022.day7

class Directory(
    private val name: String,
    var parentDirectory: Directory? = null,
    val subdirectories: MutableList<Directory> = mutableListOf(),
    private val files: MutableList<File> = mutableListOf()
) {

    fun addSubdirectory(subdirectory: Directory) {
        subdirectory.parentDirectory = this
        subdirectories.add(subdirectory)
    }

    fun addFile(file: File) {
        files.add(file)
    }

    fun print(offset: Int = 0) {

        var offsetString = ""
        for (i in 1..offset) {
            offsetString += " "
        }

        println(offsetString + "dir " + name)

        for (subdirectory in subdirectories) {
            subdirectory.print(offset + 2)
        }
        for (file in files) {
            println(offsetString + "  " + file.size + " " + file.name)
        }
    }

    fun getSize(): Int {
        var size = 0

        for (subdirectory in subdirectories) {
            size += subdirectory.getSize()
        }
        for (file in files) {
            size += file.size
        }
        return size
    }

    fun getSizes(): List<Int> {

        val sizes = mutableListOf<Int>()
        sizes.add(getSize())

        for (subdirectory in subdirectories) {
            sizes.addAll(subdirectory.getSizes())
        }
        return sizes
    }
}