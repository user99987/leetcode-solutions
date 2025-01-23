package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegularExpressionMatchingTest {

    @Test
    public void testCase1() {
        assertFalse(new RegularExpressionMatching().isMatch("aa", "a"));
    }

    @Test
    public void testCase2() {
        assertTrue(new RegularExpressionMatching().isMatch("aa", "a*"));
    }

    @Test
    public void testCase3() {
        assertTrue(new RegularExpressionMatching().isMatch("ab", ".*"));
    }

    @Test
    public void testCase4() {
        assertTrue(new RegularExpressionMatching().isMatch("aab", "c*a*b"));
    }

    @Test
    public void testCase5() {
        assertFalse(new RegularExpressionMatching().isMatch("mississippi", "mis*is*p*."));
    }
}
