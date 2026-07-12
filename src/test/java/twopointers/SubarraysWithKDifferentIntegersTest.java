package twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SubarraysWithKDifferentIntegersTest {

    @Test
    public void testCase1() {
        int actual = new SubarraysWithKDifferentIntegers().subarraysWithKDistinct(
                new int[]{1, 2, 1, 2, 3},
                2
        );
        var expected = 7;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        int actual = new SubarraysWithKDifferentIntegers().subarraysWithKDistinct(
                new int[]{1, 2, 1, 3, 4},
                3
        );
        var expected = 3;
        assertThat(actual).isEqualTo(expected);
    }
}
