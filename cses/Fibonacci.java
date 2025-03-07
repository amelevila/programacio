import java.util.*;

public class Fibonacci {
   static int[] fibs = new int[200];


   public static int fib(int n) {
      if (fibs[n] != 0 || n == 0) return fibs[n];

      fibs[n] = fib(n-1) + fib(n-2);
      return fibs[n];
   }

   public static int fibonacci(int n) {
      if (n==0 || n==1) return n;
      return fibonacci(n-1) + fibonacci(n-2);
    }    
   
   @SuppressWarnings("ConvertToTryWithResources")
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      fibs[1] = 1;
      int n = in.nextInt();
      System.out.println(fib(n));
      System.out.println(fibonacci(n));
      in.close();
   }
}