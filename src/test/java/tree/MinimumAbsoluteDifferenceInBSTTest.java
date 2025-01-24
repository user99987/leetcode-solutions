package tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumAbsoluteDifferenceInBSTTest {

    @Test
    public void testCase1() {
        int actual = new MinimumAbsoluteDifferenceInBST().minAbsoluteDifference(
                List.of(4, 3, 2, 4),
                2
        );
        assertEquals(0, actual);
    }

    @Test
    public void testCase2() {
        int actual = new MinimumAbsoluteDifferenceInBST().minAbsoluteDifference(
                List.of(5, 3, 2, 10, 15),
                1
        );
        assertEquals(1, actual);
    }

    @Test
    public void testCase3() {
        int actual = new MinimumAbsoluteDifferenceInBST().minAbsoluteDifference(
                List.of(1, 2, 3, 4),
                3
        );
        assertEquals(3, actual);
    }
}
