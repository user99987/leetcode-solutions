package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountDifferentPalindromicSubsequencesTest {

    @Test
    public void testCase1() {
        assertEquals(6, new CountDifferentPalindromicSubsequences().countPalindromicSubsequences("bccb"));
    }

    @Test
    public void testCase2() {
        assertEquals(104860361, new CountDifferentPalindromicSubsequences().countPalindromicSubsequences(
                "abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba"));
    }
}
