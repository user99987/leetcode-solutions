package heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CandyTest {

    @Test
    public void testCase1() {
        var candy = new Candy();
        int[] ratings = {1, 0, 2};
        assertThat(candy.candy(ratings)).isEqualTo(5);
    }

    @Test
    public void testCase2() {
        var candy = new Candy();
        int[] ratings = {1, 2, 2};
        assertThat(candy.candy(ratings)).isEqualTo(4);
    }
}
