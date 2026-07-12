package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class SearchA2DMatrixTest {

    @Test
    public void testCase1() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        assertThat(new SearchA2DMatrix().searchMatrix(matrix, 3)).isTrue();
    }

    @Test
    public void testCase2() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        assertThat(new SearchA2DMatrix().searchMatrix(matrix, 13)).isFalse();
    }

    @Test
    public void testCase3() {
        int[][] matrix = {{1}};
        assertThat(new SearchA2DMatrix().searchMatrix(matrix, 1)).isTrue();
    }
}
