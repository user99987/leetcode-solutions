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
 * Input: words = [“abcd”,”dcba”,”lls”,”s”,”sssll”]
 * <p>
 * Output: [[0,1],[1,0],[3,2],[2,4]]
 * <p>
 * Explanation: The palindromes are [“dcbaabcd”,”abcddcba”,”slls”,”llssssll”]
 * <p>
 * Example 2:
 * <p>
 * Input: words = [“bat”,”tab”,”cat”]
 * <p>
 * Output: [[0,1],[1,0]]
 * <p>
 * Explanation: The palindromes are [“battab”,”tabbat”]
 * <p>
 * Example 3:
 * <p>
 * Input: words = [“a”,””]
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


    public static void main(String[] args) throws Exception {
        String[] words = {"", "aa"};
        List<List<Integer>> result = new PalindromePairs().palindromePairs(words);
        result.stream().map(x -> (x.get(0) + " " + x.get(1))).forEach(System.out::println);
    }

    private static class TrieNode {
        TrieNode[] next;
        int index;
        List<Integer> list;

        TrieNode() {
            next = new TrieNode[26];
            index = -1;
            list = new ArrayList<>();
        }
    }

    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();
        TrieNode root = new TrieNode();
        for (int i = 0; i < words.length; i++) {
            addWord(root, words[i], i);
        }
        for (int i = 0; i < words.length; i++) {
            search(words, i, root, res);
        }
        return res;
    }

    private void addWord(TrieNode root, String word, int index) {
        for (int i = word.length() - 1; i >= 0; i--) {
            int j = word.charAt(i) - 'a';
            if (root.next[j] == null) {
                root.next[j] = new TrieNode();
            }
            if (isPalindrome(word, 0, i)) {
                root.list.add(index);
            }
            root = root.next[j];
        }
        root.list.add(index);
        root.index = index;
    }

    private void search(String[] words, int i, TrieNode root, List<List<Integer>> res) {
        for (int j = 0; j < words[i].length(); j++) {
            if (root.index >= 0
                    && root.index != i
                    && isPalindrome(words[i], j, words[i].length() - 1)) {
                res.add(Arrays.asList(i, root.index));
            }
            root = root.next[words[i].charAt(j) - 'a'];
            if (root == null) {
                return;
            }
        }
        for (int j : root.list) {
            if (i == j) {
                continue;
            }
            res.add(Arrays.asList(i, j));
        }
    }

    private boolean isPalindrome(String word, int i, int j) {
        while (i < j) {
            if (word.charAt(i++) != word.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
