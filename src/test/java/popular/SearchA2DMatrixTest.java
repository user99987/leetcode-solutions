package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchA2DMatrixTest {

    @Test
    public void testCase1() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        assertTrue(new SearchA2DMatrix().searchMatrix(matrix, 3));
    }

    @Test
    public void testCase2() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        assertFalse(new SearchA2DMatrix().searchMatrix(matrix, 13));
    }

    @Test
    public void testCase3() {
        int[][] matrix = {{1}};
        assertTrue(new SearchA2DMatrix().searchMatrix(matrix, 1));
    }
}
