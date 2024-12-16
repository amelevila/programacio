import java.util.*;

public class incidencies {

    static Scanner in;

    public static void main(String[] args) {
        
        in = new Scanner(System.in);

        float result = 0;

        for (int t = 0; t<10; t++) {
            String input = in.nextLine();
            String[] line = input.split(",");
    
            int count1 = 0;
            int count10 = 0;
            for (int i = 1; i<6; i++) {
                if (line[i].equals("10")) count10++;
                if (line[i].equals("1")) count1++;
            }

            if (count1>(5-count10)/2) {
                result += Float.parseFloat(line[6])*count1;
            }

        }


        System.out.println(Math.round(result * 100f) / 100f);

    }
}