import java.util.*;

public class missingNumber {
    
    static Scanner in;

    public static void main(String[] args) {
        
        in = new java.util.Scanner(System.in);

        int num = in.nextInt();

        int numsInput[] = new int [num-1];
        for (int i = 0; i<numsInput.length; i++) {
            numsInput[i] = in.nextInt();
        }

        boolean found;
        for (int i = 1; i<=num; i++) {
            found = false;
            for (int j = 0; j<numsInput.length; j++) {
                if (i==numsInput[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(i);
                return;
            }
        } 
    }
}
