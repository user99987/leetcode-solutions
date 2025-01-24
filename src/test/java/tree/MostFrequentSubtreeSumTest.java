package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MostFrequentSubtreeSumTest {

    @Test
    public void testCase1() {
        int[] actual = new MostFrequentSubtreeSum().findFrequentTreeSum(
                TreeNode.create(new Integer[]{5, 2, -3})
        );
        int[] expected = {2, -3, 4};
        Arrays.sort(actual);
        Arrays.sort(expected);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        int[] actual = new MostFrequentSubtreeSum().findFrequentTreeSum(
                TreeNode.create(new Integer[]{5, 2, -5})
        );
        int[] expected = {2};
        Arrays.sort(actual);
        Arrays.sort(expected);
        assertArrayEquals(expected, actual);
    }
}
