package heap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CandyTest {

    @Test
    public void testCase1() {
        Candy candy = new Candy();
        int[] ratings = {1, 0, 2};
        assertEquals(5, candy.candy(ratings));
    }

    @Test
    public void testCase2() {
        Candy candy = new Candy();
        int[] ratings = {1, 2, 2};
        assertEquals(4, candy.candy(ratings));
    }
}
