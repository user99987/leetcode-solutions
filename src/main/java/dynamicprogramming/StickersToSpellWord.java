package dynamicprogramming;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Hard
 * <p>
 * We are given n different types of stickers. Each sticker has a lowercase English word on it.
 * <p>
 * You would like to spell out the given string target by cutting individual letters from your collection of stickers and rearranging them. You can use each sticker more than once if you want, and you have infinite quantities of each sticker.
 * <p>
 * Return the minimum number of stickers that you need to spell out target. If the task is impossible, return -1.
 * <p>
 * Note: In all test cases, all words were chosen randomly from the 1000 most common US English words, and target was chosen as a concatenation of two random words.
 * <p>
 * Example 1:
 * <p>
 * Input: stickers = ["with","example","science"], target = "thehat"
 * <p>
 * Output: 3
 * <p>
 * Explanation:
 * <p>
 * We can use 2 "with" stickers, and 1 "example" sticker.
 * <p>
 * After cutting and rearrange the letters of those stickers, we can form the target "thehat".
 * <p>
 * Also, this is the minimum number of stickers necessary to form the target string.
 * <p>
 * Example 2:
 * <p>
 * Input: stickers = ["notice","possible"], target = "basicbasic"
 * <p>
 * Output: -1
 * <p>
 * Explanation: We cannot form the target "basicbasic" from cutting letters from the given stickers.
 * <p>
 * Constraints:
 * <p>
 * n == stickers.length
 * 1 <= n <= 50
 * 1 <= stickers[i].length <= 10
 * 1 <= target <= 15
 * stickers[i] and target consist of lowercase English letters.
 */
public class StickersToSpellWord {

    // For each character, save the sticker index which has this character
    private final HashMap<Character, HashSet<Integer>> map = new HashMap<>();
    private final HashMap<Integer, Integer> cache = new HashMap<>();
    // count the characters of every sticker
    private int[][] counts;

    public int minStickers(String[] stickers, String target) {
        counts = new int[stickers.length][26];
        for (int i = 0; i < 26; i++) {
            map.put((char) ('a' + i), new HashSet<>());
        }
        for (int i = 0; i < stickers.length; i++) {
            for (char c : stickers[i].toCharArray()) {
                counts[i][c - 'a']++;
                map.get(c).add(i);
            }
        }
        int res = dp(0, target);
        if (res > target.length()) {
            return -1;
        }
        return res;
    }

    private int dp(int bits, String target) {
        int len = target.length();
        if (bits == (1 << len) - 1) {
            // all bits are 1
            return 0;
        }
        if (cache.containsKey(bits)) {
            return cache.get(bits);
        }
        int index = 0;
        // find the first bit which is 0
        for (int i = 0; i < len; i++) {
            if ((bits & (1 << i)) == 0) {
                index = i;
                break;
            }
        }
        // In worst case, each character use 1 sticker. So, len + 1 means impossible
        int res = len + 1;
        for (int key : map.get(target.charAt(index))) {
            int[] count = counts[key].clone();
            int mask = bits;
            for (int i = index; i < len; i++) {
                if ((mask & (1 << i)) != 0) {
                    // this bit has already been 1
                    continue;
                }
                char c = target.charAt(i);
                if (count[c - 'a'] > 0) {
                    count[c - 'a']--;
                    mask |= (1 << i);
                }
            }
            int val = dp(mask, target) + 1;
            res = Math.min(res, val);
        }
        cache.put(bits, res);
        return res;
    }
}
