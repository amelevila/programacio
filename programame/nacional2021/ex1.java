import java.util.Scanner;

public class ex1 {
    static Scanner in = new Scanner(System.in);
    public static void casoPrueba(int n) {

        int check = 1;
        while(check%n != 0) {
            check = check*10+1;
        }

        String result = "" + check;
        System.out.println(result.length());

    }
    
    public static void main(String[] args) {
        
        while (in.hasNext()) {
            casoPrueba(in.nextInt());
        }
    }


}