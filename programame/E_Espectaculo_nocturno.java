import java.util.Scanner;

public class E_Espectaculo_nocturno {
    static Scanner in = new Scanner(System.in);

    public static void casoPrueba(int n, int m, int p) {
        
        boolean[][] taula = new boolean[n][m];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++) {
                taula[i][j] = false;
            }
        }

        int[] pos = new int[4];
        for (int l = 0; l<p; l++) {
            for (int i = 0; i<4; i++){
                pos[i] = in.nextInt();
            }
            for (int i = pos[0]; i<pos[0]+pos[2]; i++) {
                for (int j = pos[1]; j<pos[1]+pos[3]; j++) {
                    if (j==m) break;
                    taula[i][j] = true;
                }
                if (i==n-1) break;
            }
        }

        int count = 0;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++) {
                if (!taula[i][j]) count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        while (true) {
            int n = in.nextInt();
            int m = in.nextInt();
            int p = in.nextInt();
            if (n==0 && m==0 && p==0) return;
            casoPrueba(n, m, p);
        }
    }
}