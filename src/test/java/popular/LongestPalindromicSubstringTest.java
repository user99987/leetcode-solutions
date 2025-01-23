package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromicSubstringTest {

    @Test
    public void testCase1() {
        assertEquals("bab", new LongestPalindromicSubstring().longestPalindrome("babad"));
    }

    @Test
    public void testCase2() {
        assertEquals("bb", new LongestPalindromicSubstring().longestPalindrome("cbbd"));
    }

    @Test
    public void testCase3() {
        assertEquals("a", new LongestPalindromicSubstring().longestPalindrome("a"));
    }

    @Test
    public void testCase4() {
        assertEquals("a", new LongestPalindromicSubstring().longestPalindrome("ac"));
    }
}

