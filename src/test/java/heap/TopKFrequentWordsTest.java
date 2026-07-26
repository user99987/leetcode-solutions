package heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TopKFrequentWordsTest {

    @Test
    public void shouldReturnTwoMostFrequentWordsOrderedByFrequencyThenAlphabetically() {
        assertThat(new TopKFrequentWords().topKFrequent(
                new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2))
                .containsExactly("i", "love");
    }

    @Test
    public void shouldReturnFourMostFrequentWords() {
        assertThat(new TopKFrequentWords().topKFrequent(
                new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4))
                .containsExactly("the", "is", "sunny", "day");
    }

    @Test
    public void shouldReturnSingleWordWhenOnlyOneWordExists() {
        assertThat(new TopKFrequentWords().topKFrequent(new String[]{"a"}, 1)).containsExactly("a");
    }

    @Test
    public void shouldSortLexicographicallyWhenAllWordsHaveSameFrequency() {
        assertThat(new TopKFrequentWords().topKFrequent(new String[]{"b", "a", "c"}, 3))
                .containsExactly("a", "b", "c");
    }

    @Test
    public void shouldReturnAllUniqueWordsSortedWhenKEqualsUniqueCount() {
        assertThat(new TopKFrequentWords().topKFrequent(new String[]{"z", "y", "z", "y", "x"}, 3))
                .containsExactly("y", "z", "x");
    }
}
