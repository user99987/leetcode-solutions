package bitmanipulation;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HammingDistanceTest {

    @Test
    public void testCase1() {
        assertThat(new HammingDistance().hammingDistance(1, 4)).isEqualTo(2);
    }

    @Test
    public void testCase2() {
        assertThat(new HammingDistance().hammingDistance(3, 1)).isEqualTo(1);
    }
}
