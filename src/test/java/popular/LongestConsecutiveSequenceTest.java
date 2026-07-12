package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LongestConsecutiveSequenceTest {

    @Test
    public void testCase1() {
        assertThat(new LongestConsecutiveSequence().longestConsecutive(new int[]{100, 4, 200, 1, 3, 2})).isEqualTo(4);
    }

    @Test
    public void testCase2() {
        assertThat(new LongestConsecutiveSequence().longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1})).isEqualTo(9);
    }
}
