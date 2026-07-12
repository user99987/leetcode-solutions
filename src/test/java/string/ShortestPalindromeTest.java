package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShortestPalindromeTest {

    @Test
    void testCase1() {
        assertThat(new ShortestPalindrome().shortestPalindrome("aacecaaa")).isEqualTo("aaacecaaa");
    }

    @Test
    void testCase2() {
        assertThat(new ShortestPalindrome().shortestPalindrome("abcd")).isEqualTo("dcbabcd");
    }

    @Test
    void testCase3() {
        assertThat(new ShortestPalindrome().shortestPalindrome("a")).isEqualTo("a");
    }

    @Test
    void testCase4() {
        assertThat(new ShortestPalindrome().shortestPalindrome("")).isEqualTo("");
    }
}
