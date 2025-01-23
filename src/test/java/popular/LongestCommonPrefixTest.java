package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void testCase1() {
        assertEquals("fl", new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    public void testCase2() {
        assertEquals("", new LongestCommonPrefix().longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
}
