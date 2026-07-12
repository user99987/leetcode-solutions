package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

class ReplaceWordsTest {

    @Test
    void testCase1() {
        var dictionary = Arrays.asList("cat", "bat", "rat");
        var sentence = "the cattle was rattled by the battery";
        var expected = "the cat was rat by the bat";
        assertThat(new ReplaceWords().replaceWords(dictionary, sentence)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        var dictionary = Arrays.asList("a", "b", "c");
        var sentence = "aadsfasf absbs bbab cadsfafs";
        var expected = "a a b c";
        assertThat(new ReplaceWords().replaceWords(dictionary, sentence)).isEqualTo(expected);
    }
}
