// Esquema de la entrada: número de casos
import java.util.*;

public class nadal {

  static Scanner in;

  public static void casoDePrueba() {

    int dd = in.nextInt();
    int mm = in.nextInt();
    if (dd == 25 && mm == 12){
      System.out.println("SI");
    }
    else {
      System.out.println("NO");
    }
      
      
  } // casoDePrueba

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    int numCasos = in.nextInt();
    for (int i = 0; i < numCasos; i++)
      casoDePrueba();

  } // main

} // class Solution

