import java.io.*;

public class increasingArray {

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        String input = reader.readLine();
        String[] numString = input.split(" ");
        long[] nums = new long [num];
        nums[0] = Integer.parseInt(numString[0]);

        long count = 0;
        for (int i = 1; i<nums.length; i++) {
            nums[i] = Integer.parseInt(numString[i]);
            if (nums[i-1]>nums[i]) {
                count += nums[i-1]-nums[i];
                nums[i] = nums[i-1];
            }
        }

        System.out.println(count);
    }
}