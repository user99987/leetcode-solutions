package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KeyboardRowTest {

    @Test
    public void shouldFilterWordsTypableOnSingleRow() {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] expected = {"Alaska", "Dad"};
        assertThat(new KeyboardRow().findWords(words)).containsExactly(expected);
    }

    @Test
    public void shouldReturnEmptyWhenWordSpansMultipleRows() {
        String[] words = {"omk"};
        String[] expected = {};
        assertThat(new KeyboardRow().findWords(words)).containsExactly(expected);
    }

    @Test
    public void shouldReturnAllWordsWhenAllAreSingleRow() {
        String[] words = {"adsdf", "sfd"};
        String[] expected = {"adsdf", "sfd"};
        assertThat(new KeyboardRow().findWords(words)).containsExactly(expected);
    }
}
