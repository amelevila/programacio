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
        int instancia = 0;
        Stack<Integer> segons = new Stack<>();
        segons.add(plats[0][1]);
        while (segons.size()!=0) { 
            while (index<n && plats[index][0] == instancia) {
                segons.add(plats[index][1]);
                index++;
            }
            instancia++;
            segons.add(segons.pop()-1);
            if (segons.peek() == 0) {
                System.out.print(segons.size() + " ");
                segons.pop();
            }
        }
        System.out.println();


    }

    public static void main(String[] args) {
        int n;
        while ((n = in.nextInt()) != 0) casoPrueba(n);
    }
}