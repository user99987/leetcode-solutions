package linkedlist;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

public class SwapNodesInPairsTest {

    @Test
    public void shouldSwapPairsOfEvenLengthList() {
        var head = ListNode.create(new int[]{1, 2, 3, 4});
        var result = new SwapNodesInPairs().swapPairs(head);
        assertThat(ListNode.toArray(result)).containsExactly(2, 1, 4, 3);
    }

    @Test
    public void shouldReturnNullForEmptyList() {
        var result = new SwapNodesInPairs().swapPairs(null);
        assertThat(result).isNull();
    }

    @Test
    public void shouldReturnSameNodeForSingleElementList() {
        var head = ListNode.create(new int[]{1});
        var result = new SwapNodesInPairs().swapPairs(head);
        assertThat(ListNode.toArray(result)).containsExactly(1);
    }

    @Test
    public void shouldLeaveLastNodeUnchangedForOddNumberOfNodes() {
        var head = ListNode.create(new int[]{1, 2, 3, 4, 5});
        var result = new SwapNodesInPairs().swapPairs(head);
        assertThat(ListNode.toArray(result)).containsExactly(2, 1, 4, 3, 5);
    }

    @Test
    public void shouldSwapTwoNodesCorrectly() {
        var head = ListNode.create(new int[]{1, 2});
        var result = new SwapNodesInPairs().swapPairs(head);
        assertThat(ListNode.toArray(result)).containsExactly(2, 1);
    }

    @Test
    public void shouldSwapAllPairsForSixNodes() {
        var head = ListNode.create(new int[]{1, 2, 3, 4, 5, 6});
        var result = new SwapNodesInPairs().swapPairs(head);
        assertThat(ListNode.toArray(result)).containsExactly(2, 1, 4, 3, 6, 5);
    }
}
