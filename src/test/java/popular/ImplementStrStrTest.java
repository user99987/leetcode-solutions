package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ImplementStrStrTest {

    @Test
    public void shouldFindNeedleIndexWithinHaystack() {
        assertThat(new ImplementStrStr().strStr("hello", "ll")).isEqualTo(2);
    }

    @Test
    public void shouldReturnMinusOneWhenNeedleNotFound() {
        assertThat(new ImplementStrStr().strStr("aaaaa", "bba")).isEqualTo(-1);
    }

    @Test
    public void shouldReturnZeroForEmptyNeedleAndHaystack() {
        assertThat(new ImplementStrStr().strStr("", "")).isEqualTo(0);
    }
}
