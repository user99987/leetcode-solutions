package linkedlist;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteNodeTest {

    @Test
    void testCase1() {
        ListNode head = ListNode.create(new int[]{4, 5, 1, 9});
        new DeleteNode().deleteNode(head.next);
        assertArrayEquals(new int[]{4, 1, 9}, ListNode.toArray(head));
    }

    @Test
    void testCase2() {
        ListNode head = ListNode.create(new int[]{4, 5, 1, 9});
        new DeleteNode().deleteNode(head.next.next);
        assertArrayEquals(new int[]{4, 5, 9}, ListNode.toArray(head));
    }

    @Test
    void testCase3() {
        ListNode head = ListNode.create(new int[]{1, 2, 3, 4});
        ListNode nodeToDelete = head.next.next;
        new DeleteNode().deleteNode(nodeToDelete);
        assertArrayEquals(new int[]{1, 2, 4}, ListNode.toArray(head));
    }

    @Test
    void testCase4() {
        ListNode head = ListNode.create(new int[]{0, 1});
        new DeleteNode().deleteNode(head);
        assertArrayEquals(new int[]{1}, ListNode.toArray(head));
    }

    @Test
    void testCase5() {
        ListNode head = ListNode.create(new int[]{-3, 5, -99});
        new DeleteNode().deleteNode(head);
        assertArrayEquals(new int[]{5, -99}, ListNode.toArray(head));
    }
}
