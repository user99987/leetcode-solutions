package linkedlist;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

public class DeleteNodeTest {

    @Test
    public void shouldDeleteSecondNode() {
        var head = ListNode.create(new int[]{4, 5, 1, 9});
        new DeleteNode().deleteNode(head.next);
        assertThat(ListNode.toArray(head)).containsExactly(4, 1, 9);
    }

    @Test
    public void shouldDeleteThirdNode() {
        var head = ListNode.create(new int[]{4, 5, 1, 9});
        new DeleteNode().deleteNode(head.next.next);
        assertThat(ListNode.toArray(head)).containsExactly(4, 5, 9);
    }

    @Test
    public void shouldLeaveSingleNodeWhenDeletingSecondOfTwoNodes() {
        var head = ListNode.create(new int[]{0, 1});
        new DeleteNode().deleteNode(head);
        assertThat(ListNode.toArray(head)).containsExactly(1);
    }

    @Test
    public void shouldHandleNegativeValuesCorrectly() {
        var head = ListNode.create(new int[]{-3, 5, -99});
        new DeleteNode().deleteNode(head);
        assertThat(ListNode.toArray(head)).containsExactly(5, -99);
    }

    @Test
    public void shouldUpdateTailCorrectlyWhenDeletingSecondToLastNode() {
        var head = ListNode.create(new int[]{1, 2, 3, 4});
        new DeleteNode().deleteNode(head.next.next);
        assertThat(ListNode.toArray(head)).containsExactly(1, 2, 4);
    }
}
