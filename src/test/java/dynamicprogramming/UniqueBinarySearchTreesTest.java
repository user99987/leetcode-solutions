package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueBinarySearchTreesTest {

    @Test
    public void testCase1() {
        assertEquals(1, new UniqueBinarySearchTrees().numTrees(1));
    }

    @Test
    public void testCase2() {
        assertEquals(2, new UniqueBinarySearchTrees().numTrees(2));
    }

    @Test
    public void testCase3() {
        assertEquals(5, new UniqueBinarySearchTrees().numTrees(3));
    }

    @Test
    public void testCase4() {
        assertEquals(14, new UniqueBinarySearchTrees().numTrees(4));
    }

    @Test
    public void testCase5() {
        assertEquals(42, new UniqueBinarySearchTrees().numTrees(5));
    }

    @Test
    public void testCase6() {
        assertEquals(132, new UniqueBinarySearchTrees().numTrees(6));
    }

    @Test
    public void testCase7() {
        assertEquals(16796, new UniqueBinarySearchTrees().numTrees(10));
    }
}
