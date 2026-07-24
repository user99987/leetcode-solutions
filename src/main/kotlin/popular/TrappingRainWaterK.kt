package popular

/**
 * Hard
 * Trapping Rain Water
 */
class TrappingRainWaterK {

    fun trap(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var leftMax = 0
        var rightMax = 0
        var trappedWater = 0
        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = maxOf(leftMax, height[left])
                trappedWater += leftMax - height[left++]
            } else {
                rightMax = maxOf(rightMax, height[right])
                trappedWater += rightMax - height[right--]
            }
        }
        return trappedWater
    }
}

