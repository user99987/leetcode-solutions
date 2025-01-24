package greedy;

/**
 * Medium
 * <p>
 * You are given an m x n binary matrix grid.
 * <p>
 * A move consists of choosing any row or column and toggling each value in that row or column (i.e., changing all 0's to 1's, and all 1's to 0's).
 * <p>
 * Every row of the matrix is interpreted as a binary number, and the score of the matrix is the sum of these numbers.
 * <p>
 * Return the highest possible score after making any number of moves (including zero moves).
 * <p>
 * Example 1:
 * <p>
 * Input: grid = [[0,0,1,1],[1,0,1,0],[1,1,0,0]]
 * <p>
 * Output: 39
 * <p>
 * Explanation: 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
 * <p>
 * Example 2:
 * <p>
 * Input: grid = [[0]]
 * <p>
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 20
 * grid[i][j] is either 0 or 1.
 */
public class ScoreAfterFlippingMatrix {

    public int matrixScore(int[][] A) {
        for (int[] a : A) {
            int temp1 = makeNum(a);
            flip(a);
            int temp2 = makeNum(a);
            if (temp1 > temp2) {
                // revert
                flip(a);
            }
        }
        for (int i = 0; i < A[0].length; i++) {
            int count = 0;
            for (int[] ints : A) {
                if (ints[i] == 1) {
                    count++;
                }
            }
            if (count < (A.length - count)) {
                for (int j = 0; j < A.length; j++) {
                    if (A[j][i] == 0) {
                        A[j][i] = 1;
                    } else {
                        A[j][i] = 0;
                    }
                }
            }
        }
        int sum = 0;
        for (int[] a : A) {
            sum += makeNum(a);
        }
        return sum;
    }

    private int makeNum(int[] a) {
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                n |= (1 << (a.length - i - 1));
            }
        }
        return n;
    }

    private void flip(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) {
                A[i] = 0;
            } else {
                A[i] = 1;
            }
        }
    }
}
