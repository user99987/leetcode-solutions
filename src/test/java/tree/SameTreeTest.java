package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class SameTreeTest {

    @Test
    public void shouldReturnTrueForIdenticalTrees() {
        var p = TreeNode.create(new Integer[]{1, 2, 3});
        var q = TreeNode.create(new Integer[]{1, 2, 3});
        assertThat(new SameTree().isSameTree(p, q)).isTrue();
    }

    @Test
    public void shouldReturnFalseForDifferentStructure() {
        var p = TreeNode.create(new Integer[]{1, 2});
        var q = TreeNode.create(new Integer[]{1, null, 2});
        assertThat(new SameTree().isSameTree(p, q)).isFalse();
    }

    @Test
    public void shouldReturnFalseForDifferentValuesAtSamePosition() {
        var p = TreeNode.create(new Integer[]{1, 2, 1});
        var q = TreeNode.create(new Integer[]{1, 1, 2});
        assertThat(new SameTree().isSameTree(p, q)).isFalse();
    }

    @Test
    public void shouldReturnTrueWhenBothTreesAreNull() {
        assertThat(new SameTree().isSameTree(null, null)).isTrue();
    }

    @Test
    public void shouldReturnFalseWhenOnlyOneTreeIsNull() {
        var p = TreeNode.create(new Integer[]{1});
        assertThat(new SameTree().isSameTree(p, null)).isFalse();
        assertThat(new SameTree().isSameTree(null, p)).isFalse();
    }

    @Test
    public void shouldReturnTrueForDeeplyNestedIdenticalTrees() {
        var p = TreeNode.create(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        var q = TreeNode.create(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        assertThat(new SameTree().isSameTree(p, q)).isTrue();
    }
}
