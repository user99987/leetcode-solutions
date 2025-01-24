package backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationsTest {

    @Test
    public void testCase1() {
        List<List<Integer>> result = new Combinations().combine(4, 2);
        List<List<Integer>> expected = List.of(
                List.of(1, 2), List.of(1, 3), List.of(1, 4),
                List.of(2, 3), List.of(2, 4), List.of(3, 4)
        );
        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        List<List<Integer>> result = new Combinations().combine(1, 1);
        List<List<Integer>> expected = List.of(List.of(1));
        assertEquals(expected, result);
    }
}

