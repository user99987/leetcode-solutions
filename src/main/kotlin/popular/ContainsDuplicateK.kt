package popular

/**
 * Easy
 * Contains Duplicate
 */
class ContainsDuplicateK {

    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.toSet().size < nums.size
    }
}

