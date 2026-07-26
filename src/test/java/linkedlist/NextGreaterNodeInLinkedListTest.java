package linkedlist;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

public class NextGreaterNodeInLinkedListTest {

    @Test
    public void shouldFindNextGreaterForSimpleList() {
        var head = ListNode.create(new int[]{2, 1, 5});
        assertThat(new NextGreaterNodeInLinkedList().nextLargerNodes(head)).containsExactly(5, 5, 0);
    }

    @Test
    public void shouldFindNextGreaterForMixedList() {
        var head = ListNode.create(new int[]{2, 7, 4, 3, 5});
        assertThat(new NextGreaterNodeInLinkedList().nextLargerNodes(head)).containsExactly(7, 0, 5, 5, 0);
    }

    @Test
    public void shouldReturnZeroForSingleNode() {
        var head = ListNode.create(new int[]{5});
        assertThat(new NextGreaterNodeInLinkedList().nextLargerNodes(head)).containsExactly(0);
    }

    @Test
    public void shouldReturnAllZerosForDecreasingValues() {
        var head = ListNode.create(new int[]{5, 4, 3, 2, 1});
        assertThat(new NextGreaterNodeInLinkedList().nextLargerNodes(head)).containsExactly(0, 0, 0, 0, 0);
    }

    @Test
    public void shouldFindNextGreaterForIncreasingValues() {
        var head = ListNode.create(new int[]{1, 2, 3, 4});
        assertThat(new NextGreaterNodeInLinkedList().nextLargerNodes(head)).containsExactly(2, 3, 4, 0);
    }

    @Test
    public void shouldReturnAllZerosForEqualValues() {
        var head = ListNode.create(new int[]{3, 3, 3});
        assertThat(new NextGreaterNodeInLinkedList().nextLargerNodes(head)).containsExactly(0, 0, 0);
    }
}
