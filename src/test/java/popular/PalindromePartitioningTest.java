package popular;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


public class PalindromePartitioningTest {

    @Test
    public void shouldFindAllPartitionsForMultiCharacterString() {
        List<List<String>> result = new PalindromePartitioning().partition("aab");
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("a", "a", "b"),
                Arrays.asList("aa", "b")
        );
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSinglePartitionForSingleCharacter() {
        List<List<String>> result = new PalindromePartitioning().partition("a");
        List<List<String>> expected = List.of(
                List.of("a")
        );
        assertThat(result).isEqualTo(expected);
    }
}
