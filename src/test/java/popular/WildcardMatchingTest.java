package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WildcardMatchingTest {

    @Test
    public void testCase1() {
        assertFalse(new WildcardMatching().isMatch("aa", "a"));
    }

    @Test
    public void testCase2() {
        assertTrue(new WildcardMatching().isMatch("aa", "*"));
    }

    @Test
    public void testCase3() {
        assertFalse(new WildcardMatching().isMatch("cb", "?a"));
    }

    @Test
    public void testCase4() {
        assertTrue(new WildcardMatching().isMatch("adceb", "*a*b"));
    }

    @Test
    public void testCase5() {
        assertFalse(new WildcardMatching().isMatch("acdcb", "a*c?b"));
    }
}
