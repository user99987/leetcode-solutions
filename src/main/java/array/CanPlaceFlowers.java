package array;

/**
 * Easy
 * <p>
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 * <p>
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
 * <p>
 * Example 1:
 * <p>
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * 1 <= flowerbed.length <= 2 * 104
 * flowerbed[i] is 0 or 1.
 * There are no two adjacent flowers in flowerbed.
 * 0 <= n <= flowerbed.length
 */
public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && n > 0) {
                boolean left = i == 0 || flowerbed[i - 1] == 0;
                boolean right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
                if (left && right) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
            if (n == 0) {
                break;
            }
        }
        return n == 0;
    }
}
