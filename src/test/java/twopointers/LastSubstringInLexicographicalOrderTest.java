package twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LastSubstringInLexicographicalOrderTest {

    @Test
    public void testCase1() {
        var actual = new LastSubstringInLexicographicalOrder().lastSubstring("abab");
        var expected = "bab";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        var actual = new LastSubstringInLexicographicalOrder().lastSubstring("leetcode");
        var expected = "tcode";
        assertThat(actual).isEqualTo(expected);
    }
}
