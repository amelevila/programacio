import java.util.*;

public class castillosNaipes {
   static Scanner in = new Scanner(System.in);

   public static void casoPrueba() {
        
      long n = in.nextLong();

      long cartes = ((((n+1)*n)/2)*3)-n;
      System.out.println(cartes);

   }

   public static void main(String[] args) {
      int t = in.nextInt();
      while (t-- > 0) casoPrueba();
   }
}