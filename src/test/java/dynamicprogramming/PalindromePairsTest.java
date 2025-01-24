package dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromePairsTest {

    @Test
    public void testCase1() {
        List<List<Integer>> expected = List.of(
                List.of(0, 1),
                List.of(1, 0),
                List.of(2, 4),
                List.of(3, 2)

        );
        assertEquals(expected, new PalindromePairs().palindromePairs(
                new String[]{"abcd", "dcba", "lls", "s", "sssll"}));
    }

    @Test
    public void testCase2() {
        List<List<Integer>> expected = List.of(
                List.of(0, 1),
                List.of(1, 0)
        );
        assertEquals(expected, new PalindromePairs().palindromePairs(
                new String[]{"bat", "tab", "cat"}));
    }

    @Test
    public void testCase3() {
        List<List<Integer>> expected = List.of(
                List.of(0, 1),
                List.of(1, 0)
        );
        assertEquals(expected, new PalindromePairs().palindromePairs(
                new String[]{"a", ""}));
    }

    @Test
    public void testCase4() {
        List<List<Integer>> expected = List.of();
        assertEquals(expected, new PalindromePairs().palindromePairs(
                new String[]{"abc", "def", "ghi"}));
    }

}
