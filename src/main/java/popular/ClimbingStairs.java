package popular;

/**
 * Easy
 * <p>
 * You are climbing a staircase. It takes n steps to reach the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Example 1:
 * <p>
 * Input: n = 2
 * <p>
 * Output: 2
 * <p>
 * Explanation: There are two ways to climb to the top. 1. 1 step + 1 step 2. 2 steps
 * <p>
 * Example 2:
 * <p>
 * Input: n = 3
 * <p>
 * Output: 3
 * <p>
 * Explanation: There are three ways to climb to the top. 1. 1 step + 1 step + 1 step 2. 1 step + 2 steps 3. 2 steps + 1 step
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 45
 */
public class ClimbingStairs {

    public static void main(String[] args) throws Exception {
        System.out.println(new ClimbingStairs().climbStairs(2));
    }

    public int climbStairs(int n) {
        if (n == 0 || n == 1) return 1;
        int[] A = new int[n + 1];
        A[n] = 1;
        A[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) A[i] = A[i + 1] + A[i + 2];
        return A[0];
    }
}
