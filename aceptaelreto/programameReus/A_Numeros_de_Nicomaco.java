import java.util.Scanner;

public class A_Numeros_de_Nicomaco {
    static Scanner in = new Scanner(System.in);
    static long[] cubicos = new long[2155];

    public static void casoPrueba() {
        
        int num = in.nextInt();
        for (int i = 0; i<2155; i++) {
            if (cubicos[i]>=num) {
                System.out.println(cubicos[i]);
                return;
            }
        }

    }
    public static void main(String[] args) {
        cubicos[0] = 0;
        for (int i = 1; i<2155; i++) {
            cubicos[i] = i*i*i + cubicos[i-1];
        }
        int t = in.nextInt();
        while (t-- > 0) casoPrueba();
    }
}