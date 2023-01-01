package year2022.day4

class AssignmentPair(
    private val assignment1: Pair<Int, Int>,
    private val assignment2: Pair<Int, Int>,
) {

    companion object {
        fun fromString(string: String): AssignmentPair {
            val (pair1, pair2) = string.split(",")

            val (begin1, end1) = pair1.split("-")
            val (begin2, end2) = pair2.split("-")

            val assignment1 = Pair(begin1.toInt(), end1.toInt())
            val assignment2 = Pair(begin2.toInt(), end2.toInt())

            return AssignmentPair(assignment1, assignment2)
        }
    }

    fun oneFullyContainsOther(): Boolean {
        return (assignment1.first >= assignment2.first && assignment1.second <= assignment2.second)
                || (assignment2.first >= assignment1.first && assignment2.second <= assignment1.second)
    }

    fun onePartlyContainsOther(): Boolean {

        val assignment1Set = (assignment1.first..assignment1.second).toSet()
        val assignment2Set = (assignment2.first..assignment2.second).toSet()

        return assignment1Set.contains(assignment2.first) || assignment1Set.contains(assignment2.second)
                || assignment2Set.contains(assignment1.first) || assignment2Set.contains(assignment1.second)
    }

}
