package binarysearch;

/**
 * Easy
 * <p>
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * <p>
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * <p>
 * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 5, bad = 4
 * <p>
 * Output: 4
 * <p>
 * Explanation:
 * <p>
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 * Then 4 is the first bad version.
 * Example 2:
 * <p>
 * Input: n = 1, bad = 1
 * <p>
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * 1 <= bad <= n <= 2^31 - 1
 */
public class FirstBadVersion {

    public int firstBadVersion(int n, int bad) {
        int low = 1, high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid, bad)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean isBadVersion(int version, int bad) {
        return version >= bad;
    }
}
