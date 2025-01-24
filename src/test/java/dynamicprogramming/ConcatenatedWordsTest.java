package dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcatenatedWordsTest {

    @Test
    public void testCase1() {
        List<String> result = new ConcatenatedWords().findAllConcatenatedWordsInADict(
                new String[]{"cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"}
        );
        List<String> expected = List.of("catsdogcats", "dogcatsdog", "ratcatdogcat");
        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        List<String> result = new ConcatenatedWords().findAllConcatenatedWordsInADict(
                new String[]{"cat", "dog", "catdog"}
        );
        List<String> expected = List.of("catdog");
        assertEquals(expected, result);
    }
}
