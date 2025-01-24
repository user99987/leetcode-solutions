package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromicSubstringsTest {

    @Test
    public void testCase1() {
        assertEquals(3, new PalindromicSubstrings().countSubstrings("abc"));
    }

    @Test
    public void testCase2() {
        assertEquals(6, new PalindromicSubstrings().countSubstrings("aaa"));
    }

    @Test
    public void testCase3() {
        assertEquals(1, new PalindromicSubstrings().countSubstrings("a"));
    }

    @Test
    public void testCase4() {
        assertEquals(0, new PalindromicSubstrings().countSubstrings(""));
    }

}
