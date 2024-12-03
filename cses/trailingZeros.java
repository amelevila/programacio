import java.util.*;

public class trailingZeros {

    static Scanner in;

    public static void main(String[] args) {
        
        in = new java.util.Scanner(System.in);

        int n = in.nextInt();
        
        long factorial = 1;
        for (int i = 1; i<=n; i++) {
            factorial *= i;
        }

        System.out.println(factorial);

        int count = 0;
        while (factorial%10==0) {
            count++;
            factorial /= 10;
        }

        System.out.println(count);

    }
}