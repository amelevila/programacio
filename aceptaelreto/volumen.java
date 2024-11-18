// Esquema de la entrada: número de casos
import java.util.*;

public class volumen {

  static Scanner in;

  public static void casoDePrueba() {

    int num = in.nextInt();
    System.out.println(num/100);

  } // casoDePrueba

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    int numCasos = in.nextInt();
    for (int i = 0; i < numCasos; i++)
      casoDePrueba();

  } // main

} // class volumen
