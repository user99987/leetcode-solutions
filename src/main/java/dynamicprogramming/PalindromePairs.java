package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hard
 * <p>
 * Given a list of unique words, return all the pairs of the distinct indices (i, j) in the given list, so that the concatenation of the two words words[i] + words[j] is a palindrome.
 * <p>
 * Example 1:
 * <p>
 * Input: words = ["abcd","dcba","lls","s","sssll"]
 * <p>
 * Output: [[0,1],[1,0],[3,2],[2,4]]
 * <p>
 * Explanation: The palindromes are ["dcbaabcd","abcddcba","slls","llssssll"]
 * <p>
 * Example 2:
 * <p>
 * Input: words = ["bat","tab","cat"]
 * <p>
 * Output: [[0,1],[1,0]]
 * <p>
 * Explanation: The palindromes are ["battab","tabbat"]
 * <p>
 * Example 3:
 * <p>
 * Input: words = ["a",""]
 * <p>
 * Output: [[0,1],[1,0]]
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 5000
 * 0 <= words[i].length <= 300
 * words[i] consists of lower-case English letters.
 */
public class PalindromePairs {

    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        TrieNode root = new TrieNode();

        for (int i = 0; i < words.length; i++) {
            addWord(root, words[i], i);
        }

        for (int i = 0; i < words.length; i++) {
            search(words, i, root, result);
        }

        return result;
    }

    private void addWord(TrieNode root, String word, int index) {
        for (int i = word.length() - 1; i >= 0; i--) {
            int ch = word.charAt(i) - 'a';
            if (root.children[ch] == null) {
                root.children[ch] = new TrieNode();
            }
            if (isPalindrome(word, 0, i)) {
                root.palindromeList.add(index);
            }
            root = root.children[ch];
        }
        root.palindromeList.add(index);
        root.wordIndex = index;
    }

    private void search(String[] words, int i, TrieNode root, List<List<Integer>> result) {
        for (int j = 0; j < words[i].length(); j++) {
            if (root.wordIndex >= 0 && root.wordIndex != i && isPalindrome(words[i], j, words[i].length() - 1)) {
                result.add(Arrays.asList(i, root.wordIndex));
            }
            root = root.children[words[i].charAt(j) - 'a'];
            if (root == null) {
                return;
            }
        }
        for (int j : root.palindromeList) {
            if (i != j) {
                result.add(Arrays.asList(i, j));
            }
        }
    }

    private boolean isPalindrome(String word, int left, int right) {
        while (left < right) {
            if (word.charAt(left++) != word.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    private static class TrieNode {
        TrieNode[] children;
        int wordIndex;
        List<Integer> palindromeList;

        TrieNode() {
            children = new TrieNode[26];
            wordIndex = -1;
            palindromeList = new ArrayList<>();
        }
    }
}

