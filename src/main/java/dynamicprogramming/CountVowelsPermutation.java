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
 * Explanation: All possible strings are: “a”, “e”, “i” , “o” and “u”.
 * <p>
 * Example 2:
 * <p>
 * Input: n = 2
 * <p>
 * Output: 10
 * <p>
 * Explanation: All possible strings are: “ae”, “ea”, “ei”, “ia”, “ie”, “io”, “iu”, “oi”, “ou” and “ua”.
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
    public static void main(String[] args) {
        System.out.println(new CountVowelsPermutation().countVowelPermutation(5));
    }

    public int countVowelPermutation(int n) {
        int mod = (int) 1e9 + 7;
        int prevA = 1;
        int prevE = 1;
        int prevI = 1;
        int prevO = 1;
        int prevU = 1;
        while (n-- > 1) {
            int a = ((prevE + prevI) % mod + prevU) % mod;
            int e = (prevA + prevI) % mod;
            int i = (prevE + prevO) % mod;
            int o = prevI;
            int u = (prevI + prevO) % mod;
            prevA = a;
            prevE = e;
            prevI = i;
            prevO = o;
            prevU = u;
        }
        return ((((prevA + prevE) % mod + prevI) % mod + prevO) % mod + prevU) % mod;
    }
}
