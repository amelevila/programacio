import java.util.*;

public class transitSospitos {
    static Scanner in;

    public static void main(String[] args) {
        
        in = new java.util.Scanner(System.in);

        String input = in.nextLine();
        String[] ip = input.split(",");

        String input2 = in.nextLine();
        String[] search = input2.split(" ");
        int search1 = Integer.parseInt(search[0]);
        int search2 = Integer.parseInt(search[1]);

        int count = 0;
        int extern = ip.length;
        for (int i = 0; i<ip.length; i++) {
            int externOld = extern;
            String[] parts = ip[i].split("\\.");
            if (parts.length != 4) {
                System.out.println("0 0");
                return;
            }
            int part1 = Integer.parseInt(parts[0]);
            int part2 = Integer.parseInt(parts[1]);
            
            if (part1 == 10 || ip[i].startsWith("192.168.") || ip[i].startsWith("169.254.")) extern--;
            if (part1 == 172 && (part2 >= 16 && part2 <= 31)) extern--;
            if (part1 == 100 && (part2 >= 64 && part2 <= 127)) extern--;
            if (part1 >= 224 && part1 <= 233) extern--;

            if (i != ip.length-1 && extern == externOld) {
                String[] partsIp2 = ip[i+1].split("\\.");
                int part1Ip2 = Integer.parseInt(partsIp2[0]);
                if (part1 == search1 && part1Ip2 == search2) count++;
            }
        }

        System.out.println(extern + " " + count);

    }
}