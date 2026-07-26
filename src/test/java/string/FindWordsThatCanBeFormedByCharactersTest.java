package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindWordsThatCanBeFormedByCharactersTest {

    @Test
    void shouldSumLengthsOfWordsFormableFromChars() {
        String[] words = {"cat", "bt", "hat", "tree"};
        var chars = "atach";
        assertThat(new FindWordsThatCanBeFormedByCharacters().countCharacters(words, chars)).isEqualTo(6);
    }

    @Test
    void shouldSumLengthsForLongerWordsFormableFromChars() {
        String[] words = {"hello", "world", "leetcode"};
        var chars = "welldonehoneyr";
        assertThat(new FindWordsThatCanBeFormedByCharacters().countCharacters(words, chars)).isEqualTo(10);
    }
}
