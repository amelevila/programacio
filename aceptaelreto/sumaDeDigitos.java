import java.util.*;

public class sumaDeDigitos {
   static Scanner in = new Scanner(System.in);
   
   public static void casoPrueba(int n) {
        
      Deque<Integer> pila = new ArrayDeque<>();
      pila.push(-1);
      while (n>=10) {
         pila.push(n%10);
         n /= 10;
      }

      int result = 0;
      while (pila.peek() != -1) {
         result += pila.poll();
      }

      result += n;
      
      System.out.println(result);

   }
   public static void main(String[] args) {
      int n;
      while ((n = in.nextInt()) != -1) casoPrueba(n);
   }
}