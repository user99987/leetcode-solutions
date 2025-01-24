package backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationSumTest {

    @Test
    public void testCase1() {
        List<List<Integer>> result = new CombinationSum().combinationSum(new int[]{2, 3, 6, 7}, 7);
        List<List<Integer>> expected = List.of(
                List.of(2, 2, 3), List.of(7)
        );
        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        List<List<Integer>> result = new CombinationSum().combinationSum(new int[]{2, 3, 5}, 8);
        List<List<Integer>> expected = List.of(
                List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5)
        );
        assertEquals(expected, result);
    }
}
