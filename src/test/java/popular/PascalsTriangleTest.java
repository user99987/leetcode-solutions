package popular;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PascalsTriangleTest {

    @Test
    public void testCase1() {
        List<List<Integer>> result = new PascalsTriangle().generate(5);
        List<List<Integer>> expected = Arrays.asList(
                List.of(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1),
                Arrays.asList(1, 4, 6, 4, 1)
        );
        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        List<List<Integer>> result = new PascalsTriangle().generate(1);
        List<List<Integer>> expected = List.of(
                List.of(1)
        );
        assertEquals(expected, result);
    }
}
