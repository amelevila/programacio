import java.util.*;

public class artModernLent {

    static Scanner in;

    public static void main(String[] args) {
        
        in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();
        int k = in.nextInt();
        boolean[][] taula = new boolean [m][n];

        for (int t = 0; t<k; t++) {
            char elec = in.next().charAt(0);
            int num = in.nextInt();
            if (elec == 'R') {
                for (int i = 0; i<n; i++) {
                    taula[num-1][i] = !taula[num-1][i];
                }
            }
            else {
                for (int i = 0; i<m; i++) {
                    taula[i][num-1] = !taula[i][num-1];
                }
            }
        }
        
        int count = 0;
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                if (taula[i][j]) count++;
            }
        }

        System.out.println(count);

    }
}
