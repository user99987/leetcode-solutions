package tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Medium
 * <p>
 * Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).
 * <p>
 * Example 1:
 * <p>
 * Input: root = [1,3,2,5,3,null,9]
 * <p>
 * Output: [1,3,9]
 * <p>
 * Example 2:
 * <p>
 * Input: root = [1,2,3]
 * <p>
 * Output: [1,3]
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree will be in the range [0, 10^4].
 * -2^31 <= Node.val <= 2^31 - 1
 */
public class FindLargestValueInEachTreeRow {

    public List<Integer> largestValues(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>(List.of(root));

        while (!queue.isEmpty()) {
            result.add(queue.stream().mapToInt(node -> node.value).max().orElse(Integer.MIN_VALUE));
            queue = queue.stream()
                    .flatMap(node -> Stream.of(node.left, node.right))
                    .filter(Objects::nonNull)
                    .collect(Collectors.toCollection(LinkedList::new));
        }
        return result;
    }
}
