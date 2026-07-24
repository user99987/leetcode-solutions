package array

/**
 * Medium
 *
 * Return an array answer such that answer[i] is equal to the product of all the elements of
 * nums except nums[i], without using division, in O(n) time.
 */
class ProductOfArrayExceptSelfK {

    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val result = IntArray(n)

        var leftProduct = 1
        for (i in 0 until n) {
            result[i] = leftProduct
            leftProduct *= nums[i]
        }

        var rightProduct = 1
        for (i in n - 1 downTo 0) {
            result[i] *= rightProduct
            rightProduct *= nums[i]
        }

        return result
    }
}

