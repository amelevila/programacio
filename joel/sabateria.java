import java.util.*;

public class sabateria {

    static Scanner in;

    public static void main(String[] args) {
        
        in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int t = 0; t<n; t++) {

            String linia1 = in.nextLine();
            String linia2 = in.nextLine();

            String[] exist = linia1.split(", ");
            String[] comanda = linia2.split(", ");

            String result = "";

            for (int i = 0; i<exist.length; i++) {
                boolean found = false;
                String numE = exist[i].substring(0,2);
                if (Integer.parseInt(numE) < 30 || Integer.parseInt(numE) > 45) continue;
                int quantE = Integer.parseInt(exist[i].substring(3));

                for (int j = 0; j<comanda.length; j++) {
                    String numC = comanda[j].substring(0,2);
                    int quantC = Integer.parseInt(comanda[j].substring(3));

                    if (numC.equals(numE)) {
                        found = true;
                        int quantT = quantC + quantE;
                        result += numC + " " +  quantT + ", ";
                        break;
                    }
                }

                if (!found) result += exist[i] + ", ";
            }

            for (int i = 0; i<comanda.length; i++) {
                boolean found = false;
                String numC = comanda[i].substring(0,2);
                if (Integer.parseInt(numC) < 30 || Integer.parseInt(numC) > 45) continue;

                for (int j = 0; j<exist.length; j++) {
                    String numE = exist[j].substring(0,2);

                    if (numC.equals(numE)) {
                        found = true;
                        break;
                    }
                }
                if (!found) result += comanda[i] + ", ";
            }

            System.out.println(result.substring(0, result.length()-2));
            
        }
    }
}