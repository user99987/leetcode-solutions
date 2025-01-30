package popular;

import java.util.stream.IntStream;

/**
 * Medium
 * <p>
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.
 * <p>
 * You must do it in place.
 * <p>
 * Example 1:
 * <p>
 * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
 * <p>
 * Output: [[1,0,1],[0,0,0],[1,0,1]]
 * <p>
 * Example 2:
 * <p>
 * Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * <p>
 * Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 * <p>
 * Constraints:
 * <p>
 * m == matrix.length
 * n == matrix[0].length
 * 1 <= m, n <= 200
 * -2^31 <= matrix[i][j] <= 2^31 - 1
 */
public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean firstRowZero = IntStream.range(0, n).anyMatch(j -> matrix[0][j] == 0);
        boolean firstColZero = IntStream.range(0, m).anyMatch(i -> matrix[i][0] == 0);

        IntStream.range(1, m).forEach(i ->
                IntStream.range(1, n).filter(j -> matrix[i][j] == 0)
                        .forEach(j -> {
                            matrix[i][0] = 0;
                            matrix[0][j] = 0;
                        })
        );

        IntStream.range(1, m).filter(i -> matrix[i][0] == 0)
                .forEach(i -> IntStream.range(1, n).forEach(j -> matrix[i][j] = 0));

        IntStream.range(1, n).filter(j -> matrix[0][j] == 0)
                .forEach(j -> IntStream.range(1, m).forEach(i -> matrix[i][j] = 0));

        if (firstRowZero) IntStream.range(0, n).forEach(j -> matrix[0][j] = 0);
        if (firstColZero) IntStream.range(0, m).forEach(i -> matrix[i][0] = 0);
    }
}
