import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;

public class C_Wheeler_y_el_zumo_de_limon {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void casoPrueba(int longitut) throws IOException {
        String[] arr1 = in.readLine().split(" ");
        String[] arr2 = in.readLine().split(" ");
        TreeMap<Integer,Integer> map = new TreeMap<>();

        int[] arrIn = new int[arr1.length];
        for (int i = 0; i<arr2.length; i++) {
            arrIn[i] = Integer.parseInt(arr1[i]);
            map.put(arrIn[i], Integer.parseInt(arr2[i]) - arrIn[i]);
        }

        Arrays.sort(arrIn);
        for (int i = 0; i<arrIn.length-1; i++) {
            if (map.get(arrIn[i]) <= map.get(arrIn[i+1])) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("SI");
    }

    public static void main(String[] args) throws IOException {
        while (true) { 
            int num = Integer.parseInt(in.readLine());
            if (num == 0) break;
            casoPrueba(num);
        }
    }
}