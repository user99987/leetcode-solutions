package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SubArraysWithBoundedMaximumTest {

    @Test
    public void testCase1() {
        assertThat(new SubArraysWithBoundedMaximum().numSubarrayBoundedMax(new int[]{2, 1, 4, 3}, 2, 3)).isEqualTo(3);
    }

    @Test
    public void testCase2() {
        assertThat(new SubArraysWithBoundedMaximum().numSubarrayBoundedMax(new int[]{2, 9, 2, 5, 6}, 2, 8)).isEqualTo(7);
    }
}
