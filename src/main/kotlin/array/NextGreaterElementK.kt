package array

/**
 * Easy
 *
 * For each element in nums1, find the index j in nums2 and determine the next greater element
 * of nums2[j] in nums2. If there is none, the answer is -1.
 */
class NextGreaterElementK {

    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val nextGreaterMap = HashMap<Int, Int>()
        val stack = ArrayDeque<Int>()

        for (num in nums2) {
            while (stack.isNotEmpty() && stack.first() < num) {
                nextGreaterMap[stack.removeFirst()] = num
            }
            stack.addFirst(num)
        }

        return IntArray(nums1.size) { nextGreaterMap.getOrDefault(nums1[it], -1) }
    }
}

