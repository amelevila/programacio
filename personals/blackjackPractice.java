import java.util.*;

public class blackjackPractice {

   static Scanner in;

   public static void main(String[] args) {

      in = new Scanner(System.in);

      // start tables
      String[][] pairSplitting = {
            { "N", "N", "Y", "Y", "Y", "Y", "N", "N", "N", "N" },
            { "N", "N", "Y", "Y", "Y", "Y", "N", "N", "N", "N" },
            { "N", "N", "N", "N", "N", "N", "N", "N", "N", "N" },
            { "N", "N", "N", "N", "N", "N", "N", "N", "N", "N" },
            { "N", "Y", "Y", "Y", "Y", "N", "N", "N", "N", "N" },
            { "Y", "Y", "Y", "Y", "Y", "Y", "N", "N", "N", "N" },
            { "Y", "Y", "Y", "Y", "Y", "Y", "Y", "Y", "Y", "Y" },
            { "Y", "Y", "Y", "Y", "Y", "N", "Y", "Y", "N", "N" },
            { "N", "N", "N", "N", "N", "N", "N", "N", "N", "N" },
            { "Y", "Y", "Y", "Y", "Y", "Y", "Y", "Y", "Y", "Y" },

      };

      String[][] softTotals = {
            { "H", "H", "H", "H", "H", "H", "H", "H", "H", "H" },
            { "H", "H", "H", "D", "D", "H", "H", "H", "H", "H" },
            { "H", "H", "H", "D", "D", "H", "H", "H", "H", "H" },
            { "H", "H", "D", "D", "D", "H", "H", "H", "H", "H" },
            { "H", "H", "D", "D", "D", "H", "H", "H", "H", "H" },
            { "H", "D", "D", "D", "D", "H", "H", "H", "H", "H" },
            { "DS", "DS", "DS", "DS", "DS", "S", "S", "H", "H", "H" },
            { "S", "S", "S", "S", "DS", "S", "S", "S", "S", "S" },
            { "S", "S", "S", "S", "S", "S", "S", "S", "S", "S" }

      };
      String[][] hardTotals = {
            { "H", "H", "H", "H", "H", "H", "H", "H", "H", "H" },
            { "H", "H", "H", "H", "H", "H", "H", "H", "H", "H" },
            { "H", "H", "H", "H", "H", "H", "H", "H", "H", "H" },
            { "H", "H", "H", "H", "H", "H", "H", "H", "H", "H" },
            { "H", "H", "H", "H", "H", "H", "H", "H", "H", "H" },
            { "H", "H", "H", "H", "H", "H", "H", "H", "H", "H" },
            { "H", "D", "D", "D", "D", "H", "H", "H", "H", "H" },
            { "D", "D", "D", "D", "D", "D", "D", "D", "H", "H" },
            { "D", "D", "D", "D", "D", "D", "D", "D", "D", "D" },
            { "H", "H", "S", "S", "S", "H", "H", "H", "H", "H" },
            { "S", "S", "S", "S", "S", "H", "H", "H", "H", "H" },
            { "S", "S", "S", "S", "S", "H", "H", "H", "H", "H" },
            { "S", "S", "S", "S", "S", "H", "H", "H", "H", "H" },
            { "S", "S", "S", "S", "S", "H", "H", "H", "H", "H" },
            { "S", "S", "S", "S", "S", "S", "S", "S", "S", "S" },
            { "S", "S", "S", "S", "S", "S", "S", "S", "S", "S" },
            { "S", "S", "S", "S", "S", "S", "S", "S", "S", "S" },
            { "S", "S", "S", "S", "S", "S", "S", "S", "S", "S" }
      };

      while (true) {
         System.out.println();
         // dealears card
         int dealersUpcard = newCard();
         boolean dealersAce = dealersUpcard == 11;

         if (dealersAce) {
            System.out.println("Dealers upcard: A");
         } else
            System.out.println("Dealers upcard: " + dealersUpcard);

         // Starting card
         int card = newCard();
         boolean ace = card == 11;
         int totalcards = card;

         showCard(card);

         // second card
         int prevCard = card;
         card = newCard();
         totalcards += card;
         showCard(card);
         System.out.println();

         // check ace
         if (card == 11) {
            ace = true;
         }

         if (totalcards == 21) {
            System.out.println("Blackjack!");
            continue;
         }

         // check split
         boolean split = (card == prevCard && card == totalcards / 2);
         String answer;
         if (split) {
            System.out.println("Split? ");
            String splitString = in.nextLine();
            splitString = splitString.toUpperCase();
            answer = pairSplitting[card - 2][dealersUpcard - 2];
            checkAnswer(answer, splitString);
         }

         // get move
         String move = in.nextLine();
         move = move.toUpperCase();

         answer = getAnswer(ace, card, prevCard, totalcards, dealersUpcard, softTotals, hardTotals);
         checkAnswer(answer, move);
      }

   }

   public static int numToCard(int num) {
      if (num == 0)
         return 11;
      if (num >= 10)
         return 10;
      return num + 1;

   }

   public static int newCard() {
      Random random = new Random();
      int card = random.nextInt(13);
      card = numToCard(card);
      return card;
   }

   public static void checkAnswer(String answer, String move) {
      System.out.print("Answer: " + answer + " // ");
      if (move.equals(answer)) {
         System.out.println("Correct!");
      } else {
         System.out.println("Incorrect");
      }
   }

   public static void showCard(int card) {
      if (card == 1 || card == 11) {
         System.out.print("A ");
      } else
         System.out.print(card + " ");
   }

   public static String getAnswer(boolean ace, int card, int prevCard, int totalcards, int dealersUpcard,
         String[][] softTotals, String[][] hardTotals) {
      if (ace) {
         int nAce;
         if (card == 11 || card == 1)
            nAce = card;
         else
            nAce = prevCard;
         return softTotals[totalcards - nAce - 1][dealersUpcard - 2];
      }

      else {
         return hardTotals[totalcards - 3][dealersUpcard - 2];
      }
   }
}