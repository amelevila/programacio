import java.util.Scanner;

public class F_Suelo_multicolor {
    static Scanner in = new Scanner(System.in);

    public static void casoPrueba(String t) {
        
        String[] hoal123 = t.split(" ");
        if (hoal123.length!=3){
            System.out.println();
            return;
        }
        int n = Integer.parseInt(hoal123[0]);
        int m = Integer.parseInt(hoal123[1]);
        String patro = hoal123[2];

        for (int i = 0; i<n; i++) {
            for (int k = 0;k<m; k++) {
                char c = patro.charAt(k%patro.length());
                System.out.print(c);
            }
            System.out.println();
            if (patro.length()>0) {
                patro = patro.charAt(patro.length()-1) + patro;
                patro = patro.substring(0, patro.length()-1);
            }
        }

    }

    public static void main(String[] args) {
        String t;
        while (true) {
            if (!in.hasNextLine()) return;
            t = in.nextLine();
            casoPrueba(t);
        }
    }
}