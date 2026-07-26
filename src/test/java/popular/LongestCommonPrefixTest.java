package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LongestCommonPrefixTest {

    @Test
    public void shouldFindCommonPrefixAmongStrings() {
        assertThat(new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower", "flow", "flight"})).isEqualTo("fl");
    }

    @Test
    public void shouldReturnEmptyStringWhenNoCommonPrefixExists() {
        assertThat(new LongestCommonPrefix().longestCommonPrefix(new String[]{"dog", "racecar", "car"})).isEqualTo("");
    }
}
