package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class SqrtXTest {

    @Test
    public void testCase1() {
        assertThat(new SqrtX().mySqrt(4)).isEqualTo(2);
    }

    @Test
    public void testCase2() {
        assertThat(new SqrtX().mySqrt(8)).isEqualTo(2);
    }

    @Test
    public void testCase3() {
        assertThat(new SqrtX().mySqrt(0)).isEqualTo(0);
    }

    @Test
    public void testCase4() {
        assertThat(new SqrtX().mySqrt(Integer.MAX_VALUE)).isEqualTo(46340);
    }
}
