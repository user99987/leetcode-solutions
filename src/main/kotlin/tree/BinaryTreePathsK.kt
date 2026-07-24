package tree

import utils.TreeNodeK

/**
 * Easy
 *
 * Given the root of a binary tree, return all root-to-leaf paths in any order.
 */
class BinaryTreePathsK {

    fun binaryTreePaths(root: TreeNodeK?): List<String> {
        val result = ArrayList<String>()
        traverse(root, StringBuilder(), result)
        return result
    }

    private fun traverse(node: TreeNodeK?, path: StringBuilder, result: MutableList<String>) {
        if (node == null) return
        val previousLength = path.length
        if (previousLength > 0) {
            path.append("->")
        }
        path.append(node.value)
        if (node.left == null && node.right == null) {
            result.add(path.toString())
        } else {
            traverse(node.left, path, result)
            traverse(node.right, path, result)
        }
        path.setLength(previousLength)
    }
}

