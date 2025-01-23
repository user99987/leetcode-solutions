package popular;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubsetsTest {

    @Test
    public void testCase1() {
        List<List<Integer>> result = new Subsets().subsets(new int[]{1, 2, 3});
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(1),
                List.of(2),
                List.of(1, 2),
                List.of(3),
                List.of(1, 3),
                List.of(2, 3),
                List.of(1, 2, 3)
        );
        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        List<List<Integer>> result = new Subsets().subsets(new int[]{0});
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(0)
        );
        assertEquals(expected, result);
    }
}
