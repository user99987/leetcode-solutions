package heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

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

    public int[] rearrangeBarcodes(int[] barcodes) {
        var countMap = new HashMap<Integer, Integer>();
        for (var barcode : barcodes) {
            countMap.put(barcode, countMap.getOrDefault(barcode, 0) + 1);
        }

        var maxHeap = new PriorityQueue<int[]>((a, b) -> b[1] - a[1]);
        for (var entry : countMap.entrySet()) {
            maxHeap.offer(new int[]{entry.getKey(), entry.getValue()});
        }

        var result = new int[barcodes.length];
        var index = 0;

        while (!maxHeap.isEmpty()) {
            var first = maxHeap.poll();
            for (var i = 0; i < first[1]; i++) {
                if (index >= barcodes.length) {
                    index = 1;
                }
                result[index] = first[0];
                index += 2;
            }
        }

        return result;
    }
}
