package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PermutationInStringTest {

    @Test
    void testCase1() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        assertTrue(new PermutationInString().checkInclusion(s1, s2));
    }

    @Test
    void testCase2() {
        String s1 = "ab";
        String s2 = "eidboaoo";
        assertFalse(new PermutationInString().checkInclusion(s1, s2));
    }

    @Test
    void testCase3() {
        String s1 = "abc";
        String s2 = "ccccbabaaaa";
        assertTrue(new PermutationInString().checkInclusion(s1, s2));
    }

    @Test
    void testCase4() {
        String s1 = "abcd";
        String s2 = "efgh";
        assertFalse(new PermutationInString().checkInclusion(s1, s2));
    }

    @Test
    void testCase5() {
        String s1 = "a";
        String s2 = "a";
        assertTrue(new PermutationInString().checkInclusion(s1, s2));
    }
}
