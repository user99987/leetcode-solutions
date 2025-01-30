package popular;


import utils.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        List<ListNode> nodeList = new ArrayList<>();
        for (ListNode current = head; current != null; current = current.next) nodeList.add(current);
        nodeList.sort(Comparator.comparingInt(node -> node.val));
        for (int i = 0; i < nodeList.size() - 1; i++) nodeList.get(i).next = nodeList.get(i + 1);
        nodeList.get(nodeList.size() - 1).next = null;
        return nodeList.get(0);
    }
}
