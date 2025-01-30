package string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Medium
 * <p>
 * In English, we have a concept called root, which can be followed by some other word to form another longer word - let's call this word successor. For example, when the root "an" is followed by the successor word "other", we can form a new word "another".
 * <p>
 * Given a dictionary consisting of many roots and a sentence consisting of words separated by spaces, replace all the successors in the sentence with the root forming it. If a successor can be replaced by more than one root, replace it with the root that has the shortest length.
 * <p>
 * Return the sentence after the replacement.
 * <p>
 * Example 1:
 * <p>
 * Input: dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery"
 * <p>
 * Output: "the cat was rat by the bat"
 * <p>
 * Example 2:
 * <p>
 * Input: dictionary = ["a","b","c"], sentence = "aadsfasf absbs bbab cadsfafs"
 * <p>
 * Output: "a a b c"
 * <p>
 * Constraints:
 * <p>
 * 1 <= dictionary.length <= 1000
 * 1 <= dictionary[i].length <= 100
 * dictionary[i] consists of only lower-case letters.
 * 1 <= sentence.length <= 106
 * sentence consists of only lower-case letters and spaces.
 * The number of words in sentence is in the range [1, 1000]
 * The length of each word in sentence is in the range [1, 1000]
 * Every two consecutive words in sentence will be separated by exactly one space.
 * sentence does not have leading or trailing spaces.
 */
public class ReplaceWords {

    public String replaceWords(List<String> dict, String sentence) {
        Trie root = new Trie();
        dict.forEach(root::insert);
        return sentence.lines()
                .flatMap(line -> Stream.of(line.split(" ")))
                .map(word -> {
                    String replacement = root.find(word);
                    return replacement.isEmpty() ? word : replacement;
                })
                .collect(Collectors.joining(" "));
    }

    static class Trie {
        private final Map<Character, Trie> map;

        public Trie() {
            map = new HashMap<>();
        }

        public void insert(String word) {
            if (word != null) {
                add(0, word, word.length());
            }
        }

        public String find(String s) {
            return search(this, s, 0, new StringBuilder());
        }

        private void add(int i, String word, int length) {
            if (i < length) {
                char c = word.charAt(i);
                Trie subTrie = map.computeIfAbsent(c, k -> new Trie());
                subTrie.add(i + 1, word, length);
            } else map.put(null, new Trie());
        }

        private String search(Trie curr, String s, int i, StringBuilder sb) {
            if (s.length() == i) return sb.toString();
            Trie subTrie = curr.map.get(s.charAt(i));
            if (subTrie == null) {
                return curr.map.containsKey(null) ? sb.toString() : "";
            } else {
                sb.append(s.charAt(i));
                return subTrie.map.containsKey(null) ? sb.toString() : search(subTrie, s, i + 1, sb);
            }
        }
    }
}
