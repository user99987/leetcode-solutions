package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LemonadeChangeTest {

    @Test
    public void testCase1() {
        assertThat(new LemonadeChange().lemonadeChange(new int[]{5, 5, 5, 10, 20})).isTrue();
    }

    @Test
    public void testCase2() {
        assertThat(new LemonadeChange().lemonadeChange(new int[]{5, 5, 10, 10, 20})).isFalse();
    }
}
