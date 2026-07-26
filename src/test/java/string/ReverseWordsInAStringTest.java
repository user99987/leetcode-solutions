package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseWordsInAStringTest {

    @Test
    void shouldReverseWordsInSimpleSentence() {
        var input = "the sky is blue";
        var expected = "blue is sky the";
        assertThat(new ReverseWordsInAString().reverseWords(input)).isEqualTo(expected);
    }

    @Test
    void shouldTrimLeadingAndTrailingSpaces() {
        var input = " hello world ";
        var expected = "world hello";
        assertThat(new ReverseWordsInAString().reverseWords(input)).isEqualTo(expected);
    }

    @Test
    void shouldCollapseMultipleSpacesBetweenWords() {
        var input = "a good example";
        var expected = "example good a";
        assertThat(new ReverseWordsInAString().reverseWords(input)).isEqualTo(expected);
    }

    @Test
    void shouldReverseWordsWithExtraSurroundingSpaces() {
        var input = " Bob Loves Alice ";
        var expected = "Alice Loves Bob";
        assertThat(new ReverseWordsInAString().reverseWords(input)).isEqualTo(expected);
    }

    @Test
    void shouldReverseLongerSentence() {
        var input = "Alice does not even like bob";
        var expected = "bob like even not does Alice";
        assertThat(new ReverseWordsInAString().reverseWords(input)).isEqualTo(expected);
    }
}
