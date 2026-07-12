package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.TreeNode;

import java.util.Arrays;
import java.util.Collections;


class FindLargestValueInEachTreeRowTest {

    @Test
    void testCase1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(3, new TreeNode(5), new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(9)));
        assertThat(new FindLargestValueInEachTreeRow().largestValues(root)).isEqualTo(Arrays.asList(1, 3, 9));
    }

    @Test
    void testCase2() {
        var root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertThat(new FindLargestValueInEachTreeRow().largestValues(root)).isEqualTo(Arrays.asList(1, 3));
    }

    @Test
    void testCase3() {
        TreeNode root = null;
        assertThat(new FindLargestValueInEachTreeRow().largestValues(root)).isEqualTo(Collections.emptyList());
    }
}
