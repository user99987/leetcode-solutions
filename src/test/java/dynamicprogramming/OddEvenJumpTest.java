package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OddEvenJumpTest {

    @Test
    public void testCase1() {
        assertThat(new OddEvenJump().oddEvenJumps(new int[]{10, 13, 12, 14, 15})).isEqualTo(2);
    }

    @Test
    public void testCase2() {
        assertThat(new OddEvenJump().oddEvenJumps(new int[]{2, 3, 1, 1, 4})).isEqualTo(3);
    }

    @Test
    public void testCase3() {
        assertThat(new OddEvenJump().oddEvenJumps(new int[]{5, 1, 3, 4, 2})).isEqualTo(3);
    }

    @Test
    public void testCase4() {
        assertThat(new OddEvenJump().oddEvenJumps(new int[]{1})).isEqualTo(1);
    }

}
