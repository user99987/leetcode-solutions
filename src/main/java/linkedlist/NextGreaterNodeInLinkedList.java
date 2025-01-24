package linkedlist;

import utils.ListNode;

import java.util.Arrays;

/**
 * Medium
 * <p>
 * You are given the head of a linked list with n nodes.
 * <p>
 * For each node in the list, find the value of the next greater node. That is, for each node, find the value of the first node that is next to it and has a strictly larger value than it.
 * <p>
 * Return an integer array answer where answer[i] is the value of the next greater node of the ith node (1-indexed). If the ith node does not have a next greater node, set answer[i] = 0.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [2,1,5]
 * <p>
 * Output: [5,5,0]
 * <p>
 * Example 2:
 * <p>
 * Input: head = [2,7,4,3,5]
 * <p>
 * Output: [7,0,5,5,0]
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is n.
 * 1 <= n <= 10^4
 * 1 <= Node.val <= 10^9
 */
public class NextGreaterNodeInLinkedList {

    public int[] nextLargerNodes(ListNode head) {
        int len = length(head);
        int i = 0;
        int[] arr = new int[len];
        int[] idx = new int[len];
        while (head != null) {
            arr[i] = head.val;
            head = head.next;
            i++;
        }
        hlp(arr, idx, 0);
        i = 0;
        while (i < idx.length) {
            int j = idx[i];
            if (j != -1) {
                arr[i] = arr[j];
            } else {
                arr[i] = 0;
            }
            i++;
        }
        arr[i - 1] = 0;
        return arr;
    }

    private void hlp(int[] arr, int[] idx, int i) {
        if (i == arr.length - 1) {
            idx[i] = -1;
            return;
        }
        hlp(arr, idx, i + 1);
        int j = i + 1;
        while (j != -1 && arr[i] >= arr[j]) {
            j = idx[j];
        }
        if ((j != -1) && arr[i] >= arr[j]) {
            idx[i] = -1;
        } else {
            idx[i] = j;
        }
    }

    private int length(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }

}
