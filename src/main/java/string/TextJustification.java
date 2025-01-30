package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Hard
 * <p>
 * Given an array of strings words and a width maxWidth, format the text such that each line has exactly maxWidth characters and is fully (left and right) justified.
 * <p>
 * You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly maxWidth characters.
 * <p>
 * Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line does not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.
 * <p>
 * For the last line of text, it should be left-justified and no extra space is inserted between words.
 * <p>
 * Note:
 * <p>
 * A word is defined as a character sequence consisting of non-space characters only.
 * Each word's length is guaranteed to be greater than 0 and not exceed maxWidth.
 * The input array words contains at least one word.
 * Example 1:
 * <p>
 * Input: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
 * <p>
 * Output: [ "This is an", "example of text", "justification. " ]
 * <p>
 * Example 2:
 * <p>
 * Input: words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
 * <p>
 * Output: [ "What must be", "acknowledgment ", "shall be " ]
 * <p>
 * Explanation: Note that the last line is "shall be " instead of "shall be", because the last line must be left-justified instead of fully-justified. Note that the second line is also left-justified becase it contains only one word.
 * <p>
 * Example 3:
 * <p>
 * Input: words = ["Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"], maxWidth = 20
 * <p>
 * Output: [ "Science is what we", "understand well", "enough to explain to", "a computer. Art is", "everything else we", "do " ]
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 300
 * 1 <= words[i].length <= 20
 * words[i] consists of only English letters and symbols.
 * 1 <= maxWidth <= 100
 * words[i].length <= maxwidth
 */
public class TextJustification {

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;

        while (index < words.length) {
            int count = words[index].length();
            int last = index + 1;

            while (last < words.length && count + words[last].length() + (last - index) <= maxWidth) {
                count += words[last].length();
                last++;
            }

            int spaces = last - index - 1;
            StringBuilder sb = new StringBuilder(maxWidth);

            if (last == words.length || spaces == 0) {
                sb.append(Arrays.stream(words, index, last)
                        .collect(Collectors.joining(" ")));
                while (sb.length() < maxWidth) {
                    sb.append(' ');
                }
            } else {
                int spaceSize = (maxWidth - count) / spaces;
                int extraSpaces = (maxWidth - count) % spaces;

                int finalIndex = index;
                IntStream.range(index, last - 1).forEach(i -> sb.append(words[i]).append(" ".repeat(spaceSize + (i - finalIndex < extraSpaces ? 1 : 0))));
                sb.append(words[last - 1]);
            }
            result.add(sb.toString());
            index = last;
        }
        return result;
    }
}
