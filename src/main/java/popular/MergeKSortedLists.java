package popular;

import utils.ListNode;

/**
 * Hard
 * <p>
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * <p>
 * Merge all the linked-lists into one sorted linked-list and return it.
 * <p>
 * Example 1:
 * <p>
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * <p>
 * Output: [1,1,2,3,4,4,5,6]
 * <p>
 * Explanation: The linked-lists are: [ 1->4->5, 1->3->4, 2->6 ] merging them into one sorted list: 1->1->2->3->4->4->5->6
 * <p>
 * Example 2:
 * <p>
 * Input: lists = []
 * <p>
 * Output: []
 * <p>
 * Example 3:
 * <p>
 * Input: lists = [[]]
 * <p>
 * Output: []
 * <p>
 * Constraints:
 * <p>
 * k == lists.length
 * 0 <= k <= 10^4
 * 0 <= lists[i].length <= 500
 * -10^4 <= lists[i][j] <= 10^4
 * lists[i] is sorted in ascending order.
 * The sum of lists[i].length won't exceed 10^4.
 */
public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if (lists.length == 1) return lists[0];
        return merge(lists, 0, lists.length - 1);
    }

    private ListNode merge(ListNode[] lists, int s, int e) {
        if (s == e) return lists[s];
        int m = s + (e - s) / 2;
        ListNode left = merge(lists, s, m);
        ListNode right = merge(lists, m + 1, e);
        ListNode prev, temp;
        ListNode headNode = new ListNode(0);
        headNode.next = left;
        prev = headNode;
        if (left == null && right == null) return null;
        else if (left == null) return right;
        else if (right == null) return left;
        while (left != null && right != null) {
            if (left.val > right.val) {
                temp = right;
                right = right.next;
                prev.next = temp;
                temp.next = left;
                prev = prev.next;
            } else {
                left = left.next;
                prev = prev.next;
            }
        }
        if (left == null && right != null) prev.next = right;
        return headNode.next;
    }

}
