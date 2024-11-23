import java.util.*;

public class serpmates {
    
    static Scanner in;

    public static void main(String[] args) {
        
        in = new java.util.Scanner(System.in);

        int intro = in.nextInt();
        int num = 0;
        int numInv = 0;
        for (int i = 0; i<intro; i++) {
            for (int j = 0; j<intro; j++) {
                num += 2;
                numInv -= 2;
                if (i%2==0) System.out.print(num + " ");
                else System.out.print(numInv + " ");
            }
            numInv = num + (intro*2) + 2;
            System.out.println();

        }
    }
}
