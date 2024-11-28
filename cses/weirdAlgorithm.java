import java.util.*;

public class weirdAlgorithm {

    static Scanner in;

    public static void main(String[] args) {
        
        in = new java.util.Scanner(System.in);

        long num = in.nextLong();
        System.out.print(num + " ");

        while (num!=1) {
            if(num%2==0) num /= 2;
            else num = num * 3 + 1;
            System.out.print(num + " ");
        }
        System.out.println();
    }
}