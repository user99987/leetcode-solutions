package popular;

import org.junit.jupiter.api.Test;
import utils.ListNode;
import static org.assertj.core.api.Assertions.assertThat;


public class MergeKSortedListsTest {

    @Test
    public void shouldMergeMultipleSortedLists() {
        ListNode[] lists = new ListNode[]{
                ListNode.create(new int[]{1, 4, 5}),
                ListNode.create(new int[]{1, 3, 4}),
                ListNode.create(new int[]{2, 6})
        };
        ListNode result = new MergeKSortedLists().mergeKLists(lists);
        assertThat(ListNode.toArray(result)).containsExactly(new int[]{1, 1, 2, 3, 4, 4, 5, 6});
    }

    @Test
    public void shouldReturnNullForEmptyListArray() {
        var lists = new ListNode[]{};
        ListNode result = new MergeKSortedLists().mergeKLists(lists);
        assertThat(result).isNull();
    }

    @Test
    public void shouldReturnSingleListUnchanged() {
        var lists = new ListNode[]{new ListNode()};
        ListNode result = new MergeKSortedLists().mergeKLists(lists);
        assertThat(result.next).isNull();
        assertThat(result.value).isEqualTo(0);
    }
}
