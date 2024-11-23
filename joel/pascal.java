import java.util.*;

public class pascal {

    static Scanner in;

    public static void main(String[] args) {
         
        in = new java.util.Scanner(System.in);

        int num = in.nextInt();

        long[] oldLine = new long [0];
        long result = 0;

        for (int i = 0; i<=num; i++) {

            long[] line = new long[i];
            

            for (int j = 0; j<i; j++) {

                if (j==0 || j==i-1) {
                    line[j] = 1;
                    System.out.print(1 + " ");
                }
                else {
                    long sum = oldLine[j-1] + oldLine[j];
                    line[j] = sum;
                    System.out.print(sum + " ");
                }

            }
            oldLine = new long[i];
            result = 0;
            for (int j = 0; j<i; j++) {               
                oldLine[j] = line[j];
                result += line[j];
            }

            System.out.println();

        }

        System.out.println("Suma: " + result);

    }
}