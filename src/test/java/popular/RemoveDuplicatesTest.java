package popular;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testCase1() {
        ListNode input = ListNode.createList(new int[]{1, 1, 2});
        ListNode result = new RemoveDuplicates().deleteDuplicates(input);
        assertArrayEquals(new int[]{1, 2}, ListNode.toArray(result));
    }

    @Test
    public void testCase2() {
        ListNode input = ListNode.createList(new int[]{1, 1, 2, 3, 3});
        ListNode result = new RemoveDuplicates().deleteDuplicates(input);
        assertArrayEquals(new int[]{1, 2, 3}, ListNode.toArray(result));
    }
}
