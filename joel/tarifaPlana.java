import java.io.*;

public class tarifaPlana {

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String result = "";

        while (true) {
            String input = reader.readLine();
            if (input.equals("*")) break;

            String[] line = input.split(", ");
            int total = Integer.parseInt(line[1]);

            boolean bonUsuari = true;
            int count = 0;
            for (int i = 2; i<line.length; i++) {
                int num = Integer.parseInt(line[i].trim());
                count += num;
                if (num > total/5) bonUsuari = false;
                if (count > total) bonUsuari = false;
            }
            if (bonUsuari) result += line[0] + ", ";
            
        }
        
        if (!result.isEmpty()) System.out.println(result.substring(0, result.length() - 2));
        else System.out.println(result); 
               

    }
}