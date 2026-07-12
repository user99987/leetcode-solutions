package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class JumpGameTest {

    @Test
    public void testCase1() {
        assertThat(new JumpGame().canJump(new int[]{2, 3, 1, 1, 4})).isTrue();
    }

    @Test
    public void testCase2() {
        assertThat(new JumpGame().canJump(new int[]{3, 2, 1, 0, 4})).isFalse();
    }
}
