package bitmanipulation;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TotalHammingDistanceTest {

    @Test
    public void testCase1() {
        assertThat(new TotalHammingDistance().totalHammingDistance(new int[]{4, 14, 2})).isEqualTo(6);
    }

    @Test
    public void testCase2() {
        assertThat(new TotalHammingDistance().totalHammingDistance(new int[]{4, 14, 4})).isEqualTo(4);
    }
}
