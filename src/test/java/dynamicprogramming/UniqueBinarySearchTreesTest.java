package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UniqueBinarySearchTreesTest {

    @Test
    public void shouldReturnOneForSingleNode() {
        assertThat(new UniqueBinarySearchTrees().numTrees(1)).isEqualTo(1);
    }

    @Test
    public void shouldReturnTwoForTwoNodes() {
        assertThat(new UniqueBinarySearchTrees().numTrees(2)).isEqualTo(2);
    }

    @Test
    public void shouldReturnFiveForThreeNodes() {
        assertThat(new UniqueBinarySearchTrees().numTrees(3)).isEqualTo(5);
    }

    @Test
    public void shouldReturnFourteenForFourNodes() {
        assertThat(new UniqueBinarySearchTrees().numTrees(4)).isEqualTo(14);
    }

    @Test
    public void shouldReturnFortyTwoForFiveNodes() {
        assertThat(new UniqueBinarySearchTrees().numTrees(5)).isEqualTo(42);
    }

    @Test
    public void shouldReturnOneThirtyTwoForSixNodes() {
        assertThat(new UniqueBinarySearchTrees().numTrees(6)).isEqualTo(132);
    }

    @Test
    public void shouldReturnCatalanNumberForTenNodes() {
        assertThat(new UniqueBinarySearchTrees().numTrees(10)).isEqualTo(16796);
    }
}
