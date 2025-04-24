import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex6 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void casoPrueba(String input) throws IOException {

        String[] numsString = input.split(" ");
        int[] nums = new int[numsString.length];
        for (int i = 0; i<nums.length; i++) {
            nums[i] = Integer.parseInt(numsString[i]);
        }

        boolean alarma = false;
        int count = 0;
        for (int num: nums) {
            if (num<=4 && !alarma) {
                alarma = true;
                count++;
            }
            else if (num>6) alarma = false;
        }

        System.out.println(count);


    }
    
    public static void main(String[] args) throws IOException {
        
        while (!(in.readLine()).equals("0")) {
            casoPrueba(in.readLine());
        }
    }


}