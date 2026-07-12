package popular;

import org.junit.jupiter.api.Test;
import utils.ListNode;
import static org.assertj.core.api.Assertions.assertThat;


public class RemoveDuplicatesTest {

    @Test
    public void testCase1() {
        ListNode input = ListNode.create(new int[]{1, 1, 2});
        ListNode result = new RemoveDuplicates().deleteDuplicates(input);
        assertThat(ListNode.toArray(result)).containsExactly(new int[]{1, 2});
    }

    @Test
    public void testCase2() {
        ListNode input = ListNode.create(new int[]{1, 1, 2, 3, 3});
        ListNode result = new RemoveDuplicates().deleteDuplicates(input);
        assertThat(ListNode.toArray(result)).containsExactly(new int[]{1, 2, 3});
    }
}
