package binarysearch;

/**
 * Medium
 * <p>
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
 * <p>
 * Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
 * <p>
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
 * <p>
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 * <p>
 * Example 1:
 * <p>
 * Input: piles = [3,6,7,11], h = 8
 * <p>
 * Output: 4
 * <p>
 * Example 2:
 * <p>
 * Input: piles = [30,11,23,4,20], h = 5
 * <p>
 * Output: 30
 * <p>
 * Example 3:
 * <p>
 * Input: piles = [30,11,23,4,20], h = 6
 * <p>
 * Output: 23
 * <p>
 * Constraints:
 * <p>
 * 1 <= piles.length <= 10^4
 * piles.length <= h <= 10^9
 * 1 <= piles[i] <= 10^9
 */
public class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {
        int maxP = 0;
        long sumP = 0;
        for (int pile : piles) {
            maxP = Math.max(maxP, pile);
            sumP += pile;
        }

        int low = (int) ((sumP - 1) / h + 1);
        int high = maxP;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canFinish(piles, mid, h)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean canFinish(int[] piles, int speed, int h) {
        int totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + speed - 1) / speed;
        }
        return totalHours <= h;
    }
}
