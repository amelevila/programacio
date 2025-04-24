import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex4 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void casoPrueba(int t) throws IOException {

        String[] dias = in.readLine().split(" ");

        int max = 1;
        int count = 1;
        int ant = Integer.parseInt(dias[0]);
        boolean[] flag = new boolean[dias.length];
        for (int i = 1; i<dias.length; i++) {
            if (flag[i]) continue;
            int dia = Integer.parseInt(dias[i]);
            if (dia>ant) {
                count++;
                ant = dia;
                if (count>max) max = count;
            }
            else {
                flag[i] = true;
                i=1;
                count = 1;
            }

        }
        System.out.println(max);

    }
    
    public static void main(String[] args) throws IOException {
        
        String t;
        while (!(t = in.readLine()).equals("0")) {
            casoPrueba(Integer.parseInt(t));
        }
    }


}