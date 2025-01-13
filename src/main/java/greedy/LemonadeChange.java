package greedy;

/**
 * Easy
 * <p>
 * At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you and order one at a time (in the order specified by bills). Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill. You must provide the correct change to each customer so that the net transaction is that the customer pays $5.
 * <p>
 * Note that you do not have any change in hand at first.
 * <p>
 * Given an integer array bills where bills[i] is the bill the ith customer pays, return true if you can provide every customer with the correct change, or false otherwise.
 * <p>
 * Example 1:
 * <p>
 * Input: bills = [5,5,5,10,20]
 * <p>
 * Output: true
 * <p>
 * Explanation:
 * <p>
 * From the first 3 customers, we collect three $5 bills in order.
 * <p>
 * From the fourth customer, we collect a $10 bill and give back a $5.
 * <p>
 * From the fifth customer, we give a $10 bill and a $5 bill.
 * <p>
 * Since all customers got correct change, we output true.
 * <p>
 * Example 2:
 * <p>
 * Input: bills = [5,5,10,10,20]
 * <p>
 * Output: false
 * <p>
 * Explanation:
 * <p>
 * From the first two customers in order, we collect two $5 bills.
 * <p>
 * For the next two customers in order, we collect a $10 bill and give back a $5 bill.
 * <p>
 * For the last customer, we can not give the change of $15 back because we only have two $10 bills.
 * <p>
 * Since not every customer received the correct change, the answer is false.
 * <p>
 * Constraints:
 * <p>
 * 1 <= bills.length <= 105
 * bills[i] is either 5, 10, or 20.
 */
public class LemonadeChange {


    public static void main(String[] args) {
        System.out.println(new LemonadeChange().lemonadeChange(new int[]{5, 5, 10, 10, 20}));
    }

    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int b : bills) {
            if (b == 5) {
                five++;
            } else if (b == 10) {
                ten++;
                if (five > 0) {
                    five--;
                } else {
                    return false;
                }
            } else {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five > 2) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
