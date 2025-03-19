import java.util.Scanner;

public class B_Repartiendo_para_cuatro {
    static Scanner in = new Scanner(System.in);

    public static void casoPrueba(String t) {
        
        String[] numeros = t.split(" ");
        int result = Integer.parseInt(numeros[0]);
        for (int i = 1; i<numeros.length; i++) {
            int num = Integer.parseInt(numeros[i]);
            if (num != 0) result *= num;
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        String t;
        while (!(t = in.nextLine()).equals("0")) casoPrueba(t);
    }
}