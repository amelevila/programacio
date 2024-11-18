// Esquema de la entrada: caso de prueba que marca el final
import java.util.*;

public class encrucijadas {

  static Scanner in;

  public static boolean casoDePrueba() {

    int ninicial = in.nextInt();
    int nfinal = in.nextInt();

    if (ninicial == 0 && nfinal == 0)
      return false;
    else {
      int suma = 0;
      for (int i = ninicial; i<=nfinal; i++){
        if (i%3==0){
            suma += i;
        }
      }

      System.out.println(suma);

      return true;
    }

  } // casoDePrueba

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    while(casoDePrueba())
      ;

  } // main

} // class Solution
