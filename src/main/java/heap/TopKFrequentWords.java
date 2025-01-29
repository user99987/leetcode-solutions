package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Medium
 * <p>
 * Given an array of strings words and an integer k, return the k most frequent strings.
 * <p>
 * Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.
 * <p>
 * Example 1:
 * <p>
 * Input: words = ["i","love","leetcode","i","love","coding"], k = 2
 * <p>
 * Output: ["i","love"]
 * <p>
 * Explanation: "i" and "love" are the two most frequent words. Note that "i" comes before "love" due to a lower alphabetical order.
 * <p>
 * Example 2:
 * <p>
 * Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
 * <p>
 * Output: ["the","is","sunny","day"]
 * <p>
 * Explanation: "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 500
 * 1 <= words[i] <= 10
 * words[i] consists of lowercase English letters.
 * k is in the range [1, The number of **unique** words[i]]
 */
public class TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> minHeap = new PriorityQueue<>((a, b) -> {
            int freqCompare = frequencyMap.get(a) - frequencyMap.get(b);
            return freqCompare != 0 ? freqCompare : b.compareTo(a);
        });

        for (String word : frequencyMap.keySet()) {
            minHeap.offer(word);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        List<String> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }
        Collections.reverse(result);
        return result;
    }
}
