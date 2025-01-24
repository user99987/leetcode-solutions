package array;

import java.util.Arrays;

/**
 * Medium
 * <p>
 * You are given an integer array deck. There is a deck of cards where every card has a unique integer. The integer on the ith card is deck[i].
 * <p>
 * You can order the deck in any order you want. Initially, all the cards start face down (unrevealed) in one deck.
 * <p>
 * You will do the following steps repeatedly until all cards are revealed:
 * <p>
 * Take the top card of the deck, reveal it, and take it out of the deck.
 * If there are still cards in the deck then put the next top card of the deck at the bottom of the deck.
 * If there are still unrevealed cards, go back to step 1. Otherwise, stop.
 * Return an ordering of the deck that would reveal the cards in increasing order.
 * <p>
 * Note that the first entry in the answer is considered to be the top of the deck.
 * <p>
 * Example 1:
 * <p>
 * Input: deck = [17,13,11,2,3,5,7]
 * <p>
 * Output: [2,13,3,11,5,17,7]
 * <p>
 * Explanation:
 * <p>
 * We get the deck in the order [17,13,11,2,3,5,7] (this order does not matter), and reorder it.
 * <p>
 * After reordering, the deck starts as [2,13,3,11,5,17,7], where 2 is the top of the deck.
 * <p>
 * We reveal 2, and move 13 to the bottom. The deck is now [3,11,5,17,7,13].
 * <p>
 * We reveal 3, and move 11 to the bottom. The deck is now [5,17,7,13,11].
 * <p>
 * We reveal 5, and move 17 to the bottom. The deck is now [7,13,11,17].
 * <p>
 * We reveal 7, and move 13 to the bottom. The deck is now [11,17,13].
 * <p>
 * We reveal 11, and move 17 to the bottom. The deck is now [13,17].
 * <p>
 * We reveal 13, and move 17 to the bottom. The deck is now [17].
 * <p>
 * We reveal 17. Since all the cards revealed are in increasing order, the answer is correct.
 * <p>
 * Example 2:
 * <p>
 * Input: deck = [1,1000]
 * <p>
 * Output: [1,1000]
 * <p>
 * Constraints:
 * <p>
 * 1 <= deck.length <= 1000
 * 1 <= deck[i] <= 10^6
 * All the values of deck are unique.
 */
public class RevealCardsInIncreasingOrder {

    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        int[] result = new int[n * 2];
        int idx = result.length - 1;
        int lastIdx = result.length - 1;
        int i = n - 1;
        while (idx >= 0 && i >= 0) {
            if (i != (n - 1)) {
                result[idx--] = result[lastIdx--];
            }
            result[idx--] = deck[i--];
        }
        return Arrays.copyOfRange(result, idx + 1, lastIdx + 1);
    }
}
