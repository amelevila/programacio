import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class excel {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    public static void casoPrueba(String input) throws IOException {

      String result = "";
      for (String numString : input.split(" ")) {

         long num = Long.parseLong(numString);

         Deque<Long> cua = new ArrayDeque<>();    
         
         cua.addFirst(0l);
         while (num>26) {
            if (num%26 == 0) {
               cua.addFirst(26l);
               num = num/26-1;
            }
            else {
               cua.addFirst(num%26);
               num = num/26;
            }
            
         }
         cua.addFirst(num);

         long n;
         //System.out.println(cua);
         while ((n = cua.poll()) != 0) {
            result+= ((char) (n+'A'-1));
         }
         

         result += " ";
      }
      result = result.trim();
      System.out.println(result);

    } 
    
    public static void main(String[] args) throws IOException {
        String t;
        while (!(t = in.readLine()).equals("0")) casoPrueba(t);
    }
    
}