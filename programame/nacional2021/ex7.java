import java.util.Scanner;

public class ex7 {
    static Scanner in = new Scanner(System.in);
    public static void casoPrueba(int n, int t) {

        int[][] cords = new int[t][2];
        for (int i = 0; i<t; i++) {
            cords[i][0] = in.nextInt();
            cords[i][1] = in.nextInt();
        }

        

    }
    
    public static void main(String[] args) {
        
        while (in.hasNext()) {
            casoPrueba(in.nextInt(), in.nextInt());
        }
    }


}