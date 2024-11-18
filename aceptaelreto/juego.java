// Esquema de la entrada: número de casos
import java.util.*;

public class juego {

  static Scanner in;

  public static void casoDePrueba() {

    int guardado = in.nextInt();
    int mins = in.nextInt();

    int[] puntos = new int[guardado];
    for (int i = 0; i<guardado; i++){
        puntos[i] = in.nextInt();
    }

    int count = 0;
    int i = 0;
    int minsTemp = mins;
    while (i<guardado){
        while (i<guardado && minsTemp>=puntos[i]){ 
            i++;
        }
        if (i<guardado){
            minsTemp = mins + puntos[i-1];
        }
        count++;
    }

    System.out.println(count);


  } // casoDePrueba

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    int numCasos = in.nextInt();
    for (int i = 0; i < numCasos; i++)
      casoDePrueba();

  } // main

} // class Solution
