package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class KeyboardRowTest {

    @Test
    public void testCase1() {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] expected = {"Alaska", "Dad"};
        assertArrayEquals(expected, new KeyboardRow().findWords(words));
    }

    @Test
    public void testCase2() {
        String[] words = {"omk"};
        String[] expected = {};
        assertArrayEquals(expected, new KeyboardRow().findWords(words));
    }

    @Test
    public void testCase3() {
        String[] words = {"adsdf", "sfd"};
        String[] expected = {"adsdf", "sfd"};
        assertArrayEquals(expected, new KeyboardRow().findWords(words));
    }
}
