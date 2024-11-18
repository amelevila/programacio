// Esquema de la entrada: número de casos
import java.util.*;

public class mundial {

  static Scanner in;

  public static void casoDePrueba() {

    int participar = in.nextInt();
    int sum = 0;
    for (int i = 0; i<6; i++){
      sum = sum + in.nextInt();
    }
    System.out.println(participar - sum);
    
    // in.next*()

  } // casoDePrueba

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    int numCasos = in.nextInt();
    for (int i = 0; i < numCasos; i++)
      casoDePrueba();

  } // main

} // class Solution

