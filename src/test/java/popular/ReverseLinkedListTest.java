package popular;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseLinkedListTest {

    @Test
    public void testCase1() {
        ListNode input = ListNode.create(new int[]{1, 2, 3, 4, 5});
        ListNode result = new ReverseLinkedList().reverseList(input);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ListNode.toArray(result));
    }

    @Test
    public void testCase2() {
        ListNode input = ListNode.create(new int[]{1, 2});
        ListNode result = new ReverseLinkedList().reverseList(input);
        assertArrayEquals(new int[]{2, 1}, ListNode.toArray(result));
    }

    @Test
    public void testCase3() {
        ListNode input = ListNode.create(new int[]{});
        ListNode result = new ReverseLinkedList().reverseList(input);
        assertArrayEquals(new int[]{}, ListNode.toArray(result));
    }
}
