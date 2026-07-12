package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class MaximumProductSubarrayTest {

    @Test
    public void testCase1() {
        assertThat(new MaximumProductSubarray().maxProduct(new int[]{2, 3, -2, 4})).isEqualTo(6);
    }

    @Test
    public void testCase2() {
        assertThat(new MaximumProductSubarray().maxProduct(new int[]{-2, 0, -1})).isEqualTo(0);
    }
}
