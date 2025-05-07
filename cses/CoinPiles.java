import java.io.DataInputStream;
import java.io.IOException;

public class CoinPiles {
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
        while (n-- > 0) {
            int p1 = in.nextInt();
            int p2 = in.nextInt();
            if (p1 > p2) {
                int tmp = p1;
                p1 = p2;
                p2 = tmp;
            }
            
            if (p1>p2*2) {
                System.out.println("NO");
                continue;
            }

            /*int count = 0;
            int ogp1 = p1;
            int ogp2 = p2;*/
            while (p1 != p2*2) {
                //count++;
                p1--;
                p2 -= 2;
                if (p1 <=0 || p2 <= 0 || p1>p2*2) {
                    System.out.println("NO");
                    break;
                }
            }
            if (p1 > 0 && p2 > 0 && p1 == p2*2) {
                /*System.out.print(ogp1 + " - ");
                System.out.print(count + " = ");
                System.out.println(p1);
                System.out.print(ogp2 + " - ");
                System.out.print(count*2 + " = ");
                System.out.println(p2);
                System.out.println(ogp1-ogp2);*/
                System.out.println("YES");
            }

        }
    }
}