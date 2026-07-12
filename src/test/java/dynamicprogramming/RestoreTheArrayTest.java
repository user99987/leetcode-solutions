package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RestoreTheArrayTest {

    @Test
    public void testCase1() {
        assertThat(new RestoreTheArray().numberOfArrays("1000", 10000)).isEqualTo(1);
    }

    @Test
    public void testCase2() {
        assertThat(new RestoreTheArray().numberOfArrays("1000", 10)).isEqualTo(0);
    }

    @Test
    public void testCase3() {
        assertThat(new RestoreTheArray().numberOfArrays("1317", 2000)).isEqualTo(8);
    }

    @Test
    public void testCase4() {
        assertThat(new RestoreTheArray().numberOfArrays("1", 1)).isEqualTo(1);
    }

    @Test
    public void testCase5() {
        assertThat(new RestoreTheArray().numberOfArrays("123", 12)).isEqualTo(2);
    }

    @Test
    public void testCase6() {
        assertThat(new RestoreTheArray().numberOfArrays("000", 1000)).isEqualTo(0);
    }
}
