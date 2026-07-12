package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.ListNode;


public class LinkedListCycleTest {

    @Test
    public void testCase1() {
        var node1 = new ListNode(3);
        var node2 = new ListNode(2);
        var node3 = new ListNode(0);
        var node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        assertThat(new LinkedListCycle().hasCycle(node1)).isTrue();
    }

    @Test
    public void testCase2() {
        var node1 = new ListNode(1);
        var node2 = new ListNode(2);
        node1.next = node2;
        node2.next = node1;

        assertThat(new LinkedListCycle().hasCycle(node1)).isTrue();
    }

    @Test
    public void testCase3() {
        assertThat(new LinkedListCycle().hasCycle(new ListNode(1))).isFalse();
    }
}
