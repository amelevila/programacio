import java.util.Scanner;

public class H_Subiendo_y_bajando_por_la_muralla {
    static Scanner in = new Scanner(System.in);

    public static void casoPrueba(int a) {
        
        int pos = 0;
        int min = 0;
        int max = 0;

        for (int i = 0; i<a; i++) {
            pos += in.nextInt();
            if (pos<min) min = pos;
            int n = pos-min;
            if (n>max) max = n;
        }

        System.out.println(max);

    }

    public static void main(String[] args) {
        while (true) { 
            int n = in.nextInt();
            if (n==0) return;
            casoPrueba(n);
        }
    }
}