package dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromePairsTest {

    @Test
    public void testCase1() {
        List<List<Integer>> expected = List.of(
                List.of(0, 1),
                List.of(1, 0),
                List.of(2, 4),
                List.of(3, 2)

        );
        assertThat(new PalindromePairs().palindromePairs(
                new String[]{"abcd", "dcba", "lls", "s", "sssll"})).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        List<List<Integer>> expected = List.of(
                List.of(0, 1),
                List.of(1, 0)
        );
        assertThat(new PalindromePairs().palindromePairs(
                new String[]{"bat", "tab", "cat"})).isEqualTo(expected);
    }

    @Test
    public void testCase3() {
        List<List<Integer>> expected = List.of(
                List.of(0, 1),
                List.of(1, 0)
        );
        assertThat(new PalindromePairs().palindromePairs(
                new String[]{"a", ""})).isEqualTo(expected);
    }

    @Test
    public void testCase4() {
        List<List<Integer>> expected = List.of();
        assertThat(new PalindromePairs().palindromePairs(
                new String[]{"abc", "def", "ghi"})).isEqualTo(expected);
    }

}
