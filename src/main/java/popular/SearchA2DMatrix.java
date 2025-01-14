package popular;

/**
 * Medium
 * <p>
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 * <p>
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * <p>
 * <p>
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 100
 * -10^4 <= matrix[i][j], target <= 10^4
 */
public class SearchA2DMatrix {

    public static void main(String[] args) throws Exception {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        System.out.println(new SearchA2DMatrix().searchMatrix(matrix, 3));
    }

    private boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int M = matrix.length;
        int N = matrix[0].length;
        int r = 0, c = N - 1;
        while (r < M && c >= 0) {
            if (matrix[r][c] == target) return true;
            else if (target < matrix[r][c]) --c;
            else if (target > matrix[r][c]) r++;
        }
        return false;
    }

}