import java.util.*;

public class blitzcrank {

    static Scanner in;
  
    public static boolean casoDePrueba() {
  
      int carryEnemy = in.nextInt();
      int blitzCarry = in.nextInt();
      int hook = in.nextInt();
  
      if (carryEnemy == 0 && blitzCarry == 0 && hook == 0){
          return false;
      }
      else {
        
        double blitzEnemy = Math.sqrt((carryEnemy*carryEnemy) + (blitzCarry*blitzCarry));
        if (hook>=blitzEnemy) System.out.println("SI");
        else System.out.println("NO");
  
        return true;
      }
  
    } // casoDePrueba
  
    public static void main(String[] args) {
  
      in = new java.util.Scanner(System.in);
  
      while(casoDePrueba())
        ;
  
    } // main
  
  } // class pi