/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
 
public class ConcertTickets {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        
        String[] nm = in.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        TreeMap<Integer, Integer> tick = new TreeMap<>();
        String[] tickets = in.readLine().split(" ");
        for (int i = 0; i<n; i++) {
            int num = Integer.parseInt(tickets[i]);
            if (tick.containsKey(num)) tick.put(num, tick.get(num)+1);
            else tick.put(num, 1);
        }
        
        String[] customers = in.readLine().split(" ");
        int[] cust = new int[m];
        for (int i = 0; i<m; i++) {cust[i] = Integer.parseInt(customers[i]);}
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i<cust.length; i++) {
            if (tick.isEmpty() || tick.firstKey()>cust[i]) {
                result.append(-1);
            }
            else if (tick.lastKey() <= cust[i]) {
                int last = tick.lastKey();
                result.append(last);
                if (tick.get(last) > 1) tick.put(last, tick.get(last)-1);
                else tick.remove(last);
            }
            else { 
                int mesGran = tick.floorKey(cust[i]);
                result.append(mesGran);
                if (tick.get(mesGran) > 1) tick.put(mesGran, tick.get(mesGran)-1);
                else tick.remove(mesGran);
            }
            result.append("\n");
        }
 
        System.out.println(result);
 
    }
}*/
import java.io.DataInputStream;
import java.io.IOException;
import java.util.TreeMap;
 
public class ConcertTickets {
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private final DataInputStream din;
        private final byte[] buffer;
        private int bufferPointer, bytesRead;
 
        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
 
        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
 
        @SuppressWarnings("ConvertToTryWithResources")
        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');
 
            if (neg)
                return -ret;
            return ret;
        }
    }
    static Reader br = new Reader();
    public static void main(String[] args) throws IOException {
        
 
        int n = br.nextInt();
        int m = br.nextInt();
        
        TreeMap<Integer, Integer> tick = new TreeMap<>();
        for (int i = 0; i<n; i++) {
            int num = br.nextInt();
            if (tick.containsKey(num)) tick.put(num, tick.get(num)+1);
            else tick.put(num, 1);
        }
        
        int[] cust = new int[m];
        for (int i = 0; i<m; i++) {cust[i] = br.nextInt();}
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i<cust.length; i++) {
            if (tick.isEmpty() || tick.firstKey()>cust[i]) {
                result.append(-1);
            }
            else if (tick.lastKey() <= cust[i]) {
                int last = tick.lastKey();
                result.append(last);
                if (tick.get(last) > 1) tick.put(last, tick.get(last)-1);
                else tick.remove(last);
            }
            else { 
                int mesGran = tick.floorKey(cust[i]);
                result.append(mesGran);
                if (tick.get(mesGran) > 1) tick.put(mesGran, tick.get(mesGran)-1);
                else tick.remove(mesGran);
            }
            result.append("\n");
        }
 
        System.out.println(result);
 
    }
}