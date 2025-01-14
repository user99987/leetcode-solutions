package popular;


import utils.ListNode;

/**
 * Medium
 * <p>
 * Given the head of a linked list, return the list after sorting it in ascending order.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [4,2,1,3]
 * <p>
 * Output: [1,2,3,4]
 * <p>
 * Example 2:
 * <p>
 * Input: head = [-1,5,3,4,0]
 * <p>
 * Output: [-1,0,3,4,5]
 * <p>
 * Example 3:
 * <p>
 * Input: head = []
 * <p>
 * Output: []
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [0, 5 * 104].
 * -105 <= Node.val <= 105
 */
public class SortList {

    public static void main(String[] args) throws Exception {
        ListNode node = ListNode.createList(new int[]{-1, 5, 3, 4, 0});
        ListNode.printList(new SortList().sortList(node));
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = slow;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        ListNode first = sortList(head);
        ListNode second = sortList(slow);
        ListNode res = new ListNode(1);
        ListNode cur = res;
        while (first != null || second != null) {
            if (first == null) {
                cur.next = second;
                break;
            } else if (second == null) {
                cur.next = first;
                break;
            } else if (first.val <= second.val) {
                cur.next = first;
                first = first.next;
                cur = cur.next;
            } else {
                cur.next = second;
                second = second.next;
                cur = cur.next;
            }
        }
        return res.next;
    }
}
