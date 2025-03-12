import java.util.*;

public class Facundo {
   static Scanner in = new Scanner(System.in);

   public static void casoPrueba() {
        
      Stack<String> enrere = new Stack<>();
      Stack<String> endevant = new Stack<>();

      String paraula;
      while (!((paraula=in.next()).equals("."))) {
         switch (paraula) {
            case "<" -> {
               if (!enrere.isEmpty()) endevant.add(enrere.pop());
            }
            case ">" -> {
               if (!endevant.isEmpty()) {
                  if (endevant.size() == 1) enrere.add(endevant.peek());
                  else enrere.add(endevant.pop());
               }
            }
            default -> {
               enrere.add(paraula);
               endevant.clear();
               endevant.add(paraula);
            }
         }
      }
      
      String result = "";
      while(!enrere.isEmpty()) result = enrere.pop() + ' ' + result;
      if (!result.isEmpty()) result = result.substring(0, result.length()-1);

      System.out.println(result);
   }

   public static void main(String[] args) {
      int t = in.nextInt();
      while (t-- > 0) casoPrueba();
   }
}