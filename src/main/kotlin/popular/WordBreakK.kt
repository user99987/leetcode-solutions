package popular

/**
 * Medium
 *
 * Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
 *
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 *
 * Example 1:
 *
 * Input: s = "leetcode", wordDict = ["leet","code"]
 *
 * Output: true
 *
 * Explanation: Return true because "leetcode" can be segmented as "leet code".
 *
 * Example 2:
 *
 * Input: s = "applepenapple", wordDict = ["apple","pen"]
 *
 * Output: true
 *
 * Explanation: Return true because "applepenapple" can be segmented as "apple pen apple". Note that you are allowed to reuse a dictionary word.
 *
 * Example 3:
 *
 * Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
 *
 * Output: false
 *
 * Constraints:
 *
 * 1 <= s.length <= 300
 * 1 <= wordDict.length <= 1000
 * 1 <= wordDict[i].length <= 20
 * s and wordDict[i] consist of only lowercase English letters.
 * All the strings of wordDict are unique.
 */
class WordBreakK {

    fun wordBreak(input: String, wordDict: List<String>): Boolean {
        val dictionary = HashSet(wordDict)
        val memo = HashMap<Int, Boolean>()
        return canSegment(0, input, memo, dictionary)
    }

    private fun canSegment(index: Int, input: String, memo: MutableMap<Int, Boolean>, dictionary: Set<String>): Boolean {
        if (index == input.length) return true
        memo[index]?.let { return it }

        val canBreak = dictionary
            .filter { input.startsWith(it, index) }
            .any { canSegment(index + it.length, input, memo, dictionary) }

        memo[index] = canBreak
        return canBreak
    }
}

