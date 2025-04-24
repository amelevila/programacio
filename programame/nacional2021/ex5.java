import java.util.Scanner;

public class ex5 {
    static Scanner in = new Scanner(System.in);
    public static void casoPrueba(int n) {

        int fc = 1;
        int count = 0;
        while (n>fc) {
            fc*=2;
            count++;
        }
        System.out.println(count);

    }
    
    public static void main(String[] args) {
        
        int t = in.nextInt();
        while (t-- > 0) {
            casoPrueba(in.nextInt());
        }
    }


}