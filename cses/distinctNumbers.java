import java.io.*;
import java.util.HashSet;

public class distinctNumbers {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
    public static void main(String[] args) throws IOException {
        in.readLine();
        String[] input = (in.readLine()).split(" ");
        HashSet<Integer> nums = new HashSet<>();

        for (String tmp: input) nums.add(Integer.valueOf(tmp));

        System.out.println(nums.size());
    }
    
}