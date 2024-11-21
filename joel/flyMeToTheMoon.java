import java.util.*;

public class flyMeToTheMoon {

    static Scanner in;
  
    public static boolean casoDePrueba() {
  
        int times = in.nextInt();
  
        if (times == 0) return false; 
        
        int weight = 0;
        for (int i = 0; i<times; i++) {
            weight += in.nextInt();
        }

        int combustible = (weight%7 == 0) ? weight/7:weight/7+1;
        int totalWeight = weight + combustible;
        

        while (true) {
            int extraCombustible = (totalWeight%7 == 0) ? totalWeight/7:totalWeight/7+1;
            
            if (extraCombustible == combustible) break; 
            combustible = extraCombustible;
            totalWeight = weight + combustible;
        }

        System.out.println(combustible);

        return true;
  
    } // casoDePrueba
  
    public static void main(String[] args) {
  
      in = new java.util.Scanner(System.in);
  
      while(casoDePrueba())
        ;
  
    } // main
  
  }