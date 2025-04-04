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

        int index = 1;
        int temps = 0;
        Stack<Integer> segons = new Stack<>();
        segons.add(plats[0][1]);

        while (true) { 
            while (plats[index][0] == temps) {
                segons.add(plats[index][1]);
                index++;
            }
            temps++;
            
            System.out.println(segons);
            segons.add(segons.pop()-1);
            System.out.println(segons);
        }


    }

    public static void main(String[] args) {
        int n;
        while ((n = in.nextInt()) != 0) casoPrueba(n);
    }
}