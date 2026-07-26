package twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LastSubstringInLexicographicalOrderTest {

    @Test
    public void shouldFindLastSubstringForRepeatingPattern() {
        assertThat(new LastSubstringInLexicographicalOrder().lastSubstring("abab")).isEqualTo("bab");
    }

    @Test
    public void shouldFindLastSubstringForWordExample() {
        assertThat(new LastSubstringInLexicographicalOrder().lastSubstring("leetcode")).isEqualTo("tcode");
    }

    @Test
    public void shouldReturnItselfForSingleCharacter() {
        assertThat(new LastSubstringInLexicographicalOrder().lastSubstring("a")).isEqualTo("a");
    }

    @Test
    public void shouldReturnFullStringWhenAllCharactersAreSame() {
        assertThat(new LastSubstringInLexicographicalOrder().lastSubstring("aaaa")).isEqualTo("aaaa");
    }

    @Test
    public void shouldReturnLastCharacterForStrictlyIncreasingCharacters() {
        assertThat(new LastSubstringInLexicographicalOrder().lastSubstring("abcde")).isEqualTo("e");
    }

    @Test
    public void shouldReturnWholeStringForStrictlyDecreasingCharacters() {
        assertThat(new LastSubstringInLexicographicalOrder().lastSubstring("edcba")).isEqualTo("edcba");
    }

    @Test
    public void shouldReturnLongestSuffixForRepeatedMaxCharacterAtEnd() {
        assertThat(new LastSubstringInLexicographicalOrder().lastSubstring("zzz")).isEqualTo("zzz");
    }
}
