package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateImageTest {

    @Test
    public void testCase1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new RotateImage().rotate(matrix);
        assertArrayEquals(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}, matrix);
    }

    @Test
    public void testCase2() {
        int[][] matrix = {{1}};
        new RotateImage().rotate(matrix);
        assertArrayEquals(new int[][]{{1}}, matrix);
    }

    @Test
    public void testCase3() {
        int[][] matrix = {{1, 2}, {3, 4}};
        new RotateImage().rotate(matrix);
        assertArrayEquals(new int[][]{{3, 1}, {4, 2}}, matrix);
    }
}
