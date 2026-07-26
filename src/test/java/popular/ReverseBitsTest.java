package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class ReverseBitsTest {

    @Test
    public void shouldReverseThirtyTwoBitBinaryRepresentation() {
        assertThat(new ReverseBits().reverseBits(0b00000010100101000001111010011100)).isEqualTo(964176192);
    }

}
