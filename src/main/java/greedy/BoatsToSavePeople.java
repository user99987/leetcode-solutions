package greedy;

import java.util.Arrays;

/**
 * Medium
 * <p>
 * You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.
 * <p>
 * Return the minimum number of boats to carry every given person.
 * <p>
 * Example 1:
 * <p>
 * Input: people = [1,2], limit = 3
 * <p>
 * Output: 1
 * <p>
 * Explanation: 1 boat (1, 2)
 * <p>
 * Example 2:
 * <p>
 * Input: people = [3,2,2,1], limit = 3
 * <p>
 * Output: 3
 * <p>
 * Explanation: 3 boats (1, 2), (2) and (3)
 * <p>
 * Example 3:
 * <p>
 * Input: people = [3,5,3,4], limit = 5
 * <p>
 * Output: 4
 * <p>
 * Explanation: 4 boats (3), (3), (4), (5)
 * <p>
 * Constraints:
 * <p>
 * 1 <= people.length <= 5 * 10^4
 * 1 <= people[i] <= limit <= 3 * 10^4
 */
public class BoatsToSavePeople {
    public static void main(String[] args) {
        int[] A = {3, 5, 3, 4};
        System.out.println(new BoatsToSavePeople().numRescueBoats(A, 8));
    }

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        int boats = 0;
        while (i < j) {
            if (people[i] + people[j] <= limit) {
                boats++;
                i++;
                j--;
            } else if (people[i] + people[j] > limit) {
                boats++;
                j--;
            }
        }
        if (i == j) {
            return boats + 1;
        }
        return boats;
    }
}
