package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void shouldFindLongestSubstringWithoutRepeats() {
        assertThat(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb")).isEqualTo(3);
    }

    @Test
    public void shouldReturnOneForAllRepeatingCharacters() {
        assertThat(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb")).isEqualTo(1);
    }

    @Test
    public void shouldFindSubstringWithNonAdjacentRepeats() {
        assertThat(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew")).isEqualTo(3);
    }

    @Test
    public void shouldReturnZeroForEmptyString() {
        assertThat(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("")).isEqualTo(0);
    }
}
