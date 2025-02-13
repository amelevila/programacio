import java.io.*;

public class escacs {

   public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(reader.readLine());
      for (int t = 0; t < k; t++) {

         String input = reader.readLine();
         String[] linia = input.split(" ");

         char pieza = linia[0].charAt(0);
         boolean a = true;
         int[] moves = new int[4];
         for (int i = 1; i < 5; i++) {
            moves[i - 1] = Integer.parseInt(linia[i]);
            if (moves[i - 1] > 7) {
               a = false;
            }
         }
         if (!a) {
            System.out.println("OUT");
            continue;
         }
         

         if (pieza == 'A' && Math.abs(moves[0] - moves[2]) == Math.abs(moves[1] - moves[3])) {
            System.out.println("SI");
         }
         else if (pieza == 'C' && ((Math.abs(moves[0] - moves[2]) == 1 && Math.abs(moves[1] - moves[3]) == 2) || (Math.abs(moves[0] - moves[2]) == 2 && Math.abs(moves[1] - moves[3]) == 1) )) {
            System.out.println("SI");
         }
         else if (pieza == 'T' && (Math.abs(moves[0] - moves[2]) != 0 ^ Math.abs(moves[1] - moves[3])  != 0)) {
            System.out.println("SI");
         }
         else if (pieza == 'R' && (Math.abs(moves[0] - moves[2]) == Math.abs(moves[1] - moves[3])
               || (Math.abs(moves[0] - moves[2]) != 0 ^ Math.abs(moves[1] - moves[3]) != 0))) {
            System.out.println("SI");
         }
         else if (Math.abs(moves[0] - moves[2]) == 0 && Math.abs(moves[1] - moves[3])==0) {
            System.out.println("SI");
         }
         else {
            System.out.println("NO");
         }
      }
   }
}