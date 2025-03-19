import java.util.*;

public class D_Cuerdas_en_un_piano {
    static Scanner in = new Scanner(System.in);

    public static void casoPrueba() {
        
        int num1 = in.nextInt() * 3;
        int num2 = in.nextInt() * 2;
        int num3 = in.nextInt();
        System.out.println(num1+num2+num3);

    }
    public static void main(String[] args) {
        int t = in.nextInt();
        while (t-- > 0) casoPrueba();
    }
}