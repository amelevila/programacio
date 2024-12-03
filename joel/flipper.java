import java.util.*;

public class flipper {

    static Scanner in;

    public static void main(String[] args) {
        
        in = new java.util.Scanner(System.in);

        String n = in.nextLine();
        
        int[] posicio = {1, 2, 3, 4};

        int temp;
        for (int i = 0; i<n.length(); i++) {
            if (n.charAt(i) == 'H') {
                temp = posicio[0];
                posicio[0] = posicio[2];
                posicio[2] = temp;
                temp = posicio[1];
                posicio[1] = posicio[3];
                posicio[3] = temp;
            }
            
            if (n.charAt(i) == 'V') {
                temp = posicio[0];
                posicio[0] = posicio[1];
                posicio[1] = temp;
                temp = posicio[2];
                posicio[2] = posicio[3];
                posicio[3] = temp;
            }
        }

        System.out.println(
            posicio[0] + " " + posicio[1] + "\n" + 
            posicio[2] + " " + posicio[3]
        );

    }
}