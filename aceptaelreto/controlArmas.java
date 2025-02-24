import java.io.*;
import java.util.TreeMap;

public class controlArmas {
   static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   
   public static void casoPrueba(int t) throws IOException{
      
      TreeMap<String,Integer> map = new TreeMap<>();

      for (int k = 0; k < t; k++) {
         String input = reader.readLine();
         String[] camps = input.split(" ");
         String nom = camps[0];
         int num = Integer.parseInt(camps[1]);
   
         if (nom.equals("?")) {
            int result = 0;
            //System.out.println(map);
            for (int i = camps.length-1; i>=camps.length-num; i--) {
               result += map.get(camps[i]);
               map.remove(camps[i]);
            }
            System.out.println(result);
            continue;
         }
   
         if (map.containsKey(nom)) {
            map.put(nom, map.get(nom)+num);
         }
         else {
            map.put(nom, num);
         }
   
         //System.out.println(map);
      }      

   }
 
   public static void main(String[] args) throws IOException {

      int t = Integer.parseInt(reader.readLine());
      while (t!=0) {
         casoPrueba(t);
         System.out.println("---");
         t = Integer.parseInt(reader.readLine());
      }
   }
    
}