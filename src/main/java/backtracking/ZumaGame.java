package backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
 * Insert 'R' so the board becomes WRRRBBW. WRRRBBW -> WBBW.
 * <p>
 * Insert 'B' so the board becomes WBBBW. WBBBW -> WW.
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
 * Insert 'R' so the board becomes WWRRRBBWW. WWRRRBBWW -> WWBBWW.
 * <p>
 * Insert 'B' so the board becomes WWBBBWW. WWBBBWW -> WWWW -> empty.
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
        List<Character> boards = new ArrayList<>();
        for (char c : board.toCharArray()) boards.add(c);
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('B', 0);
        hm.put('G', 0);
        hm.put('R', 0);
        hm.put('Y', 0);
        hm.put('W', 0);
        for (char c : hand.toCharArray()) hm.put(c, hm.get(c) + 1);
        return find(boards, hm);

    }

    public int find(List<Character> boards, HashMap<Character, Integer> hm) {
        removeAdjacent(boards);
        if (boards.isEmpty()) return 0;
        if (isEmpty(hm)) return -1;
        int cnt = 0;
        int retVal = Integer.MAX_VALUE;
        for (int i = 0; i < boards.size(); i++) {
            char c = boards.get(i);
            cnt++;
            if (i == boards.size() - 1 || boards.get(i + 1) != c) {
                int missing = 3 - cnt;
                if (missing <= hm.get(c)) {
                    hm.put(c, hm.get(c) - missing);
                    List<Character> temp = new ArrayList<>(boards);
                    if (i >= i - cnt + 1) {
                        temp.subList(i - cnt + 1, i + 1).clear();
                    }
                    int next = find(temp, hm);
                    if (next != -1) retVal = Math.min(next + missing, retVal);
                    hm.put(c, hm.get(c) + missing);
                }
                cnt = 0;
            }
        }
        if (retVal == Integer.MAX_VALUE) return -1;
        else return retVal;
    }

    public void removeAdjacent(List<Character> board) {
        int cnt = 0;
        boolean done = true;
        for (int i = 0; i < board.size(); i++) {
            char c = board.get(i);
            cnt++;
            if (i == board.size() - 1 || c != board.get(i + 1)) {
                if (cnt >= 3) {
                    if (i >= i - cnt + 1) {
                        board.subList(i - cnt + 1, i + 1).clear();
                    }
                    done = false;
                    break;
                }
                cnt = 0;
            }
        }
        if (!done) removeAdjacent(board);
    }

    public boolean isEmpty(HashMap<Character, Integer> hand) {
        for (int i : hand.values()) {
            if (i > 0) return false;
        }
        return true;
    }
}
