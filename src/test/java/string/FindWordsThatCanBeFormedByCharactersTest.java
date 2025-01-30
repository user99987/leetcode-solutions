package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindWordsThatCanBeFormedByCharactersTest {

    @Test
    void testCase1() {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        assertEquals(6, new FindWordsThatCanBeFormedByCharacters().countCharacters(words, chars));
    }

    @Test
    void testCase2() {
        String[] words = {"hello", "world", "leetcode"};
        String chars = "welldonehoneyr";
        assertEquals(10, new FindWordsThatCanBeFormedByCharacters().countCharacters(words, chars));
    }
}
