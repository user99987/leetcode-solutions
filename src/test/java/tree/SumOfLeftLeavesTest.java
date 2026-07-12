package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.TreeNode;


public class SumOfLeftLeavesTest {

    @Test
    public void testCase1() {
        int actual = new SumOfLeftLeaves().sumOfLeftLeaves(
                TreeNode.create(new Integer[]{3, 9, 20, null, null, 15, 7})
        );
        int expected = 24;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        int actual = new SumOfLeftLeaves().sumOfLeftLeaves(
                TreeNode.create(new Integer[]{1})
        );
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }
}
