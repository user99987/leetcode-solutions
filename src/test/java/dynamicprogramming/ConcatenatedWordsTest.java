package dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ConcatenatedWordsTest {

    @Test
    public void shouldFindAllConcatenatedWordsFromMultipleComponents() {
        List<String> result = new ConcatenatedWords().findAllConcatenatedWordsInADict(
                new String[]{"cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"}
        );
        List<String> expected = List.of("catsdogcats", "dogcatsdog", "ratcatdogcat");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldFindSingleConcatenatedWordFromTwoParts() {
        List<String> result = new ConcatenatedWords().findAllConcatenatedWordsInADict(
                new String[]{"cat", "dog", "catdog"}
        );
        List<String> expected = List.of("catdog");
        assertThat(result).isEqualTo(expected);
    }
}
