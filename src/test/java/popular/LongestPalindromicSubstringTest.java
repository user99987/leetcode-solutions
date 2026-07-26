package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LongestPalindromicSubstringTest {

    @Test
    public void shouldFindPalindromeWhenMultipleExist() {
        assertThat(new LongestPalindromicSubstring().longestPalindrome("babad")).isEqualTo("bab");
    }

    @Test
    public void shouldFindEvenLengthPalindrome() {
        assertThat(new LongestPalindromicSubstring().longestPalindrome("cbbd")).isEqualTo("bb");
    }

    @Test
    public void shouldReturnSingleCharacterAsPalindrome() {
        assertThat(new LongestPalindromicSubstring().longestPalindrome("a")).isEqualTo("a");
    }

    @Test
    public void shouldReturnFirstCharacterWhenNoPalindromeLongerThanOne() {
        assertThat(new LongestPalindromicSubstring().longestPalindrome("ac")).isEqualTo("a");
    }
}

