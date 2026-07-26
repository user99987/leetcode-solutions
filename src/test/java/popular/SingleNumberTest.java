package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class SingleNumberTest {

    @Test
    public void shouldFindSingleNumberAmongPairs() {
        assertThat(new SingleNumber().singleNumber(new int[]{2, 2, 1})).isEqualTo(1);
    }

    @Test
    public void shouldFindSingleNumberWithMultiplePairs() {
        assertThat(new SingleNumber().singleNumber(new int[]{4, 1, 2, 1, 2})).isEqualTo(4);
    }

    @Test
    public void shouldReturnOnlyElementWhenArrayHasOneValue() {
        assertThat(new SingleNumber().singleNumber(new int[]{1})).isEqualTo(1);
    }
}
