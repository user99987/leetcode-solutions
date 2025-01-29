package dynamicprogramming;

/**
 * Hard
 * <p>
 * Given an integer n, your task is to count how many strings of length n can be formed under the following rules:
 * <p>
 * Each character is a lower case vowel ('a', 'e', 'i', 'o', 'u')
 * Each vowel 'a' may only be followed by an 'e'.
 * Each vowel 'e' may only be followed by an 'a' or an 'i'.
 * Each vowel 'i' may not be followed by another 'i'.
 * Each vowel 'o' may only be followed by an 'i' or a 'u'.
 * Each vowel 'u' may only be followed by an 'a'.
 * Since the answer may be too large, return it modulo 10^9 + 7.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 1
 * <p>
 * Output: 5
 * <p>
 * Explanation: All possible strings are: "a", "e", "i" , "o" and "u".
 * <p>
 * Example 2:
 * <p>
 * Input: n = 2
 * <p>
 * Output: 10
 * <p>
 * Explanation: All possible strings are: "ae", "ea", "ei", "ia", "ie", "io", "iu", "oi", "ou" and "ua".
 * <p>
 * Example 3:
 * <p>
 * Input: n = 5
 * <p>
 * Output: 68
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 2 * 10^4
 */
public class CountVowelsPermutation {

    private static final int MOD = 1_000_000_007;

    public int countVowelPermutation(int n) {
        long a = 1, e = 1, i = 1, o = 1, u = 1;

        for (int j = 1; j < n; j++) {
            long newA = (e + i + u) % MOD;
            long newE = (a + i) % MOD;
            long newI = (e + o) % MOD;
            long newO = i % MOD;
            long newU = (i + o) % MOD;

            a = newA;
            e = newE;
            i = newI;
            o = newO;
            u = newU;
        }
        return (int) ((a + e + i + o + u) % MOD);
    }
}
