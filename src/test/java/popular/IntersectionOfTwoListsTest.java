package popular;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class IntersectionOfTwoListsTest {

    @Test
    public void testCase1() {
        ListNode common = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode listA = new ListNode(4, new ListNode(1, common));
        ListNode listB = new ListNode(5, new ListNode(6, new ListNode(1, common)));

        assertEquals(common, new IntersectionOfTwoLists().getIntersectionNode(listA, listB));
    }

    @Test
    public void testCase2() {
        ListNode common = new ListNode(2, new ListNode(4));
        ListNode listA = new ListNode(1, new ListNode(9, new ListNode(1, common)));
        ListNode listB = new ListNode(3, common);

        assertEquals(common, new IntersectionOfTwoLists().getIntersectionNode(listA, listB));
    }

    @Test
    public void testCase3() {
        ListNode listA = new ListNode(2, new ListNode(6, new ListNode(4)));
        ListNode listB = new ListNode(1, new ListNode(5));

        assertNull(new IntersectionOfTwoLists().getIntersectionNode(listA, listB));
    }
}

