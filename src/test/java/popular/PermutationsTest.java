package popular;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermutationsTest {

    @Test
    public void testCase1() {
        List<List<Integer>> result = new Permutations().permute(new int[]{1, 2, 3});
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3, 2),
                Arrays.asList(2, 1, 3),
                Arrays.asList(2, 3, 1),
                Arrays.asList(3, 1, 2),
                Arrays.asList(3, 2, 1)
        );
        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        List<List<Integer>> result = new Permutations().permute(new int[]{0, 1});
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 0)
        );
        assertEquals(expected, result);
    }

    @Test
    public void testCase3() {
        List<List<Integer>> result = new Permutations().permute(new int[]{1});
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1)
        );
        assertEquals(expected, result);
    }
}
