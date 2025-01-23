package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortedArrayTest {

    @Test
    public void testCase1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        new MergeSortedArray().merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    public void testCase2() {
        int[] nums1 = {1};
        int[] nums2 = {};
        new MergeSortedArray().merge(nums1, 1, nums2, 0);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void testCase3() {
        int[] nums1 = {0};
        int[] nums2 = {1};
        new MergeSortedArray().merge(nums1, 0, nums2, 1);
        assertArrayEquals(new int[]{1}, nums1);
    }
}
