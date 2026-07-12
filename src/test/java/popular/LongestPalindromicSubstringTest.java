package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LongestPalindromicSubstringTest {

    @Test
    public void testCase1() {
        assertThat(new LongestPalindromicSubstring().longestPalindrome("babad")).isEqualTo("bab");
    }

    @Test
    public void testCase2() {
        assertThat(new LongestPalindromicSubstring().longestPalindrome("cbbd")).isEqualTo("bb");
    }

    @Test
    public void testCase3() {
        assertThat(new LongestPalindromicSubstring().longestPalindrome("a")).isEqualTo("a");
    }

    @Test
    public void testCase4() {
        assertThat(new LongestPalindromicSubstring().longestPalindrome("ac")).isEqualTo("a");
    }
}

