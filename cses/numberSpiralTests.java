import java.util.Scanner;

public class numberSpiralTests {

    static Scanner in;

    public static void main(String[] args) {
        
        in = new java.util.Scanner(System.in);

        int t = in.nextInt();
        for (int r = 0; r<t; r++) {
            int xInput = in.nextInt();
            int yInput = in.nextInt();
    
            int n = (xInput>yInput) ? xInput:yInput;
            
            int[][] table =  new int [n][n];
            int x = 0, y = 0;
            for (int i = 1; i<=n*n; i++) {
                if (x+1 == xInput && y+1 == yInput) {
                    System.out.println(i);
                    break;
                }
                //System.out.println("i = " + i + " // x,y = " + x + "," + y);
                table[x][y] = i;
                /*
                for (int a = 0; a<n; a++) {
                    for (int j = 0; j<n; j++) {
                        if (table[a][j] < 10) System.out.print(0);
                        System.out.print(table[a][j] + " ");
                    }
                    System.out.println();
                }
                */
    
                if (i == 1) y++;
                else if (x == 0) {
                    if (table[x][y-1] != i-1) y++;
                    else x++;
                }
                else if (y == 0) {
                    if (table[x-1][y] != i-1) x++;
                    else y++;
                }
                else if (table[x-1][y] == i-1) {
                    if (table[x][y-1] == 0) y--;
                    else x++;
                }
                else if (table[x][y-1] == i-1) {
                    if (table[x-1][y] == 0) x--;
                    else y++;
                }
                else if (x!=n-1 && table[x+1][y] == i-1) x--;
                else if (table[x][y+1] == i-1) y--;
                
            }
    
            /*
            for (int i = 0; i<n; i++) {
                for (int j = 0; j<n; j++) {
                    if (table[i][j] < 10) System.out.print(0);
                    System.out.print(table[i][j] + " ");
                }
                
                System.out.println();
            }
            */

            if (yInput>=xInput) {
                if (yInput%2 != 0) System.out.println(yInput*yInput-xInput+1);
                else System.out.println(yInput*yInput-xInput+1-(yInput-xInput)*2);
            } 
            else {
                if (xInput%2 != 0) System.out.println(xInput*xInput-xInput*2+yInput+1);
                else System.out.println((xInput+1)*(xInput+1)-(xInput+1)*2-yInput+2);
            }
        }
    }
}