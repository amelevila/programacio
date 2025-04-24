import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    @SuppressWarnings("ConvertToStringSwitch")
    public static void casoPrueba() throws IOException {

        String[] cartas = in.readLine().split(" ");
        int c = 0;
        int d = 0;
        int p = 0;
        int t = 0;
        int puntos = 0;
        for (String carta : cartas) {
            if (carta.equals("A")) puntos+=4;
            else if (carta.equals("K")) puntos+=3;
            else if (carta.equals("Q")) puntos+=2;
            else if (carta.equals("J")) puntos+=1;
            else if (carta.equals("C")) c++;
            else if (carta.equals("D")) d++;
            else if (carta.equals("P")) p++;
            else if (carta.equals("T")) t++;
        }
        if (c==0) puntos+=3;
        if (c==1) puntos+=2;
        if (c==2) puntos++;
        if (d==0) puntos+=3;
        if (d==1) puntos+=2;
        if (d==2) puntos++;
        if (p==0) puntos+=3;
        if (p==1) puntos+=2;
        if (p==2) puntos++;
        if (t==0) puntos+=3;
        if (t==1) puntos+=2;
        if (t==2) puntos++;
        System.out.println(puntos);
    }
    
    public static void main(String[] args) throws IOException {
        
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            casoPrueba();
        }
    }


}