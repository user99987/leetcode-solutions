package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PushDominoesTest {

    @Test
    void testCase1() {
        String dominoes = "RR.L";
        String expected = "RR.L";
        assertEquals(expected, new PushDominoes().pushDominoes(dominoes));
    }

    @Test
    void testCase2() {
        String dominoes = ".L.R...LR..L..";
        String expected = "LL.RR.LLRRLL..";
        assertEquals(expected, new PushDominoes().pushDominoes(dominoes));
    }

    @Test
    void testCase3() {
        String dominoes = "R...L";
        String expected = "RR.LL";
        assertEquals(expected, new PushDominoes().pushDominoes(dominoes));
    }
}
