package linkedlist;

import org.junit.jupiter.api.Test;
import utils.ListNode;
import static org.assertj.core.api.Assertions.assertThat;

class DeleteNodeTest {

    @Test
    void testCase1() {
        ListNode head = ListNode.create(new int[]{4, 5, 1, 9});
        new DeleteNode().deleteNode(head.next);
        assertThat(ListNode.toArray(head)).containsExactly(new int[]{4, 1, 9});
    }

    @Test
    void testCase2() {
        ListNode head = ListNode.create(new int[]{4, 5, 1, 9});
        new DeleteNode().deleteNode(head.next.next);
        assertThat(ListNode.toArray(head)).containsExactly(new int[]{4, 5, 9});
    }

    @Test
    void testCase3() {
        ListNode head = ListNode.create(new int[]{1, 2, 3, 4});
        ListNode nodeToDelete = head.next.next;
        new DeleteNode().deleteNode(nodeToDelete);
        assertThat(ListNode.toArray(head)).containsExactly(new int[]{1, 2, 4});
    }

    @Test
    void testCase4() {
        ListNode head = ListNode.create(new int[]{0, 1});
        new DeleteNode().deleteNode(head);
        assertThat(ListNode.toArray(head)).containsExactly(new int[]{1});
    }

    @Test
    void testCase5() {
        ListNode head = ListNode.create(new int[]{-3, 5, -99});
        new DeleteNode().deleteNode(head);
        assertThat(ListNode.toArray(head)).containsExactly(new int[]{5, -99});
    }
}
