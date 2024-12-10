import java.math.BigInteger;
import java.util.*;

public class trailingZerosLent {

    static Scanner in;

    public static void main(String[] args) {
        
        in = new java.util.Scanner(System.in);

        int n = in.nextInt();
        
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i<=n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        //System.out.println(factorial);


        int count = 0;
        while (factorial.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            count++;
            factorial = factorial.divide(BigInteger.TEN);
        }
            

        System.out.println(count);

    }
}