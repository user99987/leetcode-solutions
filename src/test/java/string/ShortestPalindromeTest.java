package string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShortestPalindromeTest {

    @Test
    void testCase1() {
        assertEquals("aaacecaaa", new ShortestPalindrome().shortestPalindrome("aacecaaa"));
    }

    @Test
    void testCase2() {
        assertEquals("dcbabcd", new ShortestPalindrome().shortestPalindrome("abcd"));
    }

    @Test
    void testCase3() {
        assertEquals("a", new ShortestPalindrome().shortestPalindrome("a"));
    }

    @Test
    void testCase4() {
        assertEquals("", new ShortestPalindrome().shortestPalindrome(""));
    }
}
