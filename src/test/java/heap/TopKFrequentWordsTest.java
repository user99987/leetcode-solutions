package heap;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopKFrequentWordsTest {

    @Test
    void testCase1() {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> expected = Arrays.asList("i", "love");
        assertEquals(expected, new TopKFrequentWords().topKFrequent(words, k));
    }

    @Test
    void testCase2() {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 4;
        List<String> expected = Arrays.asList("the", "is", "sunny", "day");
        assertEquals(expected, new TopKFrequentWords().topKFrequent(words, k));
    }
}
