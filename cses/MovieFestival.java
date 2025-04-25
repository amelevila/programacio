import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class MovieFestival {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        
        int n = Integer.parseInt(in.readLine());
        TreeMap<Integer, Integer> movies = new TreeMap<>();
        for (int i = 0; i<n; i++) {
            String[] movie = in.readLine().split(" ");
            int key = Integer.parseInt(movie[0]);
            int value = Integer.parseInt(movie[1]);
            if (!movies.containsKey(key) || value < movies.get(key)) movies.put(key, value);
        }
        int i = movies.firstKey();
        int count = 0;
        while (i<=movies.lastKey()) { 
            while (!movies.containsKey(i)) i++;
            i = movies.get(i);
            count++;
        }
        System.out.println(count);

    }
}