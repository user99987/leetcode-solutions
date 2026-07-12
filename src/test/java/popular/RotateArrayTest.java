package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class RotateArrayTest {

    @Test
    public void testCase1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        new RotateArray().rotate(nums, 3);
        assertThat(nums).containsExactly(new int[]{5, 6, 7, 1, 2, 3, 4});
    }

    @Test
    public void testCase2() {
        int[] nums = {-1, -100, 3, 99};
        new RotateArray().rotate(nums, 2);
        assertThat(nums).containsExactly(new int[]{3, 99, -1, -100});
    }
}
