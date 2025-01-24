package string;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReplaceWordsTest {

    @Test
    void testCase1() {
        List<String> dictionary = Arrays.asList("cat", "bat", "rat");
        String sentence = "the cattle was rattled by the battery";
        String expected = "the cat was rat by the bat";
        assertEquals(expected, new ReplaceWords().replaceWords(dictionary, sentence));
    }

    @Test
    void testCase2() {
        List<String> dictionary = Arrays.asList("a", "b", "c");
        String sentence = "aadsfasf absbs bbab cadsfafs";
        String expected = "a a b c";
        assertEquals(expected, new ReplaceWords().replaceWords(dictionary, sentence));
    }
}
