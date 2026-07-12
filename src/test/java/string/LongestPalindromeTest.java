package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestPalindromeTest {

    @Test
    void testCase1() {
        assertThat(new LongestPalindrome().longestPalindrome("abccccdd")).isEqualTo(7);
    }

    @Test
    void testCase2() {
        assertThat(new LongestPalindrome().longestPalindrome("a")).isEqualTo(1);
    }

    @Test
    void testCase3() {
        assertThat(new LongestPalindrome().longestPalindrome("bb")).isEqualTo(2);
    }
}
