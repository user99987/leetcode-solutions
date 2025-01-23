package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumWindowSubstringTest {

    @Test
    public void testCase1() {
        assertEquals("BANC", new MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    public void testCase2() {
        assertEquals("a", new MinimumWindowSubstring().minWindow("a", "a"));
    }

    @Test
    public void testCase3() {
        assertEquals("", new MinimumWindowSubstring().minWindow("a", "aa"));
    }
}
