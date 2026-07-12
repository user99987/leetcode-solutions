package twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SmallestRangeTest {

    @Test
    public void testCase1() {
        var actual = new SmallestRange().smallestRange(new int[]{1}, 0);
        var expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        var actual = new SmallestRange().smallestRange(new int[]{0, 10}, 2);
        var expected = 6;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCase3() {
        var actual = new SmallestRange().smallestRange(new int[]{1, 3, 6}, 3);
        var expected = 0;
        assertThat(actual).isEqualTo(expected);
    }
}
