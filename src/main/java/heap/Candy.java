package heap;

import java.util.Arrays;

/**
 * Hard
 * <p>
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
 * <p>
 * You are giving candies to these children subjected to the following requirements:
 * <p>
 * Each child must have at least one candy.
 * Children with a higher rating get more candies than their neighbors.
 * Return the minimum number of candies you need to have to distribute the candies to the children.
 * <p>
 * Example 1:
 * <p>
 * Input: ratings = [1,0,2]
 * <p>
 * Output: 5
 * <p>
 * Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
 * <p>
 * Example 2:
 * <p>
 * Input: ratings = [1,2,2]
 * <p>
 * Output: 4
 * <p>
 * Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively. The third child gets 1 candy because it satisfies the above two conditions.
 * <p>
 * Constraints:
 * <p>
 * n == ratings.length
 * 1 <= n <= 2 * 10^4
 * 0 <= ratings[i] <= 2 * 10^4
 */
public class Candy {

    public static void main(String[] args) throws Exception {
        int[] ratings = {29, 51, 87, 87, 72, 12};
        System.out.println(new Candy().candy(ratings));
    }

    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);
        for (int i = 0; i < ratings.length - 1; i++) {
            if (ratings[i + 1] > ratings[i]) {
                candies[i + 1] = candies[i] + 1;
            }
        }
        for (int i = ratings.length - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i] && candies[i - 1] < candies[i] + 1) {
                candies[i - 1] = candies[i] + 1;
            }
        }
        int total = 0;
        for (int candy : candies) {
            total += candy;
        }
        return total;
    }
}
