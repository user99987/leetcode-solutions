package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class SetMatrixZeroesTest {

    @Test
    public void testCase1() {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        new SetMatrixZeroes().setZeroes(matrix);
        assertThat(matrix).isDeepEqualTo(new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}});
    }

    @Test
    public void testCase2() {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        new SetMatrixZeroes().setZeroes(matrix);
        assertThat(matrix).isDeepEqualTo(new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}});
    }
}

