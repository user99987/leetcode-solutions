package popular;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpiralMatrixTest {

    @Test
    public void testCase1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> result = new SpiralMatrix().spiralOrder(matrix);
        assertEquals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5), result);
    }

    @Test
    public void testCase2() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> result = new SpiralMatrix().spiralOrder(matrix);
        assertEquals(Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), result);
    }
}
