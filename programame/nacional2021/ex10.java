import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex10 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void casoPrueba(String[] input) throws IOException {

        //String[] pasatgers = in.readLine().split(" ");


    }
    
    public static void main(String[] args) throws IOException {
        
        while (!(in.readLine()).equals("0 0")) {
            casoPrueba(in.readLine().split(" "));
        }
    }


}