package greedy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumLengthOfPairChainTest {

    @Test
    public void testCase1() {
        assertEquals(2, new MaximumLengthOfPairChain().findLongestChain(new int[][]{{1, 2}, {2, 3}, {3, 4}}));
    }

    @Test
    public void testCase2() {
        assertEquals(3, new MaximumLengthOfPairChain().findLongestChain(new int[][]{{1, 2}, {7, 8}, {4, 5}}));
    }
}
