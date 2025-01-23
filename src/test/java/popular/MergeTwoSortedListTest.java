package popular;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeTwoSortedListTest {

    @Test
    public void testCase1() {
        ListNode l1 = ListNode.createList(new int[]{1, 2, 4});
        ListNode l2 = ListNode.createList(new int[]{1, 3, 4});
        ListNode result = new MergeTwoSortedList().mergeTwoLists(l1, l2);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, ListNode.toArray(result));
    }

    @Test
    public void testCase2() {
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode result = new MergeTwoSortedList().mergeTwoLists(l1, l2);
        assertNull(result);
    }

    @Test
    public void testCase3() {
        ListNode l1 = null;
        ListNode l2 = new ListNode(0);
        ListNode result = new MergeTwoSortedList().mergeTwoLists(l1, l2);
        assertArrayEquals(new int[]{0}, ListNode.toArray(result));
    }
}
