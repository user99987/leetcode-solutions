package twopointers;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Medium
 * <p>
 * Given a string s and an array of strings words, return the number of words[i] that is a subsequence of s.
 * <p>
 * A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
 * <p>
 * For example, "ace" is a subsequence of "abcde".
 * Example 1:
 * <p>
 * Input: s = "abcde", words = ["a","bb","acd","ace"]
 * <p>
 * Output: 3
 * <p>
 * Explanation: There are three strings in words that are a subsequence of s: "a", "acd", "ace".
 * <p>
 * Example 2:
 * <p>
 * Input: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
 * <p>
 * Output: 2
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 5 * 10^4
 * 1 <= words.length <= 5000
 * 1 <= words[i].length <= 50
 * s and words[i] consist of only lowercase English letters.
 */
public class NumberOfMatchingSubsequences {

    public int numMatchingSubseq(String s, String[] words) {
        // Bucket each word by the next character it is waiting for.
        // This lets us make a single O(s.length) pass instead of repeatedly
        // scanning s per word (which would be O(s.length * totalWordsLength)).
        @SuppressWarnings("unchecked")
        Deque<int[]>[] buckets = new ArrayDeque[26];
        for (int i = 0; i < 26; i++) {
            buckets[i] = new ArrayDeque<>();
        }

        for (int w = 0; w < words.length; w++) {
            char first = words[w].charAt(0);
            buckets[first - 'a'].add(new int[]{w, 0});
        }

        int matched = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            var current = buckets[c];
            int size = current.size();
            for (int i2 = 0; i2 < size; i2++) {
                int[] entry = current.poll();
                int wordIndex = entry[0], charIndex = entry[1] + 1;
                String word = words[wordIndex];
                if (charIndex == word.length()) {
                    matched++;
                } else {
                    buckets[word.charAt(charIndex) - 'a'].add(new int[]{wordIndex, charIndex});
                }
            }
        }

        return matched;
    }
}


