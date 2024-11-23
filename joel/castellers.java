import java.util.*;

public class castellers {

  static Scanner in;

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);
    
    int rondes = in.nextInt();

    int[] num = new int [8];
    int boomers = 0, milenial = 0, a = 0, b = 0;
    boolean resultE = false;

    for (int r = 0; r<rondes; r++) {
        for (int i = 0; i<8; i++) {
            num[i] = in.nextInt();
            if (i%2 != 0 && num[i]>num[i-1]) resultE = true;         
        }

        boomers += num[1] + num[5];
        milenial += num[3] + num[7];
        a += num[1] + num[3];
        b += num[5] + num[7];
    }

    String resultBM = (boomers>milenial) ? "BOOMERS":"MILENIALS";
    String resultAB = (a>b) ? "A":"B";

    /* 
    System.out.println(boomers);
    System.out.println(milenial);
    System.out.println(a);
    System.out.println(b);
    */

    if (resultE) System.out.println("ERROR");
    else {
      System.out.println(resultAB);
      System.out.println(resultBM);
    }

  }

}