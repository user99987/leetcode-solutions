package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromicSubsequenceTest {

    @Test
    public void testCase1() {
        assertEquals(4, new LongestPalindromicSubsequence().longestPalindromeSubseq("bbbab"));
    }

    @Test
    public void testCase2() {
        assertEquals(2, new LongestPalindromicSubsequence().longestPalindromeSubseq("cbbd"));
    }
}

