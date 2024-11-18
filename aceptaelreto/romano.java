// Esquema de la entrada: número de casos
import java.util.*;

public class romano {

  static Scanner in;

  public static void casoDePrueba() {

      int legi = in.nextInt();
      int shield = 0;
      if (legi==0){
        System.exit(0);
      }
      while (legi > 0){
      int i = 0;
        while (i*i<=legi){
        	i++;
      	}
      	i--;
      	shield = shield + (i*i)+(i*4);
      	legi = legi - i*i;
      }
      System.out.println(shield);
      
  } // casoDePrueba

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    int numCasos = in.nextInt();
    for (int i = 0; i < numCasos; i++)
      casoDePrueba();

  } // main

} // class Solution

