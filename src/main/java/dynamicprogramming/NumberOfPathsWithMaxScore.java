package dynamicprogramming;

import java.util.List;

/**
 * Hard
 * <p>
 * You are given a square board of characters. You can move on the board starting at the bottom right square marked with the character 'S'.
 * <p>
 * You need to reach the top left square marked with the character 'E'. The rest of the squares are labeled either with a numeric character 1, 2, ..., 9 or with an obstacle 'X'. In one move you can go up, left or up-left (diagonally) only if there is no obstacle there.
 * <p>
 * Return a list of two integers: the first integer is the maximum sum of numeric characters you can collect, and the second is the number of such paths that you can take to get that maximum sum, taken modulo 10^9 + 7.
 * <p>
 * In case there is no path, return [0, 0].
 * <p>
 * Example 1:
 * <p>
 * Input: board = ["E23","2X2","12S"]
 * <p>
 * Output: [7,1]
 * <p>
 * Example 2:
 * <p>
 * Input: board = ["E12","1X1","21S"]
 * <p>
 * Output: [4,2]
 * <p>
 * Example 3:
 * <p>
 * Input: board = ["E11","XXX","11S"]
 * <p>
 * Output: [0,0]
 * <p>
 * Constraints:
 * <p>
 * 2 <= board.length == board[i].length <= 100
 */
public class NumberOfPathsWithMaxScore {

    private static final int[][] DIRECTIONS = new int[][]{{1, 0}, {0, 1}, {1, 1}};
    private static final int MOD = 1_000_000_007;

    public int[] pathsWithMaxScore(List<String> board) {
        int rows = board.size();
        int columns = board.get(0).length();
        int[][][] dp = new int[rows][columns][2];
        for (int r = rows - 1; r >= 0; r--) {
            for (int c = columns - 1; c >= 0; c--) {
                char current = board.get(r).charAt(c);
                if (current == 'S') {
                    dp[r][c][0] = 0;
                    dp[r][c][1] = 1;
                } else if (current != 'X') {
                    int maxScore = 0;
                    int paths = 0;
                    int currentScore = current == 'E' ? 0 : current - '0';
                    for (int[] dir : DIRECTIONS) {
                        int nextR = r + dir[0];
                        int nextC = c + dir[1];
                        if (nextR < rows && nextC < columns && dp[nextR][nextC][1] > 0) {
                            if (dp[nextR][nextC][0] + currentScore > maxScore) {
                                maxScore = dp[nextR][nextC][0] + currentScore;
                                paths = dp[nextR][nextC][1];
                            } else if (dp[nextR][nextC][0] + currentScore == maxScore) {
                                paths = (paths + dp[nextR][nextC][1]) % MOD;
                            }
                        }
                    }
                    dp[r][c][0] = maxScore;
                    dp[r][c][1] = paths;
                }
            }
        }
        return new int[]{dp[0][0][0], dp[0][0][1]};
    }
}
