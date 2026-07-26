package popular;

import org.junit.jupiter.api.Test;
import utils.ListNode;
import static org.assertj.core.api.Assertions.assertThat;


public class MergeTwoSortedListTest {

    @Test
    public void shouldMergeTwoNonEmptySortedLists() {
        ListNode l1 = ListNode.create(new int[]{1, 2, 4});
        ListNode l2 = ListNode.create(new int[]{1, 3, 4});
        ListNode result = new MergeTwoSortedList().mergeTwoLists(l1, l2);
        assertThat(ListNode.toArray(result)).containsExactly(new int[]{1, 1, 2, 3, 4, 4});
    }

    @Test
    public void shouldReturnNullWhenBothListsAreNull() {
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode result = new MergeTwoSortedList().mergeTwoLists(l1, l2);
        assertThat(result).isNull();
    }

    @Test
    public void shouldReturnSecondListWhenFirstIsNull() {
        ListNode l1 = null;
        var l2 = new ListNode(0);
        ListNode result = new MergeTwoSortedList().mergeTwoLists(l1, l2);
        assertThat(ListNode.toArray(result)).containsExactly(new int[]{0});
    }
}
