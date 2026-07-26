package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class JumpGameTest {

    @Test
    public void shouldReachLastIndexWhenPossible() {
        assertThat(new JumpGame().canJump(new int[]{2, 3, 1, 1, 4})).isTrue();
    }

    @Test
    public void shouldNotReachLastIndexWhenBlockedByZero() {
        assertThat(new JumpGame().canJump(new int[]{3, 2, 1, 0, 4})).isFalse();
    }
}
