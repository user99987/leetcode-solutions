package popular;

/**
 * Medium
 * <p>
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
 * <p>
 * Notice that you may not slant the container.
 * <p>
 * Example 1:
 * <p>
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * <p>
 * Output: 49
 * <p>
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 * <p>
 * Example 2:
 * <p>
 * Input: height = [1,1]
 * <p>
 * Output: 1
 * <p>
 * Example 3:
 * <p>
 * Input: height = [4,3,2,1,4]
 * <p>
 * Output: 16
 * <p>
 * Example 4:
 * <p>
 * Input: height = [1,2,1]
 * <p>
 * Output: 2
 * <p>
 * Constraints:
 * <p>
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
 */
public class ContainerWithMostWater {

    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        // Test cases
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Example 1 Output: " + solution.maxArea(height1));

        int[] height2 = {1, 1};
        System.out.println("Example 2 Output: " + solution.maxArea(height2));

        int[] height3 = {4, 3, 2, 1, 4};
        System.out.println("Example 3 Output: " + solution.maxArea(height3));

        int[] height4 = {1, 2, 1};
        System.out.println("Example 4 Output: " + solution.maxArea(height4));
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

}
