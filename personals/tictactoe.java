import java.util.*;

public class tictactoe {
    static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);

        char[][] table = new char [3][3];
        int turn = 2;

        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                table[i][j] = '-';
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        
        int t=0;
        while (t<9){
            if (turn==2){
                System.out.println("p1 turn (O)");
                System.out.println("row? (1-3)");
                int row1 = in.nextInt();
                System.out.println("line? (1-3)");
                int line1 = in.nextInt();
                if (table[row1-1][line1-1] == '-'){
                table[row1-1][line1-1] = 'O';
                turn = 1;
                t++;
                }
                else {
                    System.out.println("Invalid position");
                }
            }
            
            else {
                System.out.println("p2 turn (X)");
                System.out.println("row? (1-3)");
                int row2 = in.nextInt();
                System.out.println("line? (1-3)");
                int column2 = in.nextInt();
                if (table[row2-1][column2-1] == '-'){
                    table[row2-1][column2-1] = 'X';
                    turn = 2;
                    t++;
                }

                else {
                    System.out.println("Invalid position");
                }
            }
    
            for (int i = 0; i<3; i++){
                for (int j = 0; j<3; j++){
                    System.out.print(table[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            
            for (int w = 0; w<3; w++){
                if (table[w][0] != '-' && table[w][0] == table[w][1] && table[w][0] == table[w][2]){
                    System.out.println("Player " + turn + " wins!");
                    System.out.println();
                    System.out.println();
                    t=9;
                }
            }
            for (int w = 0; w<3; w++){
                if (table[0][w] != '-' && table[0][w] == table[1][w] && table[0][w] == table[2][w]){
                    System.out.println();
                    System.out.println("Player " + turn + " wins!");
                    System.out.println();
                    t=9;
                }
            }
            if ((table[0][0] != '-' && table[0][0] == table[1][1] && table[0][0] == table[2][2]) || (table[0][2] != '-' && table[0][2] == table[1][1] && table[0][2] == table[2][0])){
                System.out.println("Player " + turn + " wins!");
                System.out.println();
                System.out.println();
                t=9;
            }
        } 
    }
}