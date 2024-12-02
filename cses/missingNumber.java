import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class missingNumber {

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        String input = reader.readLine();
        String[] nums = input.split(" ");

        boolean[] found = new boolean[num + 1];   
        for (String strNum : nums) {
            int value = Integer.parseInt(strNum);
            found[value] = true;
        }

        for (int i = 1; i<=num; i++) {
            if (!found[i]) {
                System.out.println(i);
                return;
            }
        } 
    }
}
