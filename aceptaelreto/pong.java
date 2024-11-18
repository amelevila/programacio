// Esquema de la entrada: caso de prueba que marca el final
import java.util.*;

public class pong {

  static Scanner in;

  public static boolean casoDePrueba() {

    // LEER CASO DE PRUEBA
    int sounds = in.nextInt();
    if (sounds==0)
      return false;
    else {
      //p1 == right / p2 == left
      int p1 = 0;
      int p2 = 0;
      //0 == right / 1 == left
      int direction = 0;
      for (int i = 0; i<sounds; i++){
        String ono = in.next();
        if (ono.equals("PIC")){
          if (direction == 0){
            direction = 1;
          }
          else {
            direction = 0;
          }
        }
        else if (ono.equals("PONG!")){
          if (direction == 0){
            p2++;
          }
          else {
            p1++;
          }
        }
      }
      System.out.println(p2 + " " + p1);
      return true;
    }

  } // casoDePrueba

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    while(casoDePrueba())
      ;

  } // main

} // class Solution

