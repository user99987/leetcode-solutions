package twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfMatchingSubsequencesTest {

    @Test
    public void shouldCountMatchingSubsequencesForBasicExample() {
        assertThat(new NumberOfMatchingSubsequences().numMatchingSubseq("abcde", new String[]{"a", "bb", "acd", "ace"})).isEqualTo(3);
    }

    @Test
    public void shouldCountMatchingSubsequencesForLongerString() {
        assertThat(new NumberOfMatchingSubsequences().numMatchingSubseq("dsahjpjauf", new String[]{"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"})).isEqualTo(2);
    }

    @Test
    public void shouldMatchSingleCharacterWordAgainstSingleCharacterString() {
        assertThat(new NumberOfMatchingSubsequences().numMatchingSubseq("a", new String[]{"a"})).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroWhenNoWordsMatch() {
        assertThat(new NumberOfMatchingSubsequences().numMatchingSubseq("abc", new String[]{"d", "e", "f"})).isEqualTo(0);
    }

    @Test
    public void shouldReturnFullCountWhenAllWordsMatch() {
        assertThat(new NumberOfMatchingSubsequences().numMatchingSubseq("abcabc", new String[]{"a", "b", "c", "abc", "bc"})).isEqualTo(5);
    }

    @Test
    public void shouldCountDuplicateWordsSeparately() {
        assertThat(new NumberOfMatchingSubsequences().numMatchingSubseq("abc", new String[]{"a", "a", "a"})).isEqualTo(3);
    }

    @Test
    public void shouldNotCountWordLongerThanRemainingMatchPossibility() {
        assertThat(new NumberOfMatchingSubsequences().numMatchingSubseq("ab", new String[]{"aba"})).isEqualTo(0);
    }
}
