package linkedlist;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NextGreaterNodeInLinkedListTest {

    @Test
    void testCase1() {
        ListNode head = ListNode.create(new int[]{2, 1, 5});
        int[] expected = {5, 5, 0};
        assertArrayEquals(expected, new NextGreaterNodeInLinkedList().nextLargerNodes(head));
    }

    @Test
    void testCase2() {
        ListNode head = ListNode.create(new int[]{2, 7, 4, 3, 5});
        int[] expected = {7, 0, 5, 5, 0};
        assertArrayEquals(expected, new NextGreaterNodeInLinkedList().nextLargerNodes(head));
    }
}
