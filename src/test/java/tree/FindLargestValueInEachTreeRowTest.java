package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindLargestValueInEachTreeRowTest {

    @Test
    void testCase1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(3, new TreeNode(5), new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(9)));
        assertEquals(Arrays.asList(1, 3, 9), new FindLargestValueInEachTreeRow().largestValues(root));
    }

    @Test
    void testCase2() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertEquals(Arrays.asList(1, 3), new FindLargestValueInEachTreeRow().largestValues(root));
    }

    @Test
    void testCase3() {
        TreeNode root = null;
        assertEquals(Collections.emptyList(), new FindLargestValueInEachTreeRow().largestValues(root));
    }
}
