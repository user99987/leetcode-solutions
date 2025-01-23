package popular;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortListTest {

    @Test
    public void testCase1() {
        ListNode input = ListNode.createList(new int[]{4, 2, 1, 3});
        ListNode result = new SortList().sortList(input);
        assertArrayEquals(new int[]{1, 2, 3, 4}, ListNode.toArray(result));
    }

    @Test
    public void testCase2() {
        ListNode input = ListNode.createList(new int[]{-1, 5, 3, 4, 0});
        ListNode result = new SortList().sortList(input);
        assertArrayEquals(new int[]{-1, 0, 3, 4, 5}, ListNode.toArray(result));
    }

    @Test
    public void testCase3() {
        ListNode input = ListNode.createList(new int[]{});
        ListNode result = new SortList().sortList(input);
        assertArrayEquals(new int[]{}, ListNode.toArray(result));
    }
}
