package linkedlist;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SplitLinkedListInPartsTest {

    @Test
    void testCase1() {
        ListNode head = ListNode.create(new int[]{1, 2, 3});
        int k = 5;
        int[][] expected = Arrays.stream(new ListNode[]{
                ListNode.create(new int[]{1}),
                ListNode.create(new int[]{2}),
                ListNode.create(new int[]{3}),
                null,
                null
        }).map(ListNode::toArray).toArray(int[][]::new);
        int[][] actual = Arrays.stream(new SplitLinkedListInParts().splitListToParts(head, k)).map(ListNode::toArray).toArray(int[][]::new);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testCase2() {
        ListNode head = ListNode.create(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        int k = 3;
        int[][] expected = Arrays.stream(new ListNode[]{
                ListNode.create(new int[]{1, 2, 3, 4}),
                ListNode.create(new int[]{5, 6, 7}),
                ListNode.create(new int[]{8, 9, 10})
        }).map(ListNode::toArray).toArray(int[][]::new);
        int[][] actual = Arrays.stream(new SplitLinkedListInParts().splitListToParts(head, k)).map(ListNode::toArray).toArray(int[][]::new);
        assertArrayEquals(expected, actual);
    }
}
