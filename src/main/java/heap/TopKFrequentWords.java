package heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Medium
 * <p>
 * Given an array of strings words and an integer k, return the k most frequent strings.
 * <p>
 * Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.
 * <p>
 * Example 1:
 * <p>
 * Input: words = [“i”,”love”,”leetcode”,”i”,”love”,”coding”], k = 2
 * <p>
 * Output: [“i”,”love”]
 * <p>
 * Explanation: “i” and “love” are the two most frequent words. Note that “i” comes before “love” due to a lower alphabetical order.
 * <p>
 * Example 2:
 * <p>
 * Input: words = [“the”,”day”,”is”,”sunny”,”the”,”the”,”the”,”sunny”,”is”,”is”], k = 4
 * <p>
 * Output: [“the”,”is”,”sunny”,”day”]
 * <p>
 * Explanation: “the”, “is”, “sunny” and “day” are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 500
 * 1 <= words[i] <= 10
 * words[i] consists of lowercase English letters.
 * k is in the range [1, The number of **unique** words[i]]
 */
public class TopKFrequentWords {

    public static void main(String[] args) throws Exception {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        List<String> sorted = new TopKFrequentWords().topKFrequent(words, 2);
        sorted.forEach(System.out::println);
    }

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        SortedSet<Map.Entry<String, Integer>> sortedset =
                new TreeSet<>(
                        (e1, e2) -> {
                            if (e1.getValue().intValue() != e2.getValue().intValue()) {
                                return e2.getValue() - e1.getValue();
                            } else {
                                return e1.getKey().compareToIgnoreCase(e2.getKey());
                            }
                        });
        sortedset.addAll(map.entrySet());
        List<String> result = new ArrayList<>();
        Iterator<Map.Entry<String, Integer>> iterator = sortedset.iterator();
        while (iterator.hasNext() && k-- > 0) {
            result.add(iterator.next().getKey());
        }
        return result;
    }
}
