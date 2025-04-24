import java.util.Arrays;
import java.util.Scanner;

public class ex9 {
    static Scanner in = new Scanner(System.in);
    public static void casoPrueba(String[] persona) {

        int t = Integer.parseInt(in.nextLine());
        int any = Integer.parseInt(persona[0]);

        String[] obras = new String[t];
        for (int i = 0; i<t; i++) {
            obras[i] = in.nextLine();
        }

        int[] anys = new int[t];
        for (int i = 0; i<t; i++) {
            anys[i] = Integer.parseInt(obras[i].split(" ")[0]);
        }
        Arrays.sort(anys);

        if (any<=anys[0]) System.out.println("TODAS");
        else if (any>anys[t-1]) System.out.println("NINGUNA");
        else {
            int result = -1;
            for (int i = 0; i<t; i++) {
                if (any<=anys[i]) {
                    result = anys[i];
                    break;
                }
            }
            for (int i = 0; i<t; i++) {
                if (obras[i].startsWith("" + result)) {
                    String imprimir = "";
                    String[] obra = obras[i].split(" ");
                    for (int j = 1; j<obra.length; j++) {
                        imprimir += obra[j] + " ";
                    }
                    imprimir = imprimir.substring(0, imprimir.length()-1);
                    System.out.println(imprimir);
                    return;
                }
            }
        }

    }
    
    public static void main(String[] args) {
        
        while (in.hasNext()) {
            casoPrueba(in.nextLine().split(" "));
        }
    }


}