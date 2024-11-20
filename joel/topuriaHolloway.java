import java.util.*;

public class topuriaHolloway {

    static Scanner in;
  
    public static void main(String[] args) {
  
        in = new java.util.Scanner(System.in);
  
        int round = 1;
        int time = 0;
        int scoreT = 0;
        int scoreH = 0;

        while (round<=5) {
            while (time<300) {

                char who = in.next().charAt(0);
                String move = in.next();

                if (move.equals("LK")) {
                    time += 50;
                    if (who == 'T') scoreT += 2;
                    if (who == 'H') scoreH += 2;
                }
                else if (move.equals("J")) {
                    time += 150;
                    if (who == 'T') scoreT += 5;
                    if (who == 'H') scoreH += 5;
                }
                else if (move.equals("G")) {
                    time += 200;
                    if (who == 'T') scoreT += 10;
                    if (who == 'H') scoreH += 10;
                }
                else if (move.equals("KO") && round >=3) {
                    if (who == 'T') System.out.println("Topuria WINS (KO)");
                    if (who == 'H') System.out.println("Holloway WINS (KO)");
                    return;
                }
                else {
                    time += 120;
                    if (who == 'T') scoreT += -1;
                    if (who == 'H') scoreH += -1;
                }
            }
            time = 0;
            round++;
        }
        if (scoreT>scoreH) System.out.println("Topuria WINS " + scoreT + " - " + scoreH);
        else if (scoreH>scoreT) System.out.println("Holloway WINS " + scoreH + " - " + scoreT);
        else System.out.println("DRAW " + scoreH + " - " + scoreT);
    }
}