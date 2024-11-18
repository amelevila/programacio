// Esquema de la entrada: caso de prueba que marca el final
import java.util.*;

public class pi {

  static Scanner in;

  public static boolean casoDePrueba() {

    int dias = in.nextInt();
    int emisoras = in.nextInt();

    if (dias == 0 && emisoras == 0){
        return false;
    }
    else {
      
        int total = dias * emisoras * 6 * 24;

        int d = total / 86400;
        total -= d * 86400;
        int hh = total / 3600;
        total -= hh * 3600;
        int mm = total / 60;
        total -= mm * 60;
        int ss = total;

        String ssString = Integer.toString(ss);
        String mmString = Integer.toString(mm);
        String hhString = Integer.toString(hh);

        if (ss<10){
            ssString = "0" + ssString;
        }
        if (mm<10){
            mmString = "0" + mmString;
        }
        if (hh<10){
            hhString = "0" + hhString;
        }

        System.out.println(d + ":" + hhString + ":" + mmString + ":" + ssString);

      return true;
    }

  } // casoDePrueba

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    while(casoDePrueba())
      ;

  } // main

} // class pi
