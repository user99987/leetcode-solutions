package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindWordsThatCanBeFormedByCharactersTest {

    @Test
    void testCase1() {
        String[] words = {"cat", "bt", "hat", "tree"};
        var chars = "atach";
        assertThat(new FindWordsThatCanBeFormedByCharacters().countCharacters(words, chars)).isEqualTo(6);
    }

    @Test
    void testCase2() {
        String[] words = {"hello", "world", "leetcode"};
        var chars = "welldonehoneyr";
        assertThat(new FindWordsThatCanBeFormedByCharacters().countCharacters(words, chars)).isEqualTo(10);
    }
}
