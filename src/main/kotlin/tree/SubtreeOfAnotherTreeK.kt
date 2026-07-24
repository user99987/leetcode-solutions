package tree

import utils.TreeNodeK

/**
 * Easy
 *
 * Return true if there is a subtree of root with the same structure and node values of subRoot.
 */
class SubtreeOfAnotherTreeK {

    fun isSubtree(root: TreeNodeK?, subRoot: TreeNodeK?): Boolean {
        val tree = StringBuilder()
        val subtree = StringBuilder()
        serialize(root, tree)
        serialize(subRoot, subtree)
        return contains(tree, subtree)
    }

    private fun serialize(node: TreeNodeK?, result: StringBuilder) {
        if (node == null) {
            result.append(",#")
            return
        }
        result.append(',').append(node.value)
        serialize(node.left, result)
        serialize(node.right, result)
    }

    private fun contains(text: CharSequence, pattern: CharSequence): Boolean {
        val lps = buildLps(pattern)
        var j = 0
        for (i in text.indices) {
            while (j > 0 && text[i] != pattern[j]) {
                j = lps[j - 1]
            }
            if (text[i] == pattern[j]) {
                j++
                if (j == pattern.length) {
                    return true
                }
            }
        }
        return false
    }

    private fun buildLps(pattern: CharSequence): IntArray {
        val lps = IntArray(pattern.length)
        var length = 0
        var i = 1
        while (i < pattern.length) {
            while (length > 0 && pattern[i] != pattern[length]) {
                length = lps[length - 1]
            }
            if (pattern[i] == pattern[length]) {
                length++
                lps[i] = length
            }
            i++
        }
        return lps
    }
}

