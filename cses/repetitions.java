import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class repetitions {

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();
        
        int count = 1;
        int max = 1;

        for (int i = 0; i<text.length()-1; i++) {
            if (text.charAt(i) == text.charAt(i+1)) count++;
            else count = 1;
            if (count>max) max = count;
        }

        System.out.println(max);

    }
}