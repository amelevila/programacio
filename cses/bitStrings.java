import java.math.BigInteger;
import java.util.*;

public class bitStrings {

    static Scanner in;

    public static void main(String[] args) {
        
        in = new java.util.Scanner(System.in);

        int n = in.nextInt();
        BigInteger base = BigInteger.valueOf(2);

        BigInteger mod = BigInteger.valueOf(1000000007);

        BigInteger result = base.modPow(BigInteger.valueOf(n), mod);

        System.out.println(result);

    }
}