package backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class CombinationSumIITest {

    @Test
    public void shouldFindUniqueCombinationsAvoidingDuplicateNumberReuse() {
        var result = new CombinationSumII().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        List<List<Integer>> expected = List.of(
                List.of(1, 1, 6), List.of(1, 2, 5), List.of(1, 7), List.of(2, 6)
        );
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldDeduplicateCombinationsFromDuplicateCandidates() {
        var result = new CombinationSumII().combinationSum2(new int[]{2, 5, 2, 1, 2}, 5);
        List<List<Integer>> expected = List.of(
                List.of(1, 2, 2), List.of(5)
        );
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyListWhenNoCombinationReachesTarget() {
        assertThat(new CombinationSumII().combinationSum2(new int[]{5}, 1)).isEmpty();
    }
}
