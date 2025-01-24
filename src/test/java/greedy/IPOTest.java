package greedy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IPOTest {

    @Test
    public void testCase1() {
        assertEquals(4, new IPO().findMaximizedCapital(2, 0, new int[]{1, 2, 3}, new int[]{0, 1, 1}));
    }

    @Test
    public void testCase2() {
        assertEquals(6, new IPO().findMaximizedCapital(3, 0, new int[]{1, 2, 3}, new int[]{0, 1, 2}));
    }
}
