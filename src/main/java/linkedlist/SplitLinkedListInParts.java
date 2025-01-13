package linkedlist;

import utils.ListNode;

import java.util.Objects;

/**
 * Medium
 * <p>
 * Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.
 * <p>
 * The length of each part should be as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being null.
 * <p>
 * The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal to parts occurring later.
 * <p>
 * Return an array of the k parts.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [1,2,3], k = 5
 * <p>
 * Output: [[1],[2],[3],[],[]]
 * <p>
 * Explanation:
 * <p>
 * The first element output[0] has output[0].val = 1, output[0].next = null.
 * <p>
 * The last element output[4] is null, but its string representation as a ListNode is [].
 * <p>
 * Example 2:
 * <p>
 * Input: head = [1,2,3,4,5,6,7,8,9,10], k = 3
 * <p>
 * Output: [[1,2,3,4],[5,6,7],[8,9,10]]
 * <p>
 * Explanation:
 * <p>
 * The input has been split into consecutive parts with size difference at most 1, and earlier parts are a larger size than the later parts.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [0, 1000].
 * 0 <= Node.val <= 1000
 * 1 <= k <= 50
 */
public class SplitLinkedListInParts {
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        ListNode[] result = new SplitLinkedListInParts().splitListToParts(root, 5);
        for (ListNode node : result) {
            if (node != null) {
                System.out.println(node.val);
            } else {
                System.out.println("null");
            }
        }
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = getLength(head);
        int aveSize = len / k;
        int extra = len % k;
        ListNode[] result = new ListNode[k];
        for (int i = 0; i < k; i++) {
            result[i] = head;
            int aveSizeTmp = aveSize;
            aveSizeTmp += extra-- > 0 ? 1 : 0;
            int aveSizeTmp2 = aveSizeTmp;
            while (aveSizeTmp-- > 0) {
                head = Objects.requireNonNull(head).next;
            }
            if (result[i] != null) {
                ListNode tmp = result[i];
                while (tmp.next != null && aveSizeTmp2-- > 1) {
                    tmp = tmp.next;
                }
                tmp.next = null;
            }
        }
        return result;
    }

    private int getLength(ListNode root) {
        int len = 0;
        ListNode tmp = root;
        while (tmp != null) {
            len++;
            tmp = tmp.next;
        }
        return len;
    }

}
