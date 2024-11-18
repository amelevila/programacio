import java.util.*;

public class reines {

  static Scanner in;

  public static void casoDePrueba() {

    String[] reines = new String[8];
    for (int i = 0; i<8; i++) {
        reines[i] = in.next();
    }

    String result = "SI";
    for (int i = 0; i<8; i++){
        int i0 = reines[i].charAt(0);
        int i1 = reines[i].charAt(1);
        for (int j = i+1; j<8; j++){
            int j0 = reines[j].charAt(0);
            int j1 = reines[j].charAt(1);
            if (reines[i].charAt(0) == reines[j].charAt(0) && reines[i].charAt(1) == reines[j].charAt(1)) result = "ERROR";
            else if (!(result.equals("ERROR")) && (Math.abs(i0-j0) == Math.abs(i1-j1) || reines[i].charAt(0) == reines[j].charAt(0) || reines[i].charAt(1) == reines[j].charAt(1))) result = "NO";
        }
    }

    System.out.println(result);
      
  } // casoDePrueba

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    int numCasos = in.nextInt();
    for (int i = 0; i < numCasos; i++)
      casoDePrueba();

  } // main

}
