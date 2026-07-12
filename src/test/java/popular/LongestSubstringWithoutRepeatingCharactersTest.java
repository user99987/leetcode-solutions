package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void testCase1() {
        assertThat(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb")).isEqualTo(3);
    }

    @Test
    public void testCase2() {
        assertThat(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb")).isEqualTo(1);
    }

    @Test
    public void testCase3() {
        assertThat(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew")).isEqualTo(3);
    }

    @Test
    public void testCase4() {
        assertThat(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("")).isEqualTo(0);
    }
}
