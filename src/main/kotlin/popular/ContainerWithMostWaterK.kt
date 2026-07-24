package popular

/**
 * Medium
 * Container With Most Water
 */
class ContainerWithMostWaterK {

    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxArea = 0
        while (left < right) {
            maxArea = maxOf(maxArea, (right - left) * minOf(height[left], height[right]))
            if (height[left] < height[right]) left++ else right--
        }
        return maxArea
    }
}

