import java.util.Scanner;

public class numberSpiral {

    static Scanner in;

    public static void main(String[] args) {
        
        in = new java.util.Scanner(System.in);

        int t = in.nextInt();
        StringBuilder result = new StringBuilder();

        for (int r = 0; r<t; r++) {
            long xInput = in.nextLong();
            long yInput = in.nextLong();

            if (yInput>=xInput) {
                long a = yInput*yInput-xInput+1;
                long b = yInput*yInput-xInput+1-(yInput-xInput)*2;
                if (yInput%2 != 0) result.append(a).append("\n");
                else result.append(b).append("\n");
            } 
            else {
                long a = xInput*xInput-xInput*2+yInput+1;
                long b = (xInput+1)*(xInput+1)-(xInput+1)*2-yInput+2;
                if (xInput%2 != 0) result.append(a).append("\n");
                else result.append(b).append("\n");
            }

            
    
        }
        System.out.println(result);
    }
}