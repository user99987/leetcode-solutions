package backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationSumIITest {

    @Test
    public void testCase1() {
        List<List<Integer>> result = new CombinationSumII().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        List<List<Integer>> expected = List.of(
                List.of(1, 1, 6), List.of(1, 2, 5), List.of(1, 7), List.of(2, 6)
        );
        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        List<List<Integer>> result = new CombinationSumII().combinationSum2(new int[]{2, 5, 2, 1, 2}, 5);
        List<List<Integer>> expected = List.of(
                List.of(1, 2, 2), List.of(5)
        );
        assertEquals(expected, result);
    }
}
