import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            String handString = scan.nextLine();


//            for (String s : String handString ){
//                System.out.println(s);
//            }

            Hand currentHand =  hand(handString);

            for (Card c : currentHand) {
                c.toString();
            }


        }
    }

    class Hand  {
        ArrayList<Card> cards;
        int handValue;

        Hand(String handString) {

            List<String> inputCardStrings = Arrays.asList(handString.split("\\s*,\\s*"));
            // cards = new ArrayList<>();
            for (String c : inputCardStrings){
                cards.add(card(c));
            }

            t

        }


        public Hand hand(String handString) {



        }
    }

    class Card implements Comparable<Card>{

        private int suit,rank;

        private final String[] suits = {"c", "d", "h", "s"};
        private final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A" };

        Card (String str) {
            for (int i = 0; i < ranks.length; i++){
                if (str.substring(0).equalsIgnoreCase(ranks[i])) {
                    this.rank = i;
                }
            }

            for (int i = 0; i < suits.length; i++){
                if (str.substring(1).equalsIgnoreCase(suits[i])) {
                    this.suit = i;
                }
            }
        }

        @Override
        public String toString() {
            return ranks[rank - 1] + " of " + suits[suit  - 1];
        }



        @Override
        public int compareTo(Card that)
        {
            {
                if (this.rank < that.rank)
                    return 1;
                else if (this.rank > that.rank)
                    return -1;
            }
            return 0; //if cards are equal
        }
    }
}