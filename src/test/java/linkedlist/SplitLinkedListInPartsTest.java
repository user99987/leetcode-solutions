package linkedlist;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

public class SplitLinkedListInPartsTest {

    @Test
    public void shouldSplitShortListIntoMorePartsThanNodes() {
        var head = ListNode.create(new int[]{1, 2, 3});
        var result = new SplitLinkedListInParts().splitListToParts(head, 5);
        assertThat(result).hasSize(5);
        assertThat(ListNode.toArray(result[0])).containsExactly(1);
        assertThat(ListNode.toArray(result[1])).containsExactly(2);
        assertThat(ListNode.toArray(result[2])).containsExactly(3);
        assertThat(result[3]).isNull();
        assertThat(result[4]).isNull();
    }

    @Test
    public void shouldSplitLongerListWithUnequalRemainder() {
        var head = ListNode.create(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        var result = new SplitLinkedListInParts().splitListToParts(head, 3);
        assertThat(ListNode.toArray(result[0])).containsExactly(1, 2, 3, 4);
        assertThat(ListNode.toArray(result[1])).containsExactly(5, 6, 7);
        assertThat(ListNode.toArray(result[2])).containsExactly(8, 9, 10);
    }

    @Test
    public void shouldReturnAllNullPartsForEmptyList() {
        var result = new SplitLinkedListInParts().splitListToParts(null, 3);
        assertThat(result).hasSize(3);
        assertThat(result).containsOnlyNulls();
    }

    @Test
    public void shouldReturnWholeListInSinglePartWhenKEqualsOne() {
        var head = ListNode.create(new int[]{1, 2, 3});
        var result = new SplitLinkedListInParts().splitListToParts(head, 1);
        assertThat(result).hasSize(1);
        assertThat(ListNode.toArray(result[0])).containsExactly(1, 2, 3);
    }

    @Test
    public void shouldSplitEvenlyDivisibleListIntoEqualParts() {
        var head = ListNode.create(new int[]{1, 2, 3, 4});
        var result = new SplitLinkedListInParts().splitListToParts(head, 2);
        assertThat(ListNode.toArray(result[0])).containsExactly(1, 2);
        assertThat(ListNode.toArray(result[1])).containsExactly(3, 4);
    }

    @Test
    public void shouldPutSingleNodeInFirstPartOnlyWhenSplitIntoManyParts() {
        var head = ListNode.create(new int[]{1});
        var result = new SplitLinkedListInParts().splitListToParts(head, 3);
        assertThat(ListNode.toArray(result[0])).containsExactly(1);
        assertThat(result[1]).isNull();
        assertThat(result[2]).isNull();
    }
}
