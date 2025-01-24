package array;

/**
 * Medium
 * <p>
 * We stack glasses in a pyramid, where the first row has 1 glass, the second row has 2 glasses, and so on until the 100th row. Each glass holds one cup of champagne.
 * <p>
 * Then, some champagne is poured into the first glass at the top. When the topmost glass is full, any excess liquid poured will fall equally to the glass immediately to the left and right of it. When those glasses become full, any excess champagne will fall equally to the left and right of those glasses, and so on. (A glass at the bottom row has its excess champagne fall on the floor.)
 * <p>
 * For example, after one cup of champagne is poured, the top most glass is full. After two cups of champagne are poured, the two glasses on the second row are half full. After three cups of champagne are poured, those two cups become full - there are 3 full glasses total now. After four cups of champagne are poured, the third row has the middle glass half full, and the two outside glasses are a quarter full, as pictured below.
 * <p>
 * Now after pouring some non-negative integer cups of champagne, return how full the jth glass in the ith row is (both i and j are 0-indexed.)
 * <p>
 * Example 1:
 * <p>
 * Input: poured = 1, query_row = 1, query_glass = 1
 * <p>
 * Output: 0.00000
 * <p>
 * Explanation: We poured 1 cup of champange to the top glass of the tower (which is indexed as (0, 0)). There will be no excess liquid so all the glasses under the top glass will remain empty.
 * <p>
 * Example 2:
 * <p>
 * Input: poured = 2, query_row = 1, query_glass = 1
 * <p>
 * Output: 0.50000
 * <p>
 * Explanation: We poured 2 cups of champange to the top glass of the tower (which is indexed as (0, 0)). There is one cup of excess liquid. The glass indexed as (1, 0) and the glass indexed as (1, 1) will share the excess liquid equally, and each will get half cup of champange.
 * <p>
 * Example 3:
 * <p>
 * Input: poured = 100000009, query_row = 33, query_glass = 17
 * <p>
 * Output: 1.00000
 * <p>
 * Constraints:
 * <p>
 * 0 <= poured <= 109
 * 0 <= query_glass <= query_row < 100
 */
public class ChampagneTower {

    public double champagneTower(int poured, int queryRow, int queryGlass) {
        int curRow = 0;
        // first row
        double[] cur = new double[]{poured};
        // second row
        double[] next = new double[2];
        boolean spilled;
        do {
            spilled = false;
            for (int i = 0; i < cur.length; i++) {
                // spilling, put the excess into the next row.
                if (cur[i] > 1) {
                    double spilledAmount = cur[i] - 1;
                    cur[i] = 1;
                    next[i] += spilledAmount / 2;
                    next[i + 1] = spilledAmount / 2;
                    spilled = true;
                }
            }
            // got to the desired row, return the glass amount
            if (curRow == queryRow) {
                return cur[queryGlass];
            }
            cur = next;
            curRow++;
            next = new double[curRow + 2];
        } while (spilled);
        // spill did not happen to the desired row
        return 0;
    }
}
