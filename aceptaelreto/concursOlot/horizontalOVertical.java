import java.io.*;

public class horizontalOVertical {
   static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
   public static void casoPrueba() throws IOException {

      String input = in.readLine();
      int[] nums = new int[4];
      int i = 0;
      for (String n : input.split(" ")) {
         nums[i] = Integer.parseInt(n);
         i++;
      }
      int vertical = calcularAzulejos(nums);
      
      int tmp = nums[2];
      nums[2] = nums[3];
      nums[3] = tmp;
      
      int horizontal = calcularAzulejos(nums);
      

      //System.out.printf("vertical: %d / horizontal: %d\n", vertical, horizontal);

      System.out.println(Math.min(vertical, horizontal));


   } 

   public static int calcularAzulejos(int[] nums) {
      int num1 = nums[0]/nums[2];
      int num2 = nums[1]/nums[3];

      if (nums[0]%nums[2]!=0) num1++;
      if (nums[1]%nums[3]!=0) num2++;

      return num1*num2;
   }
    
   public static void main(String[] args) throws IOException {
      int t = Integer.parseInt(in.readLine());
      while (t-- > 0) casoPrueba();
   }
    
} 