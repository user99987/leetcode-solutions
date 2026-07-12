package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.TreeNode;

import java.util.Arrays;


public class MostFrequentSubtreeSumTest {

    @Test
    public void testCase1() {
        int[] actual = new MostFrequentSubtreeSum().findFrequentTreeSum(
                TreeNode.create(new Integer[]{5, 2, -3})
        );
        int[] expected = {2, -3, 4};
        Arrays.sort(actual);
        Arrays.sort(expected);
        assertThat(actual).containsExactly(expected);
    }

    @Test
    public void testCase2() {
        int[] actual = new MostFrequentSubtreeSum().findFrequentTreeSum(
                TreeNode.create(new Integer[]{5, 2, -5})
        );
        int[] expected = {2};
        Arrays.sort(actual);
        Arrays.sort(expected);
        assertThat(actual).containsExactly(expected);
    }
}
