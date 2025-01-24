package dynamicprogramming;

/**
 * Medium
 * <p>
 * Alice and Bob play a game with piles of stones. There are an even number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].
 * <p>
 * The objective of the game is to end with the most stones. The total number of stones across all the piles is odd, so there are no ties.
 * <p>
 * Alice and Bob take turns, with Alice starting first. Each turn, a player takes the entire pile of stones either from the beginning or from the end of the row. This continues until there are no more piles left, at which point the person with the most stones wins.
 * <p>
 * Assuming Alice and Bob play optimally, return true if Alice wins the game, or false if Bob wins.
 * <p>
 * Example 1:
 * <p>
 * Input: piles = [5,3,4,5]
 * <p>
 * Output: true
 * <p>
 * Explanation:
 * <p>
 * Alice starts first, and can only take the first 5 or the last 5.
 * <p>
 * Say she takes the first 5, so that the row becomes [3, 4, 5].
 * <p>
 * If Bob takes 3, then the board is [4, 5], and Alice takes 5 to win with 10 points.
 * <p>
 * If Bob takes the last 5, then the board is [3, 4], and Alice takes 4 to win with 9 points.
 * <p>
 * This demonstrated that taking the first 5 was a winning move for Alice, so we return true.
 * <p>
 * Example 2:
 * <p>
 * Input: piles = [3,7,2,3]
 * <p>
 * Output: true
 * <p>
 * Constraints:
 * <p>
 * 2 <= piles.length <= 500
 * piles.length is even.
 * 1 <= piles[i] <= 500
 * sum(piles[i]) is odd.
 */
public class StoneGame {

    public boolean stoneGame(int[] piles) {
        int low = 0;
        int high = piles.length - 1;
        int alice = 0;
        int bob = 0;
        while (low < high) {
            alice += Math.max(piles[low], piles[high]);
            bob += Math.min(piles[low], piles[high]);
            low++;
            high--;
        }
        return alice > bob;
    }
}
