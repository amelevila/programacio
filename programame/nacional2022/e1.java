import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class e1 {
    static Scanner in = new Scanner(System.in);

    public static void casoDePrueba(int n) {
        List<Integer> nums = new ArrayList<>();
        int a1 = 0; 
        int a2 = 0;
        int a3 = 0;
        int sum = 0;
        for (int i = 0 ; i<n; i++) {
            int v = in.nextInt();
            nums.add(v);
            sum+=v;
        }
        Collections.sort(nums);
        while (!nums.isEmpty()) {
            int index = (nums.size()%2!=0) ? 0:nums.size()-1;
            if (a1<sum/3) a1 += nums.remove(index);
            else if (a2<sum/3) a2 += nums.remove(index);
            else if (a3<sum/3) a3 += nums.remove(index);
            else {
                if (a1<=a2 && a1<=a3) a1 += nums.remove(index);
                else if (a2<=a1 && a2<=a3) a2 += nums.remove(index);
                else if (a3<=a1 && a3<=a2) a2 += nums.remove(index);
            }
        }
        

        int menor = Math.min(a1, a2);
        menor = Math.min(a3, menor);

        int major = Math.max(a1, a2);
        major = Math.max(a3, major);

        System.out.println(major - menor);
    }

    public static void main(String[] args) {
        while (in.hasNext()) {
            int n = in.nextInt();
            casoDePrueba(n);
        }

    }
}