package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseBitsTest {

    @Test
    public void testCase() {
        assertEquals(964176192, new ReverseBits().reverseBits(0b00000010100101000001111010011100));
    }

}
