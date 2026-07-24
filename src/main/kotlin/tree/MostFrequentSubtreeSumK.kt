package tree

import utils.TreeNodeK

/**
 * Medium
 *
 * Given the root of a binary tree, return the most frequent subtree sum(s). If there is a tie,
 * return all the values with the highest frequency.
 */
class MostFrequentSubtreeSumK {

    fun findFrequentTreeSum(root: TreeNodeK?): IntArray {
        val freqMap = HashMap<Int, Int>()
        computeSum(root, freqMap)
        val maxFreq = freqMap.values.maxOrNull() ?: 0
        return freqMap.filterValues { it == maxFreq }.keys.toIntArray()
    }

    private fun computeSum(node: TreeNodeK?, freqMap: MutableMap<Int, Int>): Int {
        if (node == null) return 0
        val sum = node.value + computeSum(node.left, freqMap) + computeSum(node.right, freqMap)
        freqMap.merge(sum, 1, Int::plus)
        return sum
    }
}

