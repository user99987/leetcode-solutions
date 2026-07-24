package popular

/**
 * Medium
 * PermutationsK
 */
class PermutationsK {

    fun permute(nums: IntArray): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        permuteHelper(nums, ArrayList(), BooleanArray(nums.size), result)
        return result
    }

    private fun permuteHelper(nums: IntArray, current: MutableList<Int>, used: BooleanArray, result: MutableList<List<Int>>) {
        if (current.size == nums.size) {
            result.add(ArrayList(current))
            return
        }

        for (i in nums.indices) {
            if (used[i]) {
                continue
            }
            used[i] = true
            current.add(nums[i])
            permuteHelper(nums, current, used, result)
            current.removeAt(current.size - 1)
            used[i] = false
        }
    }
}

