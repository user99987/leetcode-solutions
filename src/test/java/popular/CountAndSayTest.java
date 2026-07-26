package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountAndSayTest {


    @Test
    void shouldReturnOneForFirstTerm() {
        assertThat(new CountAndSay().countAndSay(1)).isEqualTo("1");
    }

    @Test
    void shouldReturnFourthTermOfCountAndSaySequence() {
        assertThat(new CountAndSay().countAndSay(4)).isEqualTo("1211");
    }
}
