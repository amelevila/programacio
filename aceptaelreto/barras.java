// Esquema de la entrada: caso de prueba que marca el final
import java.util.*;

public class barras {

  static Scanner in;

  public static boolean casoDePrueba() {

    // LEER CASO DE PRUEBA
    
    //digit (text)
    String digit = in.nextLine();
    
    //code (number)
    long code = Long.parseLong(digit);
    if (digit.equals("0"))
      return false;
    else { 
      //array
      int[] arrCode;
      int dLen = digit.length();
      if (dLen<=8){
        arrCode = new int[8];
      }
      else if (dLen>8 && dLen<=13){
        arrCode = new int[13];
      }
      else {
        return true;
      }
      long temp = code;
      int aLen = arrCode.length;
      for (int i = aLen-1; i>=0; i--){
        arrCode[i]=(int)(temp%10);
        temp = temp/10;
      }

      //sum
      int sum = 0;
      
      if (aLen==8){
        for (int i = 0; i<aLen-1; i++){
          if (i%2 == 0){
            sum = sum + (arrCode[i] * 3);
          }
          else {
            sum = sum + arrCode[i];
          }
        }
      }
      else if (aLen==13){
        for (int i = 0; i<aLen-1; i++){
          if (i%2 == 0){
            sum = sum + arrCode[i];
          }
          else {
            sum = sum + (arrCode[i] * 3);
          }
        }
      }
      else {
          return true;
        }
      
      //testNum
      int testNum = (int)(code%10);
      
      //result
      String result = ((sum + testNum)%10 == 0) ? "SI" : "NO";
      
      //numCountry
      String numCountry = "";
      if (aLen==13){
        numCountry = digit.substring(0, 3);
      }

      //country
      String country = "";

      //less than 3 digits country
      if (arrCode[0] == 0){
        country = "EEUU";
      }
      else if (numCountry.startsWith("50")){
        country = "Inglaterra";
      }
      else if (numCountry.startsWith("70")){
        country = "Noruega";
      }

      //3 digits country
      else {
        switch (numCountry){
            case "380": country = "Bulgaria";
            break;
            case "539": country = "Irlanda";
            break;
            case "560": country = "Portugal";
            break;
            case "759": country = "Venezuela";
            break;
            case "850": country = "Cuba";
            break;
            case "890": country = "India";
            break;
            default: country = "Desconocido";
            break;
        }
      }
      
      //print answer
      
      if (aLen == 13 && result.equals("SI")){
        System.out.println(result + " " + country);
      }
      else {
        System.out.println(result);
      }
      return true;
    }

  } // casoDePrueba

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    while(casoDePrueba())
      ;

  } // main

} // class Solution
