package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InterleavingStringTest {

    @Test
    public void testCase1() {
        assertTrue(new InterleavingString().isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    public void testCase2() {
        assertFalse(new InterleavingString().isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }

    @Test
    public void testCase3() {
        assertTrue(new InterleavingString().isInterleave("", "", ""));
    }
}
