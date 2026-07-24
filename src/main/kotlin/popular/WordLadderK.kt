package popular

/**
 * Hard
 *
 * A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words beginWord -> s1 -> s2 -> ... -> sk such that:
 *
 * Every adjacent pair of words differs by a single letter.
 * Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
 * sk == endWord
 * Given two words, beginWord and endWord, and a dictionary wordList, return the number of words in the shortest transformation sequence from beginWord to endWord, or 0 if no such sequence exists.
 *
 * Example 1:
 *
 * Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
 *
 * Output: 5
 *
 * Explanation: One shortest transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> cog", which is 5 words long.
 *
 * Example 2:
 *
 * Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
 *
 * Output: 0
 *
 * Explanation: The endWord "cog" is not in wordList, therefore there is no valid transformation sequence.
 *
 * Constraints:
 *
 * 1 <= beginWord.length <= 10
 * endWord.length == beginWord.length
 * 1 <= wordList.length <= 5000
 * wordList[i].length == beginWord.length
 * beginWord, endWord, and wordList[i] consist of lowercase English letters.
 * beginWord != endWord
 * All the words in wordList are unique.
 */
class WordLadderK {

    fun ladderLength(beginWord: String, endWord: String, wordDict: List<String>): Int {
        if (!wordDict.contains(endWord)) return 0

        val wordSet = HashSet(wordDict)
        var startSet = hashSetOf(beginWord)
        var endSet = hashSetOf(endWord)
        val visited = HashSet<String>()
        var steps = 1

        while (startSet.isNotEmpty() && endSet.isNotEmpty()) {
            if (startSet.size > endSet.size) {
                val temp = startSet
                startSet = endSet
                endSet = temp
            }

            val nextSet = HashSet<String>()
            for (word in startSet) {
                val chars = word.toCharArray()
                for (i in chars.indices) {
                    val originalChar = chars[i]
                    for (c in 'a'..'z') {
                        chars[i] = c
                        val transformed = String(chars)
                        if (endSet.contains(transformed)) return steps + 1
                        if (wordSet.contains(transformed) && visited.add(transformed)) {
                            nextSet.add(transformed)
                        }
                    }
                    chars[i] = originalChar
                }
            }
            startSet = nextSet
            steps++
        }
        return 0
    }
}

