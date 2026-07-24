package heap

import java.util.PriorityQueue

/**
 * Medium
 *
 * Rearrange the barcodes so that no two adjacent barcodes are equal.
 */
class DistantBarcodesK {

    fun rearrangeBarcodes(barcodes: IntArray): IntArray {
        val countMap = HashMap<Int, Int>()
        for (barcode in barcodes) {
            countMap[barcode] = countMap.getOrDefault(barcode, 0) + 1
        }

        val maxHeap = PriorityQueue<IntArray>(compareByDescending { it[1] })
        for ((key, value) in countMap) {
            maxHeap.offer(intArrayOf(key, value))
        }

        val result = IntArray(barcodes.size)
        var index = 0

        while (maxHeap.isNotEmpty()) {
            val first = maxHeap.poll()
            for (i in 0 until first[1]) {
                if (index >= barcodes.size) {
                    index = 1
                }
                result[index] = first[0]
                index += 2
            }
        }

        return result
    }
}

