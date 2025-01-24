package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StickersToSpellWordTest {

    @Test
    public void testCase1() {
        String[] stickers = {"with", "example", "science"};
        String target = "thehat";
        assertEquals(3, new StickersToSpellWord().minStickers(stickers, target));
    }

    @Test
    public void testCase2() {
        String[] stickers = {"notice", "possible"};
        String target = "basicbasic";
        assertEquals(-1, new StickersToSpellWord().minStickers(stickers, target));
    }

    @Test
    public void testCase3() {
        String[] stickers = {"these", "are", "random", "words"};
        String target = "randomwords";
        assertEquals(2, new StickersToSpellWord().minStickers(stickers, target));
    }

    @Test
    public void testCase4() {
        String[] stickers = {"a", "b", "c"};
        String target = "abcabc";
        assertEquals(6, new StickersToSpellWord().minStickers(stickers, target));
    }

    @Test
    public void testCase5() {
        String[] stickers = {"hello", "world"};
        String target = "helloworld";
        assertEquals(2, new StickersToSpellWord().minStickers(stickers, target));
    }

    @Test
    public void testCase6() {
        String[] stickers = {"apple", "pen"};
        String target = "applepen";
        assertEquals(2, new StickersToSpellWord().minStickers(stickers, target));
    }

}
