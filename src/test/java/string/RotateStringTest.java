package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RotateStringTest {

    @Test
    void testCase1() {
        assertTrue(new RotateString().rotateString("abcde", "cdeab"));
    }

    @Test
    void testCase2() {
        assertFalse(new RotateString().rotateString("abcde", "abced"));
    }

    @Test
    void testCase3() {
        assertTrue(new RotateString().rotateString("a", "a"));
    }

    @Test
    void testCase4() {
        assertFalse(new RotateString().rotateString("abc", "abcd"));
    }
}
