package heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

public class TopKFrequentWordsTest {

    @Test
    void testCase1() {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        var k = 2;
        var expected = Arrays.asList("i", "love");
        assertThat(new TopKFrequentWords().topKFrequent(words, k)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        var k = 4;
        var expected = Arrays.asList("the", "is", "sunny", "day");
        assertThat(new TopKFrequentWords().topKFrequent(words, k)).isEqualTo(expected);
    }
}
