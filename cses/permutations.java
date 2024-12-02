import java.io.*;

public class permutations {

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        
        if (n==2 || n==3) {
            System.out.println("NO SOLUTION");
            return;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 2; i<=n; i+=2) {
            result.append(i).append(" ");
        }
        for (int i = 1; i<=n; i+=2) {
            result.append(i).append(" ");
        }

        System.out.println(result.toString().trim());

    }
}