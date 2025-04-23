import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class ConcertTickets {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String[] nm = in.readLine().split(" ");
        
        List<Integer> tick = new ArrayList<>();
        for (String str: in.readLine().split(" ")) {tick.add(Integer.valueOf(str));}
        
        String[] custString = in.readLine().split(" ");
        int[] cust = new int[Integer.parseInt(nm[1])];
        for (int i = 0; i<cust.length; i++) {cust[i] = Integer.parseInt(custString[i]);}
        
        Collections.sort(tick);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i<cust.length; i++) {
            if (tick.isEmpty() || tick.get(0)>cust[i]) {
                result.append(-1);
            }
            else if (tick.get(tick.size()-1)<=cust[i]) {
                result.append(tick.remove(tick.size()-1));
            }
            else { 
                /*for (int j = 1; j<tick.size(); j++) {
                    if (tick.get(j)>cust[i]) {
                        result.append(tick.remove(j-1));
                        break;
                    }
                }*/
                result.append(tick.remove(findTicket(tick, cust[i])));
            }
            result.append("\n");
        }
 
        System.out.println(result);
 
    }
 
    
    public static int findTicket(List<Integer> tick, int cust) {
        int j = tick.size()/2;
        int max = tick.size()-1;
        int min = 0;
        while (true) { 
            if (tick.get(j) <= cust) {
                if (tick.get(j+1) > cust || tick.get(j) == cust) return j;
                else {
                    min = j;
                }
            }
            else {
                max = j;
            }
            j = min + ((max-min)/2);
        }
    }
}