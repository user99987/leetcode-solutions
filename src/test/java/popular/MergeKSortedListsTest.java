package popular;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeKSortedListsTest {

    @Test
    public void testCase1() {
        ListNode[] lists = new ListNode[]{
                ListNode.createList(new int[]{1, 4, 5}),
                ListNode.createList(new int[]{1, 3, 4}),
                ListNode.createList(new int[]{2, 6})
        };
        ListNode result = new MergeKSortedLists().mergeKLists(lists);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4, 5, 6}, ListNode.toArray(result));
    }

    @Test
    public void testCase2() {
        ListNode[] lists = new ListNode[]{};
        ListNode result = new MergeKSortedLists().mergeKLists(lists);
        assertNull(result);
    }

    @Test
    public void testCase3() {
        ListNode[] lists = new ListNode[]{new ListNode()};
        ListNode result = new MergeKSortedLists().mergeKLists(lists);
        assertNull(result.next);
        assertEquals(0, result.val);
    }
}
