package linkedlist;

import org.junit.jupiter.api.Test;
import utils.ListNode;
import static org.assertj.core.api.Assertions.assertThat;

class SwapNodesInPairsTest {

    @Test
    void testCase1() {
        ListNode head = ListNode.create(new int[]{1, 2, 3, 4});
        ListNode expected = ListNode.create(new int[]{2, 1, 4, 3});
        var actual = new SwapNodesInPairs().swapPairs(head);
        assertThat(ListNode.toArray(actual)).containsExactly(ListNode.toArray(expected));
    }

    @Test
    void testCase2() {
        ListNode head = ListNode.create(new int[]{});
        assertThat(new SwapNodesInPairs().swapPairs(head)).isNull();
    }

    @Test
    void testCase3() {
        ListNode head = ListNode.create(new int[]{1});
        ListNode expected = ListNode.create(new int[]{1});
        var actual = new SwapNodesInPairs().swapPairs(head);
        assertThat(ListNode.toArray(actual)).containsExactly(ListNode.toArray(expected));
    }
}
