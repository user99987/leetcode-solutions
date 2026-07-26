package popular;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


public class WordBreakTest {

    @Test
    public void shouldBreakWordUsingTwoDictionaryWords() {
        assertThat(new WordBreak().wordBreak("leetcode", List.of("leet", "code"))).isTrue();
    }

    @Test
    public void shouldBreakWordUsingRepeatedDictionaryWords() {
        assertThat(new WordBreak().wordBreak("applepenapple", List.of("apple", "pen"))).isTrue();
    }

    @Test
    public void shouldReturnFalseWhenWordCannotBeSegmented() {
        assertThat(new WordBreak().wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat"))).isFalse();
    }
}
