package utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public static TreeNode create(Integer[] values) {
        if (values.length == 0 || values[0] == null) return null;
        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int index = 1;
        while (index < values.length) {
            TreeNode current = queue.poll();
            if (current != null) {
                Integer leftVal = values[index++];
                if (leftVal != null) {
                    current.left = new TreeNode(leftVal);
                }
                queue.offer(current.left);

                if (index < values.length) {
                    Integer rightVal = values[index++];
                    if (rightVal != null) {
                        current.right = new TreeNode(rightVal);
                    }
                    queue.offer(current.right);
                }
            }
        }
        return root;
    }

    public static List<Integer> toList(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return result;
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current != null) {
                result.add(current.value);
                queue.offer(current.left);
                queue.offer(current.right);
            }
        }
        int i = result.size() - 1;
        while (i >= 0 && result.get(i) == null) i--;
        return result.subList(0, i + 1);
    }

}
