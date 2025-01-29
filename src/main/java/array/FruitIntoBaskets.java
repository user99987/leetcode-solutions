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
        int lastFruit = -1;
        int secondLastFruit = -1;
        int lastFruitCount = 0;
        int currentMax = 0;
        int maxTotal = 0;

        for (int fruit : fruits) {
            if (fruit == lastFruit || fruit == secondLastFruit) {
                currentMax++;
            } else {
                currentMax = lastFruitCount + 1;
            }

            if (fruit == lastFruit) {
                lastFruitCount++;
            } else {
                secondLastFruit = lastFruit;
                lastFruit = fruit;
                lastFruitCount = 1;
            }

            maxTotal = Math.max(maxTotal, currentMax);
        }

        return maxTotal;
    }

}
