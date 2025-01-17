package heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Medium
 * <p>
 * In a warehouse, there is a row of barcodes, where the ith barcode is barcodes[i].
 * <p>
 * Rearrange the barcodes so that no two adjacent barcodes are equal. You may return any answer, and it is guaranteed an answer exists.
 * <p>
 * Example 1:
 * <p>
 * Input: barcodes = [1,1,1,2,2,2]
 * <p>
 * Output: [2,1,2,1,2,1]
 * <p>
 * Example 2:
 * <p>
 * Input: barcodes = [1,1,1,1,2,2,3,3]
 * <p>
 * Output: [1,3,1,3,1,2,1,2]
 * <p>
 * Constraints:
 * <p>
 * 1 <= barcodes.length <= 10000
 * 1 <= barcodes[i] <= 10000
 */
public class DistantBarcodes {

    public static void main(String[] args) {
        int[] barcode = {1, 1, 1, 2, 2, 2};
        int[] result = new DistantBarcodes().rearrangeBarcodes(barcode);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int[] rearrangeBarcodes(int[] barcodes) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int i : barcodes) {
            cnt.put(i, cnt.getOrDefault(i, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(cnt.entrySet());
        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        int l = barcodes.length;
        int i = 0;
        int[] res = new int[l];
        for (Map.Entry<Integer, Integer> e : list) {
            int time = e.getValue();
            while (time-- > 0) {
                res[i] = e.getKey();
                i += 2;
                if (i >= barcodes.length) {
                    i = 1;
                }
            }
        }
        return res;
    }
}
