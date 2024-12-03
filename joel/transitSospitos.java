import java.util.*;

public class transitSospitos {
    static Scanner in;

    public static void main(String[] args) {
        
        in = new java.util.Scanner(System.in);

        String input = in.nextLine();
        String[] ip = input.split(",");

        String input2 = in.nextLine();
        String[] search = input2.split(" ");

        int count = 0;
        for (int i = 0; i<ip.length-1; i++) {
            //System.out.println(i + ") " + ip[i]);
            if (ip[i].startsWith(search[0]) && ip[i+1].startsWith(search[1])) count++;
        }

        System.out.println(ip.length + " " + count);

    }
}