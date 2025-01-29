
/*
 * To do list:
 * 
 * splitting mechanic
 */
import java.util.*;

public class blackjack {

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

                int bet = 1000;
                System.out.println("bet = " + bet);
                System.out.println();

                // dealears card
                int dealersUpcard = newCard();
                boolean dealersAce = dealersUpcard == 11;

                if (dealersAce) {
                        System.out.println("Dealers upcard: A");
                } else
                        System.out.println("Dealers upcard: " + dealersUpcard);

                // Starting card
                System.out.println();
                int turn = 1;
                int card = newCard();
                boolean ace = card == 11;
                int totalcards = card;

                showCard(card);

                // players choice
                while (totalcards < 21) {

                        turn++;
                        int prevCard = card;
                        card = newCard();
                        totalcards += card;
                        showCard(card);

                        // check ace
                        if (card == 11) {
                                ace = true;
                        }

                        // check lose
                        if (totalcards > 21) {
                                if (ace) {
                                        totalcards -= 10;
                                        ace = false;
                                } else {
                                        bet = -bet;
                                        System.out.println("Total: " + totalcards);
                                        System.out.println("You lose " + bet);
                                        return;
                                }
                        }

                        // check win
                        System.out.print("Total: " + totalcards);
                        if (totalcards == 21) {
                                if (turn == 2) {
                                        bet = bet * 2 + (bet / 2);
                                        System.out.println();
                                        System.out.println("Blackjack!");
                                        System.out.println("You win " + bet);
                                        return;
                                } else {
                                        System.out.println();
                                        break;
                                }
                        }

                        if (ace) {
                                System.out.println(" / " + (totalcards - 10));
                        } else
                                System.out.println();

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
                        System.out.println("Move?");
                        String move = in.nextLine();
                        move = move.toUpperCase();

                        answer = getAnswer(ace, card, prevCard, totalcards, dealersUpcard, softTotals, hardTotals);

                        checkAnswer(answer, move);

                        if (move.equals("Y")) {
                                totalcards /= 2;
                        }

                        if (move.equals("S"))
                                break;

                        if (move.equals("D")) {
                                bet *= 2;
                                System.out.println("Bet = " + bet);
                                break;
                        }
                        System.out.println();
                }

                System.out.println();
                int dealersTotalCards = dealersUpcard;

                // dealers turn
                while (dealersTotalCards < 17) {
                        int dealersNewCard = newCard();
                        dealersTotalCards += dealersNewCard;

                        dealersAce = dealersNewCard == 11;
                        if (dealersAce) {
                                System.out.println("Dealers new card: A");
                        } else
                                System.out.println("Dealers new card: " + dealersNewCard);

                        System.out.println("Dealers total: " + dealersTotalCards);

                        // check dealers lose
                        if (dealersTotalCards > 21) {
                                System.out.println("You win " + bet);
                                return;
                        }

                        System.out.println();
                }

                String winner = whoWins(totalcards, dealersTotalCards, bet);
                System.out.println(winner);

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
                        System.out.println("Card: A");
                } else
                        System.out.println("Card: " + card);
        }

        public static String whoWins(int totalcards, int dealersTotalCards, int bet) {
                if (totalcards > dealersTotalCards) {
                        return ("You win " + bet);
                } else if (dealersTotalCards > totalcards) {
                        return ("You lose " + bet);
                } else {
                        return "Push";
                }
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