package backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class CombinationSumTest {

    @Test
    public void shouldFindCombinationsReusingElementsForSimpleTarget() {
        var result = new CombinationSum().combinationSum(new int[]{2, 3, 6, 7}, 7);
        List<List<Integer>> expected = List.of(
                List.of(2, 2, 3), List.of(7)
        );
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldFindCombinationsReusingElementsForLargerTarget() {
        var result = new CombinationSum().combinationSum(new int[]{2, 3, 5}, 8);
        List<List<Integer>> expected = List.of(
                List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5)
        );
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyListWhenNoCombinationReachesTarget() {
        assertThat(new CombinationSum().combinationSum(new int[]{2}, 1)).isEmpty();
    }

    @Test
    public void shouldReuseSingleCandidateMultipleTimes() {
        var result = new CombinationSum().combinationSum(new int[]{1}, 2);
        assertThat(result).isEqualTo(List.of(List.of(1, 1)));
    }
}
