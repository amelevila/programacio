
import java.io.*;
import java.util.*;

public class ferrisWheel {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String[] nx = in.readLine().split(" ");
        int x = Integer.parseInt(nx[1]);
        
        String[] weightsString = in.readLine().split(" ");
        List<Integer> weights = new ArrayList<>();
        for (String str: weightsString) {weights.add(Integer.valueOf(str));}
        Collections.sort(weights);

        int count = 0;
        for (int j = weights.size()-1, i = 0; i<=j; j--, count++) {
            if (weights.get(i)+weights.get(j)<=x && i!=j) i++;
        }

        System.out.println(count);
        
    }
}