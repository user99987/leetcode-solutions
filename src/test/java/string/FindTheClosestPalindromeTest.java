package string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindTheClosestPalindromeTest {

    @Test
    public void testCase1() {
        assertEquals("121", new FindTheClosestPalindrome().nearestPalindromic("123"));
    }

    @Test
    public void testCase2() {
        assertEquals("0", new FindTheClosestPalindrome().nearestPalindromic("1"));
    }

    @Test
    public void testCase3() {
        assertEquals("999", new FindTheClosestPalindrome().nearestPalindromic("1000"));
    }

    @Test
    public void testCase4() {
        assertEquals("99", new FindTheClosestPalindrome().nearestPalindromic("101"));
    }

    @Test
    public void testCase5() {
        assertEquals("7", new FindTheClosestPalindrome().nearestPalindromic("8"));
    }
}
