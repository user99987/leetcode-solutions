package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StickersToSpellWordTest {

    @Test
    public void shouldFindMinimumStickersForSimpleTarget() {
        String[] stickers = {"with", "example", "science"};
        String target = "thehat";
        assertThat(new StickersToSpellWord().minStickers(stickers, target)).isEqualTo(3);
    }

    @Test
    public void shouldReturnMinusOneWhenTargetCannotBeSpelled() {
        String[] stickers = {"notice", "possible"};
        String target = "basicbasic";
        assertThat(new StickersToSpellWord().minStickers(stickers, target)).isEqualTo(-1);
    }

    @Test
    public void shouldFindMinimumStickersReusingSameSticker() {
        String[] stickers = {"these", "are", "random", "words"};
        String target = "randomwords";
        assertThat(new StickersToSpellWord().minStickers(stickers, target)).isEqualTo(2);
    }

    @Test
    public void shouldFindMinimumStickersForSingleLetterStickers() {
        String[] stickers = {"a", "b", "c"};
        String target = "abcabc";
        assertThat(new StickersToSpellWord().minStickers(stickers, target)).isEqualTo(6);
    }

    @Test
    public void shouldFindMinimumStickersForTwoWholeWordStickers() {
        String[] stickers = {"hello", "world"};
        String target = "helloworld";
        assertThat(new StickersToSpellWord().minStickers(stickers, target)).isEqualTo(2);
    }

    @Test
    public void shouldFindMinimumStickersForConcatenatedTarget() {
        String[] stickers = {"apple", "pen"};
        String target = "applepen";
        assertThat(new StickersToSpellWord().minStickers(stickers, target)).isEqualTo(2);
    }

}
