package popular

/**
 * Medium
 * Maximum Product Subarray
 */
class MaximumProductSubarrayK {

    fun maxProduct(nums: IntArray): Int {
        var maxProd = nums[0]
        var minProd = nums[0]
        var result = nums[0]
        for (i in 1 until nums.size) {
            val temp = maxProd
            maxProd = maxOf(nums[i], maxOf(maxProd * nums[i], minProd * nums[i]))
            minProd = minOf(nums[i], minOf(temp * nums[i], minProd * nums[i]))
            result = maxOf(result, maxProd)
        }
        return result
    }
}

