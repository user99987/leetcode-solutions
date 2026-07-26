package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FruitIntoBasketsTest {

    @Test
    public void shouldCollectAllFruitsWithTwoTypes() {
        assertThat(new FruitIntoBaskets().totalFruit(new int[]{1, 2, 1})).isEqualTo(3);
    }

    @Test
    public void shouldSkipLeadingFruitWhenThirdTypeAppears() {
        assertThat(new FruitIntoBaskets().totalFruit(new int[]{0, 1, 2, 2})).isEqualTo(3);
    }

    @Test
    public void shouldFindBestWindowAmongMultipleFruitTypes() {
        assertThat(new FruitIntoBaskets().totalFruit(new int[]{1, 2, 3, 2, 2})).isEqualTo(4);
    }

    @Test
    public void shouldReturnOneForSingleTree() {
        assertThat(new FruitIntoBaskets().totalFruit(new int[]{5})).isEqualTo(1);
    }

    @Test
    public void shouldReturnFullLengthWhenAllSameFruitType() {
        assertThat(new FruitIntoBaskets().totalFruit(new int[]{3, 3, 3, 3})).isEqualTo(4);
    }

    @Test
    public void shouldReturnFullLengthForExactlyTwoFruitTypes() {
        assertThat(new FruitIntoBaskets().totalFruit(new int[]{1, 2, 1, 2, 1, 2})).isEqualTo(6);
    }

    @Test
    public void shouldIgnoreLeadingTreesWhenThirdFruitTypeAtStart() {
        // Best window is either the leading [3,3,3,1] or trailing [1,2,1,2], both length 4
        assertThat(new FruitIntoBaskets().totalFruit(new int[]{3, 3, 3, 1, 2, 1, 2})).isEqualTo(4);
    }
}
