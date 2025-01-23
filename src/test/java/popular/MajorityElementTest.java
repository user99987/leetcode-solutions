package popular;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MajorityElementTest {

    @Test
    public void testCase1() {
        assertEquals(3, new MajorityElement().majorityElement(new int[]{3, 2, 3}));
    }

    @Test
    public void testCase2() {
        assertEquals(2, new MajorityElement().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
