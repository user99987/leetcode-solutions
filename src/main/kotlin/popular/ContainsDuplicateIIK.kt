package popular

/**
 * Easy
 * Contains Duplicate II
 */
class ContainsDuplicateIIK {

    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            if (map.containsKey(nums[i]) && Math.abs(map[nums[i]]!! - i) <= k) {
                return true
            }
            map[nums[i]] = i
        }
        return false
    }
}

