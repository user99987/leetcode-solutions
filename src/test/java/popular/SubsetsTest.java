package popular;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


public class SubsetsTest {

    @Test
    public void shouldGenerateAllSubsetsForThreeElements() {
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
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldGenerateSubsetsForSingleElement() {
        List<List<Integer>> result = new Subsets().subsets(new int[]{0});
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(0)
        );
        assertThat(result).isEqualTo(expected);
    }
}
