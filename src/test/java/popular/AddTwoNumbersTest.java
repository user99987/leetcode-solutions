package popular;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

class AddTwoNumbersTest {

    @Test
    void testCase1() {
        var node1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        var node2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        var result = new AddTwoNumbers().addTwoNumbers(node1, node2);

        assertThat(result).isNotNull();
        assertThat(result.value).isEqualTo(7);
        assertThat(result.next).isNotNull();
        assertThat(result.next.value).isEqualTo(0);
        assertThat(result.next.next).isNotNull();
        assertThat(result.next.next.value).isEqualTo(8);
    }

    @Test
    void testCase2() {
        var node1 = new ListNode(0);
        var node2 = new ListNode(0);
        var result = new AddTwoNumbers().addTwoNumbers(node1, node2);

        assertThat(result).isNotNull();
        assertThat(result.value).isEqualTo(0);
        assertThat(result.next).isNull();
    }

    @Test
    void testCase3() {
        var node1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        var node2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        var result = new AddTwoNumbers().addTwoNumbers(node1, node2);

        assertThat(result).isNotNull();
        assertThat(result.value).isEqualTo(8);
        assertThat(result.next).isNotNull();
        assertThat(result.next.value).isEqualTo(9);
        assertThat(result.next.next).isNotNull();
        assertThat(result.next.next.value).isEqualTo(9);
        assertThat(result.next.next.next).isNotNull();
        assertThat(result.next.next.next.value).isEqualTo(9);
        assertThat(result.next.next.next.next).isNotNull();
        assertThat(result.next.next.next.next.value).isEqualTo(0);
        assertThat(result.next.next.next.next.next).isNotNull();
        assertThat(result.next.next.next.next.next.value).isEqualTo(0);
        assertThat(result.next.next.next.next.next.next).isNotNull();
        assertThat(result.next.next.next.next.next.next.value).isEqualTo(0);
        assertThat(result.next.next.next.next.next.next.next).isNotNull();
        assertThat(result.next.next.next.next.next.next.next.value).isEqualTo(1);
    }
}
