package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromeTest {

    @Test
    public void testCase1() {
        assertTrue(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testCase2() {
        assertFalse(new ValidPalindrome().isPalindrome("race a car"));
    }

    @Test
    public void testCase3() {
        assertTrue(new ValidPalindrome().isPalindrome(" "));
    }
}
