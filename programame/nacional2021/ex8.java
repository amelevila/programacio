import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex8 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    public static void casoPrueba(String[] input) throws IOException {

        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int p = Integer.parseInt(input[2]);
        int k = Integer.parseInt(input[3]);
        
        if (n%2!=0) n++;

        int inc = 0;
        boolean[] muertos = new boolean[n];
        for (int i = 0; i<n/2; i++) {
            inc += k+1;
            if (inc>n) inc -= n;

            muertos[k] = true;
        }

        if (!muertos[s] && muertos[p]) System.out.println("No quiero irme, Sr. Stark!");
        else if (muertos[s] && muertos[p]) System.out.println("No quiero irme, Peter!");
        else System.out.println("No hay abrazo");
    }
    
    public static void main(String[] args) throws IOException {
        
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            casoPrueba(in.readLine().split(" "));
        }
    }


}