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

    private final HashMap<Character, HashSet<Integer>> charToStickers = new HashMap<>();
    private final HashMap<Integer, Integer> memo = new HashMap<>();
    private int[][] stickerCounts;

    public int minStickers(String[] stickers, String target) {
        int n = stickers.length;
        stickerCounts = new int[n][26];

        for (int i = 0; i < 26; i++) {
            charToStickers.put((char) ('a' + i), new HashSet<>());
        }

        for (int i = 0; i < n; i++) {
            for (char c : stickers[i].toCharArray()) {
                stickerCounts[i][c - 'a']++;
                charToStickers.get(c).add(i);
            }
        }

        int result = findMinStickers(0, target);
        return result > target.length() ? -1 : result;
    }

    private int findMinStickers(int bitmask, String target) {
        int targetLength = target.length();
        if (bitmask == (1 << targetLength) - 1) {
            return 0;
        }
        if (memo.containsKey(bitmask)) {
            return memo.get(bitmask);
        }

        int index = 0;
        for (int i = 0; i < targetLength; i++) {
            if ((bitmask & (1 << i)) == 0) {
                index = i;
                break;
            }
        }

        int minStickers = targetLength + 1;
        for (int stickerIndex : charToStickers.get(target.charAt(index))) {
            int[] count = stickerCounts[stickerIndex].clone();
            int newBitmask = bitmask;

            for (int i = index; i < targetLength; i++) {
                if ((newBitmask & (1 << i)) != 0) {
                    continue;
                }
                char c = target.charAt(i);
                if (count[c - 'a'] > 0) {
                    count[c - 'a']--;
                    newBitmask |= (1 << i);
                }
            }

            int stickersUsed = findMinStickers(newBitmask, target) + 1;
            minStickers = Math.min(minStickers, stickersUsed);
        }

        memo.put(bitmask, minStickers);
        return minStickers;
    }
}
