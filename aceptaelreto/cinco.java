// Esquema de la entrada: número de casos
import java.util.*;
import java.math.BigInteger;

public class cinco {

  static Scanner in;

  public static void casoDePrueba() {

    BigInteger num = in.nextBigInteger();
    BigInteger limit = new BigInteger("20000000000");
    BigInteger cinco = new BigInteger("5");

    //(num<20000000000 && num%5==0)
    if (num.compareTo(limit) < 0 && num.mod(cinco).equals(BigInteger.ZERO)){
      num = num.multiply(num); // num * num
      System.out.println(num);
    }

  } // casoDePrueba

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    int numCasos = in.nextInt();
    for (int i = 0; i < numCasos; i++)
      casoDePrueba();

  } // main

} // class cinco

