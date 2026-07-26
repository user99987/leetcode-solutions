package popular;

import org.junit.jupiter.api.Test;
import utils.ListNode;
import static org.assertj.core.api.Assertions.assertThat;


public class SortListTest {

    @Test
    public void shouldSortUnorderedList() {
        ListNode input = ListNode.create(new int[]{4, 2, 1, 3});
        ListNode result = new SortList().sortList(input);
        assertThat(ListNode.toArray(result)).containsExactly(new int[]{1, 2, 3, 4});
    }

    @Test
    public void shouldSortListWithNegativeValues() {
        ListNode input = ListNode.create(new int[]{-1, 5, 3, 4, 0});
        ListNode result = new SortList().sortList(input);
        assertThat(ListNode.toArray(result)).containsExactly(new int[]{-1, 0, 3, 4, 5});
    }

    @Test
    public void shouldReturnEmptyListWhenInputIsEmpty() {
        ListNode input = ListNode.create(new int[]{});
        ListNode result = new SortList().sortList(input);
        assertThat(ListNode.toArray(result)).containsExactly(new int[]{});
    }
}
