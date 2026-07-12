package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class SortColorsTest {

    @Test
    public void testCase1() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        new SortColors().sortColors(nums);
        assertThat(nums).containsExactly(new int[]{0, 0, 1, 1, 2, 2});
    }

    @Test
    public void testCase2() {
        int[] nums = {2, 0, 1};
        new SortColors().sortColors(nums);
        assertThat(nums).containsExactly(new int[]{0, 1, 2});
    }

    @Test
    public void testCase3() {
        int[] nums = {0};
        new SortColors().sortColors(nums);
        assertThat(nums).containsExactly(new int[]{0});
    }

    @Test
    public void testCase4() {
        int[] nums = {1};
        new SortColors().sortColors(nums);
        assertThat(nums).containsExactly(new int[]{1});
    }
}
