package popular;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AddTwoNumbersTest {

    @Test
    void testCase1() {
        ListNode node1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = new AddTwoNumbers().addTwoNumbers(node1, node2);

        assertThat(result).isNotNull();
        assertThat(result.val).isEqualTo(7);
        assertThat(result.next).isNotNull();
        assertThat(result.next.val).isEqualTo(0);
        assertThat(result.next.next).isNotNull();
        assertThat(result.next.next.val).isEqualTo(8);
    }

    @Test
    void testCase2() {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(0);
        ListNode result = new AddTwoNumbers().addTwoNumbers(node1, node2);

        assertThat(result).isNotNull();
        assertThat(result.val).isEqualTo(0);
        assertThat(result.next).isNull();
    }

    @Test
    void testCase3() {
        ListNode node1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode node2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode result = new AddTwoNumbers().addTwoNumbers(node1, node2);

        assertThat(result).isNotNull();
        assertThat(result.val).isEqualTo(8);
        assertThat(result.next).isNotNull();
        assertThat(result.next.val).isEqualTo(9);
        assertThat(result.next.next).isNotNull();
        assertThat(result.next.next.val).isEqualTo(9);
        assertThat(result.next.next.next).isNotNull();
        assertThat(result.next.next.next.val).isEqualTo(9);
        assertThat(result.next.next.next.next).isNotNull();
        assertThat(result.next.next.next.next.val).isEqualTo(0);
        assertThat(result.next.next.next.next.next).isNotNull();
        assertThat(result.next.next.next.next.next.val).isEqualTo(0);
        assertThat(result.next.next.next.next.next.next).isNotNull();
        assertThat(result.next.next.next.next.next.next.val).isEqualTo(0);
        assertThat(result.next.next.next.next.next.next.next).isNotNull();
        assertThat(result.next.next.next.next.next.next.next.val).isEqualTo(1);
    }
}
