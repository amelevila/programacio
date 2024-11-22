import java.util.*;

public class castellers {

  static Scanner in;

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);
    
    int rondes = in.nextInt();

    int[] num = new int [8];
    int boomers, milenial, a, b;

    for (int r = 0; r<rondes; r++) {
        for (int i = 0; i<8; i++) {
            num[i] = in.nextInt();          
        }

        boomers = num[1] - num[0] + num[4] - num[5];
        milenial = num[2] - num[3] + num[6] - num[7];
        a = num[1] - num[0] + num[4] - num[5];
        b = num[1] - num[0] + num[4] - num[5];
    }

  }

}