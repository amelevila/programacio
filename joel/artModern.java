import java.util.*;

public class artModern {

    static Scanner in;

    public static void main(String[] args) {
        
        in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();
        int k = in.nextInt();
        int[] rows = new int [m];
        int[] cols = new int [n];

        for (int t = 0; t<k; t++) {
            char elec = in.next().charAt(0);
            int num = in.nextInt();
            if (elec == 'R') {
                rows[num-1]++;
            }
            else {
                cols[num-1]++;
            }
        }
        
        int count = 0;
        //char[][] taula = new char [m][n];
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                if ((rows[i]+cols[j])%2 != 0) {
                    count++;
                    //taula[i][j] = 'D';
                }
                //else taula[i][j] = 'N';
                //System.out.print(taula[i][j]);
            }
            //System.out.println();
        }

        System.out.println(count);

    }
}
