package popular;

import java.util.HashSet;
import java.util.Set;

/**
 * Medium
 * <p>
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0’s, and return the matrix.
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
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for (int r : row) {
            for (int j = 0; j < n; j++) {
                matrix[r][j] = 0;
            }
        }

        for (int c : col) {
            for (int i = 0; i < m; i++) {
                matrix[i][c] = 0;
            }
        }
    }
}
