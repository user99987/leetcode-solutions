package dynamicprogramming

/**
 * Hard
 *
 * Given a list of unique words, return all the pairs of the distinct indices (i, j) in the given list, so that the concatenation of the two words words[i] + words[j] is a palindrome.
 *
 * Example 1:
 *
 * Input: words = ["abcd","dcba","lls","s","sssll"]
 *
 * Output: [[0,1],[1,0],[3,2],[2,4]]
 *
 * Explanation: The palindromes are ["dcbaabcd","abcddcba","slls","llssssll"]
 *
 * Example 2:
 *
 * Input: words = ["bat","tab","cat"]
 *
 * Output: [[0,1],[1,0]]
 *
 * Explanation: The palindromes are ["battab","tabbat"]
 *
 * Example 3:
 *
 * Input: words = ["a",""]
 *
 * Output: [[0,1],[1,0]]
 *
 * Constraints:
 *
 * 1 <= words.length <= 5000
 * 0 <= words[i].length <= 300
 * words[i] consists of lower-case English letters.
 */
class PalindromePairsK {

    fun palindromePairs(words: Array<String>): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        val root = TrieNode()

        for (i in words.indices) {
            addWord(root, words[i], i)
        }

        for (i in words.indices) {
            search(words, i, root, result)
        }

        return result
    }

    private fun addWord(rootNode: TrieNode, word: String, index: Int) {
        var root = rootNode
        for (i in word.length - 1 downTo 0) {
            val ch = word[i] - 'a'
            if (root.children[ch] == null) {
                root.children[ch] = TrieNode()
            }
            if (isPalindrome(word, 0, i)) {
                root.palindromeList.add(index)
            }
            root = root.children[ch]!!
        }
        root.palindromeList.add(index)
        root.wordIndex = index
    }

    private fun search(words: Array<String>, i: Int, rootNode: TrieNode, result: MutableList<List<Int>>) {
        var root = rootNode
        for (j in words[i].indices) {
            if (root.wordIndex >= 0 && root.wordIndex != i && isPalindrome(words[i], j, words[i].length - 1)) {
                result.add(listOf(i, root.wordIndex))
            }
            root = root.children[words[i][j] - 'a'] ?: return
        }
        for (j in root.palindromeList) {
            if (i != j) {
                result.add(listOf(i, j))
            }
        }
    }

    private fun isPalindrome(word: String, leftStart: Int, rightStart: Int): Boolean {
        var left = leftStart
        var right = rightStart
        while (left < right) {
            if (word[left++] != word[right--]) {
                return false
            }
        }
        return true
    }

    private class TrieNode {
        val children: Array<TrieNode?> = arrayOfNulls(26)
        val palindromeList: MutableList<Int> = ArrayList()
        var wordIndex: Int = -1
    }
}

