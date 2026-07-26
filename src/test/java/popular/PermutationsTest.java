package popular;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


public class PermutationsTest {

    @Test
    public void shouldGenerateAllPermutationsForThreeElements() {
        List<List<Integer>> result = new Permutations().permute(new int[]{1, 2, 3});
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3, 2),
                Arrays.asList(2, 1, 3),
                Arrays.asList(2, 3, 1),
                Arrays.asList(3, 1, 2),
                Arrays.asList(3, 2, 1)
        );
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldGenerateAllPermutationsForTwoElements() {
        List<List<Integer>> result = new Permutations().permute(new int[]{0, 1});
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 0)
        );
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSinglePermutationForSingleElement() {
        List<List<Integer>> result = new Permutations().permute(new int[]{1});
        List<List<Integer>> expected = List.of(
                List.of(1)
        );
        assertThat(result).isEqualTo(expected);
    }
}
