import java.util.*;

public class apostesEsportives {

   static Scanner in;

   public static void main(String[] args) {

      in = new Scanner(System.in);

      int num = in.nextInt();
      for (int t = 0; t < num; t++) {
         int gols = in.nextInt();
         int diferencia = in.nextInt();
         if (diferencia > gols || (diferencia%2!=0 && gols%2==0) || (diferencia%2==0 && gols%2!=0)) {
            System.out.println("error");
            continue;
         }
         gols /= 2;
         if(diferencia%2==0){
            diferencia = (diferencia) / 2;
            System.out.println((gols + diferencia) + " " + (gols - diferencia));
         } else {
            diferencia = (diferencia) / 2;
            System.out.println((gols + diferencia+1) + " " + (gols - diferencia));
         }
      }
   }
}