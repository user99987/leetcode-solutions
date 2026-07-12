package backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class CombinationsTest {

    @Test
    public void testCase1() {
        var result = new Combinations().combine(4, 2);
        List<List<Integer>> expected = List.of(
                List.of(1, 2), List.of(1, 3), List.of(1, 4),
                List.of(2, 3), List.of(2, 4), List.of(3, 4)
        );
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        var result = new Combinations().combine(1, 1);
        List<List<Integer>> expected = List.of(List.of(1));
        assertThat(result).isEqualTo(expected);
    }
}

