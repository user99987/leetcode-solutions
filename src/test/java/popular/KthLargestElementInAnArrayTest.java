package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class KthLargestElementInAnArrayTest {

    @Test
    public void testCase1() {
        assertThat(new KthLargestElementInAnArray().findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2)).isEqualTo(5);
    }

    @Test
    public void testCase2() {
        assertThat(new KthLargestElementInAnArray().findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4)).isEqualTo(4);
    }
}
