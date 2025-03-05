import java.io.*;

public class felicidades {
   static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
   public static void casoPrueba(int t) throws IOException {

      String felis = in.readLine();
      if (felis.equals("0")) {
         System.out.println(0);
         return;
      }
      String[] numsString = felis.split(" ");
      long[] nums = new long[numsString.length];

      for (int i = 0; i<nums.length; i++) {
         nums[i] = Long.parseLong(numsString[i]);
      }

      long ultim = nums[0];
      long result = 0;
      for (int i = 1; i<nums.length; i++) {
         if (nums[i] > (ultim+t) || nums[i] == 0) {
            result++;
            ultim = nums[i];
         }
      }
      System.out.println(result);

   } 
    
   public static void main(String[] args) throws IOException {
      String t;
      while (!((t = in.readLine()).isEmpty())) {
         casoPrueba(Integer.parseInt(t));
      }
   }
    
}