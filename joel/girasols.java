import java.util.*;

public class girasols {

    static Scanner in;

    public static void main(String[] args) {
        
        in = new java.util.Scanner(System.in);

        int n = in.nextInt();
        
        int min = Integer.MAX_VALUE;
        int posI = -1;
        int posJ = -1;
        int[][] girasols = new int [n][n];
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                girasols[i][j] = in.nextInt();
                if (girasols[i][j] < min) {
                    min = girasols[i][j]; 
                    posI = i;
                    posJ = j;
                }
                
            }
        }

        int posicio;
        if (posI == 0 && posJ == 0) posicio = 1;
        else if (posI == 0 && posJ == n-1) posicio = 2;
        else if (posI == n-1 && posJ == 0) posicio = 3;
        else posicio = 4;
        //System.out.println(posicio);

        int[][] nouGirasols = new int [n][n];
        switch (posicio) {
            case 1:
                nouGirasols = girasols.clone();
                break;
            case 2:
                for (int i = 0; i<n; i++) {
                    for (int j = 0; j<n; j++) {
                        nouGirasols[i][j] = girasols[j][n-1-i];
                    }
                }
                break;
            case 3:
                for (int i = 0; i<n; i++) {
                    for (int j = 0; j<n; j++) {
                        nouGirasols[i][j] = girasols[n-1-j][i];
                    }
                }
                break;
            case 4:
                for (int i = 0; i<n; i++) {
                    for (int j = 0; j<n; j++) {
                        nouGirasols[i][j] = girasols[n-1-i][n-1-j];
                    }
                }
                break;
            default:
                break;
        }


        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                System.out.print(nouGirasols[i][j] + " ");
            }
            System.out.println();
        }

    }
}