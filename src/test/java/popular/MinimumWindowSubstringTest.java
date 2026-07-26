package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class MinimumWindowSubstringTest {

    @Test
    public void shouldFindSmallestWindowContainingAllCharacters() {
        assertThat(new MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABC")).isEqualTo("BANC");
    }

    @Test
    public void shouldReturnSameStringWhenItExactlyMatchesTarget() {
        assertThat(new MinimumWindowSubstring().minWindow("a", "a")).isEqualTo("a");
    }

    @Test
    public void shouldReturnEmptyStringWhenTargetCannotBeMatched() {
        assertThat(new MinimumWindowSubstring().minWindow("a", "aa")).isEqualTo("");
    }
}
