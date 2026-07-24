package heap

import java.util.PriorityQueue

/**
 * Medium
 *
 * Given an array of strings words and an integer k, return the k most frequent strings, sorted
 * by frequency from highest to lowest, ties broken by lexicographical order.
 */
class TopKFrequentWordsK {

    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        val frequencyMap = HashMap<String, Int>()
        for (word in words) {
            frequencyMap[word] = frequencyMap.getOrDefault(word, 0) + 1
        }

        val minHeap = PriorityQueue<String> { a, b ->
            val freqCompare = frequencyMap[a]!! - frequencyMap[b]!!
            if (freqCompare != 0) freqCompare else b.compareTo(a)
        }

        for (word in frequencyMap.keys) {
            minHeap.offer(word)
            if (minHeap.size > k) {
                minHeap.poll()
            }
        }

        val result = ArrayList<String>()
        while (minHeap.isNotEmpty()) {
            result.add(minHeap.poll())
        }
        result.reverse()
        return result
    }
}

