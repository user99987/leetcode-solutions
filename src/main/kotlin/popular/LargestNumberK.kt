package popular

/**
 * Medium
 * Largest Number
 */
class LargestNumberK {

    fun largestNumber(nums: IntArray): String {
        val largestNumber = nums.map { it.toString() }
            .sortedWith { o1, o2 -> (o2 + o1).compareTo(o1 + o2) }
            .joinToString("")
        return if (largestNumber[0] == '0') "0" else largestNumber
    }
}

