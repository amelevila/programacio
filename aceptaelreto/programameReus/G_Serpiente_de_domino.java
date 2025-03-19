import java.io.*;
import java.util.TreeMap;

public class G_Serpiente_de_domino {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void casoPrueba(int fitchas) throws IOException {
        
        String input = in.readLine();
        String[] fit = input.split(" ");
        TreeMap<String,Integer> map = new TreeMap<>();

        int max = 1;
        for (int i = 0; i<fit.length; i++) {
            String actual = fit[i];
            if ((i<fit.length-1) && actual.charAt(1) != fit[i+1].charAt(0)) {
                System.out.println("ERROR");
                return;
            }
            if (actual.charAt(1) > actual.charAt(0)) {
                actual = "" + actual.charAt(1) + actual.charAt(0);
            }
            if (!map.containsKey(actual)) map.put(actual, 1);
            else map.put(actual, map.get(actual)+1);

            if (map.get(actual) > max) max = map.get(actual);
        }

        System.out.println(max);

    }

    public static void main(String[] args) throws IOException {
        int t;
        while ((t = Integer.parseInt(in.readLine())) != 0) casoPrueba(t);
    }
}