package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class SubtreeOfAnotherTreeTest {

    @Test
    public void shouldReturnTrueWhenSubtreeExists() {
        var root = TreeNode.create(new Integer[]{3, 4, 5, 1, 2});
        var subRoot = TreeNode.create(new Integer[]{4, 1, 2});
        assertThat(new SubtreeOfAnotherTree().isSubtree(root, subRoot)).isTrue();
    }

    @Test
    public void shouldReturnFalseWhenStructureDiffersDespiteMatchingValues() {
        var root = TreeNode.create(new Integer[]{3, 4, 5, 1, 2, null, null, null, null, 0});
        var subRoot = TreeNode.create(new Integer[]{4, 1, 2});
        assertThat(new SubtreeOfAnotherTree().isSubtree(root, subRoot)).isFalse();
    }

    @Test
    public void shouldReturnTrueWhenTreeIsSubtreeOfItself() {
        var root = TreeNode.create(new Integer[]{1, 2, 3});
        var subRoot = TreeNode.create(new Integer[]{1, 2, 3});
        assertThat(new SubtreeOfAnotherTree().isSubtree(root, subRoot)).isTrue();
    }

    @Test
    public void shouldReturnTrueForSingleLeafSubtreeMatch() {
        var root = TreeNode.create(new Integer[]{1, 2, 3});
        var subRoot = TreeNode.create(new Integer[]{2});
        assertThat(new SubtreeOfAnotherTree().isSubtree(root, subRoot)).isTrue();
    }

    @Test
    public void shouldReturnFalseForSimilarValuesButDifferentStructure() {
        var root = TreeNode.create(new Integer[]{1, 1});
        var subRoot = TreeNode.create(new Integer[]{1, null, 1});
        assertThat(new SubtreeOfAnotherTree().isSubtree(root, subRoot)).isFalse();
    }

    @Test
    public void shouldAvoidFalsePositiveFromNumericSerialization() {
        // Ensures numeric serialization boundaries (e.g. "2" vs "12" or "-2") don't cause false matches
        var root = TreeNode.create(new Integer[]{12, 2});
        var subRoot = TreeNode.create(new Integer[]{2});
        assertThat(new SubtreeOfAnotherTree().isSubtree(root, subRoot)).isTrue();
    }
}
