package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class NextGreaterElementTest {

    @Test
    public void testCase1() {
        assertThat(new NextGreaterElement().nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})).containsExactly(new int[]{-1, 3, -1});
    }

    @Test
    public void testCase2() {
        assertThat(new NextGreaterElement().nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4})).containsExactly(new int[]{3, -1});
    }
}
