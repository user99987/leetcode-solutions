package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class MinimumWindowSubstringTest {

    @Test
    public void testCase1() {
        assertThat(new MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABC")).isEqualTo("BANC");
    }

    @Test
    public void testCase2() {
        assertThat(new MinimumWindowSubstring().minWindow("a", "a")).isEqualTo("a");
    }

    @Test
    public void testCase3() {
        assertThat(new MinimumWindowSubstring().minWindow("a", "aa")).isEqualTo("");
    }
}
