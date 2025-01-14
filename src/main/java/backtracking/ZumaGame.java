package backtracking;

import java.util.HashMap;
import java.util.Map;

/**
 * Hard
 * <p>
 * You are playing a variation of the game Zuma.
 * <p>
 * In this variation of Zuma, there is a single row of colored balls on a board, where each ball can be colored red 'R', yellow 'Y', blue 'B', green 'G', or white 'W'. You also have several colored balls in your hand.
 * <p>
 * Your goal is to clear all of the balls from the board. On each turn:
 * <p>
 * Pick any ball from your hand and insert it in between two balls in the row or on either end of the row.
 * If there is a group of three or more consecutive balls of the same color, remove the group of balls from the board.
 * If this removal causes more groups of three or more of the same color to form, then continue removing each group until there are none left.
 * If there are no more balls on the board, then you win the game.
 * Repeat this process until you either win or do not have any more balls in your hand.
 * Given a string board, representing the row of balls on the board, and a string hand, representing the balls in your hand, return the minimum number of balls you have to insert to clear all the balls from the board. If you cannot clear all the balls from the board using the balls in your hand, return -1.
 * <p>
 * Example 1:
 * <p>
 * Input: board = “WRRBBW”, hand = “RB”
 * <p>
 * Output: -1
 * <p>
 * Explanation: It is impossible to clear all the balls. The best you can do is:
 * <p>
 * Insert ‘R’ so the board becomes WRRRBBW. WRRRBBW -> WBBW.
 * <p>
 * Insert ‘B’ so the board becomes WBBBW. WBBBW -> WW.
 * <p>
 * There are still balls remaining on the board, and you are out of balls to insert.
 * <p>
 * Example 2:
 * <p>
 * Input: board = “WWRRBBWW”, hand = “WRBRW”
 * <p>
 * Output: 2
 * <p>
 * Explanation: To make the board empty:
 * <p>
 * Insert ‘R’ so the board becomes WWRRRBBWW. WWRRRBBWW -> WWBBWW.
 * <p>
 * Insert ‘B’ so the board becomes WWBBBWW. WWBBBWW -> WWWW -> empty.
 * <p>
 * 2 balls from your hand were needed to clear the board.
 * <p>
 * Example 3:
 * <p>
 * Input: board = “G”, hand = “GGGGG”
 * <p>
 * Output: 2
 * <p>
 * Explanation: To make the board empty:
 * <p>
 * Insert ‘G’ so the board becomes GG.
 * <p>
 * Insert ‘G’ so the board becomes GGG. GGG -> empty.
 * <p>
 * 2 balls from your hand were needed to clear the board.
 * <p>
 * Constraints:
 * <p>
 * 1 <= board.length <= 16
 * 1 <= hand.length <= 5
 * board and hand consist of the characters 'R', 'Y', 'B', 'G', and 'W'.
 * The initial row of balls on the board will not have any groups of three or more consecutive balls of the same color.
 */
public class ZumaGame {

    public static void main(String[] args) {
        System.out.println(new ZumaGame().findMinStep("BBWWRRYYRRWWBB", "Y"));
    }

    public int findMinStep(String board, String hand) {
        return dfs(board, hand);
    }

    private int dfs(String board, String hand) {
        return findMinStepDp(board, hand, new HashMap<>());
    }

    private int findMinStepDp(String board, String hand, Map<String, Map<String, Integer>> dp) {
        if (board.isEmpty()) {
            return 0;
        }
        if (hand.isEmpty()) {
            return -1;
        }
        if (dp.get(board) != null && dp.get(board).get(hand) != null) {
            return dp.get(board).get(hand);
        }
        int min = -1;
        for (int i = 0; i <= board.length(); i++) {
            for (int j = 0; j < hand.length(); j++) {
                if ((j == 0 || hand.charAt(j) != hand.charAt(j - 1))
                        && (i == 0 || board.charAt(i - 1) != hand.charAt(j))
                        && ((i < board.length() && board.charAt(i) == hand.charAt(j))
                        || (i > 0
                        && i < board.length()
                        && board.charAt(i - 1) == board.charAt(i)
                        && board.charAt(i) != hand.charAt(j)))) {

                    StringBuilder newS = new StringBuilder(board);
                    newS.insert(i, hand.charAt(j));
                    int sR =
                            findMinStepDp(
                                    removeRepeated(newS.toString()),
                                    hand.substring(0, j) + hand.substring(j + 1),
                                    dp);
                    if (sR != -1) {
                        min = min == -1 ? sR + 1 : Integer.min(min, sR + 1);
                    }
                }
            }
        }
        dp.putIfAbsent(board, new HashMap<>());
        dp.get(board).put(hand, min);
        return min;
    }

    private String removeRepeated(String original) {
        int count = 1;
        int i = 1;
        while (i < original.length()) {
            if (original.charAt(i) == original.charAt(i - 1)) {
                count++;
                i++;
            } else {
                if (count >= 3) {
                    return removeRepeated(
                            original.substring(0, i - count)
                                    + original.substring(i));
                } else {
                    count = 1;
                    i++;
                }
            }
        }
        if (count >= 3) {
            return removeRepeated(original.substring(0, original.length() - count));
        } else {
            return original;
        }
    }
}
