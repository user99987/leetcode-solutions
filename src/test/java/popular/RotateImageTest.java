package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class RotateImageTest {

    @Test
    public void shouldRotateThreeByThreeMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new RotateImage().rotate(matrix);
        assertThat(matrix).isDeepEqualTo(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}});
    }

    @Test
    public void shouldKeepSingleElementMatrixUnchanged() {
        int[][] matrix = {{1}};
        new RotateImage().rotate(matrix);
        assertThat(matrix).isDeepEqualTo(new int[][]{{1}});
    }

    @Test
    public void shouldRotateTwoByTwoMatrix() {
        int[][] matrix = {{1, 2}, {3, 4}};
        new RotateImage().rotate(matrix);
        assertThat(matrix).isDeepEqualTo(new int[][]{{3, 1}, {4, 2}});
    }
}
