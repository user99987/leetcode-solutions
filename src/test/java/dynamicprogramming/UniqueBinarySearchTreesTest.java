package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UniqueBinarySearchTreesTest {

    @Test
    public void testCase1() {
        assertThat(new UniqueBinarySearchTrees().numTrees(1)).isEqualTo(1);
    }

    @Test
    public void testCase2() {
        assertThat(new UniqueBinarySearchTrees().numTrees(2)).isEqualTo(2);
    }

    @Test
    public void testCase3() {
        assertThat(new UniqueBinarySearchTrees().numTrees(3)).isEqualTo(5);
    }

    @Test
    public void testCase4() {
        assertThat(new UniqueBinarySearchTrees().numTrees(4)).isEqualTo(14);
    }

    @Test
    public void testCase5() {
        assertThat(new UniqueBinarySearchTrees().numTrees(5)).isEqualTo(42);
    }

    @Test
    public void testCase6() {
        assertThat(new UniqueBinarySearchTrees().numTrees(6)).isEqualTo(132);
    }

    @Test
    public void testCase7() {
        assertThat(new UniqueBinarySearchTrees().numTrees(10)).isEqualTo(16796);
    }
}
