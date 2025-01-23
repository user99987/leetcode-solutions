package popular;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromePartitioningTest {

    @Test
    public void testCase1() {
        List<List<String>> result = new PalindromePartitioning().partition("aab");
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("a", "a", "b"),
                Arrays.asList("aa", "b")
        );
        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        List<List<String>> result = new PalindromePartitioning().partition("a");
        List<List<String>> expected = List.of(
                List.of("a")
        );
        assertEquals(expected, result);
    }
}
