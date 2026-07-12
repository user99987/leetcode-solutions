package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StickersToSpellWordTest {

    @Test
    public void testCase1() {
        String[] stickers = {"with", "example", "science"};
        String target = "thehat";
        assertThat(new StickersToSpellWord().minStickers(stickers, target)).isEqualTo(3);
    }

    @Test
    public void testCase2() {
        String[] stickers = {"notice", "possible"};
        String target = "basicbasic";
        assertThat(new StickersToSpellWord().minStickers(stickers, target)).isEqualTo(-1);
    }

    @Test
    public void testCase3() {
        String[] stickers = {"these", "are", "random", "words"};
        String target = "randomwords";
        assertThat(new StickersToSpellWord().minStickers(stickers, target)).isEqualTo(2);
    }

    @Test
    public void testCase4() {
        String[] stickers = {"a", "b", "c"};
        String target = "abcabc";
        assertThat(new StickersToSpellWord().minStickers(stickers, target)).isEqualTo(6);
    }

    @Test
    public void testCase5() {
        String[] stickers = {"hello", "world"};
        String target = "helloworld";
        assertThat(new StickersToSpellWord().minStickers(stickers, target)).isEqualTo(2);
    }

    @Test
    public void testCase6() {
        String[] stickers = {"apple", "pen"};
        String target = "applepen";
        assertThat(new StickersToSpellWord().minStickers(stickers, target)).isEqualTo(2);
    }

}
