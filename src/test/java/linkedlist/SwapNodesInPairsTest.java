package linkedlist;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SwapNodesInPairsTest {

    @Test
    void testCase1() {
        ListNode head = ListNode.create(new int[]{1, 2, 3, 4});
        ListNode expected = ListNode.create(new int[]{2, 1, 4, 3});
        ListNode actual = new SwapNodesInPairs().swapPairs(head);
        assertArrayEquals(ListNode.toArray(expected), ListNode.toArray(actual));
    }

    @Test
    void testCase2() {
        ListNode head = ListNode.create(new int[]{});
        assertNull(new SwapNodesInPairs().swapPairs(head));
    }

    @Test
    void testCase3() {
        ListNode head = ListNode.create(new int[]{1});
        ListNode expected = ListNode.create(new int[]{1});
        ListNode actual = new SwapNodesInPairs().swapPairs(head);
        assertArrayEquals(ListNode.toArray(expected), ListNode.toArray(actual));
    }
}
