import java.util.Scanner;

public class seHaColado {

   static Scanner in = new Scanner(System.in);

   public static void casoPrueba() {

      int t = in.nextInt();
      int count = 0;

      int[] nums = new int[t];
      nums[0] = in.nextInt();

      int j = 1;
      while (t-- > 1) {
         
         int n = in.nextInt();
         
         while (j>0 && n < nums[j-1]) {
            count++;
            j--;
         }

         nums[j] = n;
         j++;
         
      }

      System.out.println(count);
   } 
   
   public static void main(String[] args) {
      
      int t = in.nextInt();
      while (t-- > 0) {
         casoPrueba();
      }
   }
    
}
// Amb pila, bufferedReader i StringTokenizer


/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class seHaColado {

public static void casoPrueba(StringTokenizer st, int t) throws IOException {

      Deque<Integer> pila = new ArrayDeque<>();
      int n = Integer.parseInt(st.nextToken());
      pila.push(n);

      for (int i = 1; i < t; i++) {
         
         n = Integer.parseInt(st.nextToken());
         
         while (pila.peek()!= null && n < pila.peek()) {
            pila.pop();
         }
         pila.push(n);
         
      }
      //System.out.println(pila);
      System.out.println(t-pila.size());

   } 
   
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int t = Integer.parseInt(br.readLine());
      while (t-- > 0)  {
         int t2 = Integer.parseInt(br.readLine());
         StringTokenizer st = new StringTokenizer(br.readLine());
         casoPrueba(st, t2);
      }
   }
    
}
*/