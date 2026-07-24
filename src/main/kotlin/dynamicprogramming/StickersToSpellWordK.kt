package dynamicprogramming

/**
 * Hard
 *
 * We are given n different types of stickers. Each sticker has a lowercase English word on it.
 *
 * You would like to spell out the given string target by cutting individual letters from your collection of stickers and rearranging them. You can use each sticker more than once if you want, and you have infinite quantities of each sticker.
 *
 * Return the minimum number of stickers that you need to spell out target. If the task is impossible, return -1.
 *
 * Note: In all test cases, all words were chosen randomly from the 1000 most common US English words, and target was chosen as a concatenation of two random words.
 *
 * Example 1:
 *
 * Input: stickers = ["with","example","science"], target = "thehat"
 *
 * Output: 3
 *
 * Explanation:
 *
 * We can use 2 "with" stickers, and 1 "example" sticker.
 *
 * After cutting and rearrange the letters of those stickers, we can form the target "thehat".
 *
 * Also, this is the minimum number of stickers necessary to form the target string.
 *
 * Example 2:
 *
 * Input: stickers = ["notice","possible"], target = "basicbasic"
 *
 * Output: -1
 *
 * Explanation: We cannot form the target "basicbasic" from cutting letters from the given stickers.
 *
 * Constraints:
 *
 * n == stickers.length
 * 1 <= n <= 50
 * 1 <= stickers[i].length <= 10
 * 1 <= target <= 15
 * stickers[i] and target consist of lowercase English letters.
 */
class StickersToSpellWordK {

    private val charToStickers = HashMap<Char, HashSet<Int>>()
    private val memo = HashMap<Int, Int>()
    private lateinit var stickerCounts: Array<IntArray>

    fun minStickers(stickers: Array<String>, target: String): Int {
        val n = stickers.size
        stickerCounts = Array(n) { IntArray(26) }

        for (i in 0 until 26) {
            charToStickers[('a' + i)] = HashSet()
        }

        for (i in 0 until n) {
            for (c in stickers[i]) {
                stickerCounts[i][c - 'a']++
                charToStickers[c]!!.add(i)
            }
        }

        val result = findMinStickers(0, target)
        return if (result > target.length) -1 else result
    }

    private fun findMinStickers(bitmask: Int, target: String): Int {
        val targetLength = target.length
        if (bitmask == (1 shl targetLength) - 1) {
            return 0
        }
        memo[bitmask]?.let { return it }

        var index = 0
        for (i in 0 until targetLength) {
            if ((bitmask and (1 shl i)) == 0) {
                index = i
                break
            }
        }

        var minStickers = targetLength + 1
        for (stickerIndex in charToStickers[target[index]]!!) {
            val count = stickerCounts[stickerIndex].clone()
            var newBitmask = bitmask

            for (i in index until targetLength) {
                if ((newBitmask and (1 shl i)) != 0) {
                    continue
                }
                val c = target[i]
                if (count[c - 'a'] > 0) {
                    count[c - 'a']--
                    newBitmask = newBitmask or (1 shl i)
                }
            }

            val stickersUsed = findMinStickers(newBitmask, target) + 1
            minStickers = minOf(minStickers, stickersUsed)
        }

        memo[bitmask] = minStickers
        return minStickers
    }
}

