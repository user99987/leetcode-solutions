package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.ListNode;


public class IntersectionOfTwoListsTest {

    @Test
    public void shouldFindIntersectionNodeWithDifferentLeadingLengths() {
        var common = new ListNode(8, new ListNode(4, new ListNode(5)));
        var listA = new ListNode(4, new ListNode(1, common));
        var listB = new ListNode(5, new ListNode(6, new ListNode(1, common)));

        assertThat(new IntersectionOfTwoLists().getIntersectionNode(listA, listB)).isEqualTo(common);
    }

    @Test
    public void shouldFindIntersectionNodeWithShortLeadingLengths() {
        var common = new ListNode(2, new ListNode(4));
        var listA = new ListNode(1, new ListNode(9, new ListNode(1, common)));
        var listB = new ListNode(3, common);

        assertThat(new IntersectionOfTwoLists().getIntersectionNode(listA, listB)).isEqualTo(common);
    }

    @Test
    public void shouldReturnNullWhenListsDoNotIntersect() {
        var listA = new ListNode(2, new ListNode(6, new ListNode(4)));
        var listB = new ListNode(1, new ListNode(5));

        assertThat(new IntersectionOfTwoLists().getIntersectionNode(listA, listB)).isNull();
    }
}

