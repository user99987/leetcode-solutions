package string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromeTest {

    @Test
    void testCase1() {
        assertEquals(7, new LongestPalindrome().longestPalindrome("abccccdd"));
    }

    @Test
    void testCase2() {
        assertEquals(1, new LongestPalindrome().longestPalindrome("a"));
    }

    @Test
    void testCase3() {
        assertEquals(2, new LongestPalindrome().longestPalindrome("bb"));
    }
}
