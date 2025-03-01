package popular;

import utils.ListNode;

/**
 * Easy
 * <p>
 * Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example 1:
 * <p>
 * Input: l1 = [1,2,4], l2 = [1,3,4]
 * <p>
 * Output: [1,1,2,3,4,4]
 * <p>
 * Example 2:
 * <p>
 * Input: l1 = [], l2 = []
 * <p>
 * Output: []
 * <p>
 * Example 3:
 * <p>
 * Input: l1 = [], l2 = [0]
 * <p>
 * Output: [0]
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both l1 and l2 are sorted in non-decreasing order.
 */
public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        return (l1.value < l2.value) ? new ListNode(l1.value, mergeTwoLists(l1.next, l2))
                : new ListNode(l2.value, mergeTwoLists(l1, l2.next));
    }

}
