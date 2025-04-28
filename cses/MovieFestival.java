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
            int start = Integer.parseInt(movie[0]);
            int end = Integer.parseInt(movie[1]);
            if (!movies.containsKey(end) || start > movies.get(end)) movies.put(end, start);
        }

        int end = 0;
        int count = 0;
        int lastStart = 0;
        int lastEnd = 0;
        while (end<movies.lastKey()) {
            while (end < movies.lastKey()) {
                end = movies.higherKey(end);
                int start = movies.get(end);
                if (start > lastStart && start >= lastEnd) {
                    lastEnd = end;
                    lastStart = start;
                    //System.out.println(start + " / " + end);
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}