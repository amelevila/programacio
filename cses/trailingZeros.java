import java.math.BigInteger;
import java.util.*;

public class trailingZeros {

    static Scanner in;

    public static void main(String[] args) {
        
        in = new java.util.Scanner(System.in);

        int n = in.nextInt();

        int count = 0;
        for (int i = 5; i<=n; i*=5) {
            count += n/i;
        }
            
        System.out.println(count);

    }
}