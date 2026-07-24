package tree

import utils.TreeNodeK

/**
 * Medium
 *
 * Given a binary search tree, find the lowest common ancestor (LCA) of two given nodes in the
 * tree.
 */
class LowestCommonAncestorBSTK {

    fun lowestCommonAncestor(root: TreeNodeK?, p: TreeNodeK, q: TreeNodeK): TreeNodeK? {
        if (root == null || root.value == p.value || root.value == q.value) return root
        if (p.value < root.value && q.value < root.value) return lowestCommonAncestor(root.left, p, q)
        if (p.value > root.value && q.value > root.value) return lowestCommonAncestor(root.right, p, q)
        return root
    }
}

