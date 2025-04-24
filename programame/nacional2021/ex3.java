import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex3 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void casoPrueba(String t) throws IOException {

        int i = 0;
        int v = 0;
        for (int j = 0; j<t.length(); j+=2) {
            if (t.charAt(j) == 'V') v++;
            else if (t.charAt(j) == 'I') i++;
        }
        if (i>v) System.out.println("INVIERNO");
        else if (v>i) System.out.println("VERANO");
        else System.out.println("EMPATE");


        
    }
    
    public static void main(String[] args) throws IOException {
        
        String t;
        while (!(t = in.readLine()).equals(".")) {
            casoPrueba(t);
        }
    }


}