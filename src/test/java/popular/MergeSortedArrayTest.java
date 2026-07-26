package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class MergeSortedArrayTest {

    @Test
    public void shouldMergeTwoNonEmptySortedArrays() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        new MergeSortedArray().merge(nums1, 3, nums2, 3);
        assertThat(nums1).containsExactly(new int[]{1, 2, 2, 3, 5, 6});
    }

    @Test
    public void shouldKeepFirstArrayUnchangedWhenSecondIsEmpty() {
        int[] nums1 = {1};
        int[] nums2 = {};
        new MergeSortedArray().merge(nums1, 1, nums2, 0);
        assertThat(nums1).containsExactly(new int[]{1});
    }

    @Test
    public void shouldCopySecondArrayWhenFirstIsEmpty() {
        int[] nums1 = {0};
        int[] nums2 = {1};
        new MergeSortedArray().merge(nums1, 0, nums2, 1);
        assertThat(nums1).containsExactly(new int[]{1});
    }
}
