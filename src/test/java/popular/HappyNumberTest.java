package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HappyNumberTest {

    @Test
    public void testCase1() {
        assertThat(new HappyNumber().isHappy(19)).isTrue();
    }

    @Test
    public void testCase2() {
        assertThat(new HappyNumber().isHappy(2)).isFalse();
    }
}
