import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RestaurantCustomers {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());

        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i<n; i++) {
            String[] ab = in.readLine().split(" ");
            a[i] = Integer.parseInt(ab[0]);
            b[i] = Integer.parseInt(ab[1]);
        }
        Arrays.sort(a);
        Arrays.sort(b);

        int now = 0;
        int result = 0;

        int j = 0;
        int k = 0;
        while (k<n && j<n) {
            if (a[j] < b[k]) {
                j++;
                now++;
            }
            else if (b[k] < a[j]) {
                k++;
                now--;
            }

            if (now>result) result = now;
        }
        System.out.println(result);

    }
}