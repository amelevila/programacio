import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
public class MissingCoinSum {
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
    static Reader in = new Reader();
    public static void main(String[] args) throws IOException {
        int n = in.nextInt();
 
        List<Long> coins = new ArrayList<>();
        for (int i = 0; i<n; i++) {
            long value = in.nextInt();
            coins.add(value);
        }
        System.out.println(coins);
    }
}