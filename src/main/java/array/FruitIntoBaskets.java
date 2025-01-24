package array;

/**
 * Medium
 * <p>
 * You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
 * <p>
 * You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
 * <p>
 * You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
 * Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
 * Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
 * Given the integer array fruits, return the maximum number of fruits you can pick.
 * <p>
 * Example 1:
 * <p>
 * Input: fruits = [1,2,1]
 * <p>
 * Output: 3
 * <p>
 * Explanation: We can pick from all 3 trees.
 * <p>
 * Example 2:
 * <p>
 * Input: fruits = [0,1,2,2]
 * <p>
 * Output: 3
 * <p>
 * Explanation: We can pick from trees [1,2,2]. If we had started at the first tree, we would only pick from trees [0,1].
 * <p>
 * Example 3:
 * <p>
 * Input: fruits = [1,2,3,2,2]
 * <p>
 * Output: 4
 * <p>
 * Explanation: We can pick from trees [2,3,2,2]. If we had started at the first tree, we would only pick from trees [1,2].
 * <p>
 * Constraints:
 * <p>
 * 1 <= fruits.length <= 10^5
 * 0 <= fruits[i] < fruits.length
 */
public class FruitIntoBaskets {

    public int totalFruit(int[] fruits) {
        int end = 1;
        int basket1 = fruits[0];
        int basket2 = -1;
        int secondFruitIndex = -1;
        int maxTotal = 1;
        int counter = 1;
        while (end < fruits.length) {
            if (fruits[end - 1] != fruits[end]) {
                if (basket2 == -1) {
                    basket2 = fruits[end];
                    secondFruitIndex = end;
                    counter++;
                } else if (fruits[end] == basket1) {
                    basket1 = basket2;
                    basket2 = fruits[end];
                    secondFruitIndex = end;
                    counter++;
                } else {
                    counter = end - secondFruitIndex + 1;
                    basket1 = basket2;
                    basket2 = fruits[end];
                    secondFruitIndex = end;
                }
            } else {
                counter++;
            }
            end++;
            maxTotal = Math.max(maxTotal, counter);
        }
        return maxTotal;
    }

}
