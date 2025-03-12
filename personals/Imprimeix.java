public class Imprimeix {
   public static void main(String[] args) {
       imprimeix("Hola");
       System.out.println();
   }

   public static void imprimeix(String text) {
      if (text.length()<1) {
         return;
      }

      imprimeix(text.substring(1));
      System.out.print(text.charAt(0));
   }
}