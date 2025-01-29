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
 * Input: board = "WRRBBW", hand = "RB"
 * <p>
 * Output: -1
 * <p>
 * Explanation: It is impossible to clear all the balls. The best you can do is:
 * <p>
 * Insert 'R' so the board becomes WRRRBBW. WRRRBBW -> WBBW.
 * <p>
 * Insert 'B' so the board becomes WBBBW. WBBBW -> WW.
 * <p>
 * There are still balls remaining on the board, and you are out of balls to insert.
 * <p>
 * Example 2:
 * <p>
 * Input: board = "WWRRBBWW", hand = "WRBRW"
 * <p>
 * Output: 2
 * <p>
 * Explanation: To make the board empty:
 * <p>
 * Insert 'R' so the board becomes WWRRRBBWW. WWRRRBBWW -> WWBBWW.
 * <p>
 * Insert 'B' so the board becomes WWBBBWW. WWBBBWW -> WWWW -> empty.
 * <p>
 * 2 balls from your hand were needed to clear the board.
 * <p>
 * Example 3:
 * <p>
 * Input: board = "G", hand = "GGGGG"
 * <p>
 * Output: 2
 * <p>
 * Explanation: To make the board empty:
 * <p>
 * Insert 'G' so the board becomes GG.
 * <p>
 * Insert 'G' so the board becomes GGG. GGG -> empty.
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

    public int findMinStep(String board, String hand) {
        Map<Character, Integer> handMap = new HashMap<>();
        for (char c : hand.toCharArray()) {
            handMap.put(c, handMap.getOrDefault(c, 0) + 1);
        }
        return backtrack(board, handMap);
    }

    private int backtrack(String board, Map<Character, Integer> handMap) {
        if (board.isEmpty()) {
            return 0;
        }
        if (handMap.values().stream().allMatch(count -> count == 0)) {
            return -1;
        }
        int minSteps = Integer.MAX_VALUE;
        for (int i = 0; i < board.length(); i++) {
            char c = board.charAt(i);
            if (handMap.getOrDefault(c, 0) > 0) {
                handMap.put(c, handMap.get(c) - 1);
                String newBoard = removeConsecutive(board.substring(0, i) + c + board.substring(i));
                int nextSteps = backtrack(newBoard, handMap);
                if (nextSteps != -1) {
                    minSteps = Math.min(minSteps, nextSteps + 1);
                }
                handMap.put(c, handMap.get(c) + 1);
            }
        }
        return minSteps == Integer.MAX_VALUE ? -1 : minSteps;
    }

    private String removeConsecutive(String board) {
        String prev;
        do {
            prev = board;
            board = board.replaceAll("(.)\\1{2,}", "");
        } while (!board.equals(prev));
        return board;
    }
}
