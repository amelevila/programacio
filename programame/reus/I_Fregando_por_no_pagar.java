import java.util.Scanner;
import java.util.Stack;

public class I_Fregando_por_no_pagar {
    static Scanner in = new Scanner(System.in);

    public static void casoPrueba(int n) {
        
        int[][] plats = new int[n][2];
        for (int i = 0; i<n; i++) {
            plats[i][0] = in.nextInt();
            plats[i][1] = in.nextInt();            
        }

        int index = 0;
        int temps = 0;
        int actual = -1;
        Stack<Integer> segons = new Stack<>();
        String result = "";
        boolean ultim = false;

        segons.add(-1);
        while (!segons.isEmpty()) { 
            while (index < n && plats[index][0] == temps) {
                segons.add(plats[index][1]);
                if (index == n-1) {
                    ultim = true;
                }
                index++;
            }
            
            if (actual==0 || actual == -1) {
                if (segons.size() != 1) result += (segons.size()-1 + " ");
                actual = segons.pop();
                if (ultim) break;
            }

            temps++;
            actual--;
            
        }
        System.out.println(result.strip());


    }

    public static void main(String[] args) {
        int n;
        while ((n = in.nextInt()) != 0) casoPrueba(n);
    }
}