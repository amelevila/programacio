import java.io.*;

public class ausiasOBosca {

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;
        input = reader.readLine();
        String[] bosca = input.split(" ");
        input = reader.readLine();
        String[] ausias = input.split(" ");
        input = reader.readLine();
        String[] codis = input.split(" ");
        String search = reader.readLine();

        String insti = "";
        String planta = "";

        for (int i = 0; i<bosca.length; i++) {
            if (bosca[i].equals(search)) insti = "BOSCA";
        }
        for (int i = 0; i<ausias.length; i++) {
            if (ausias[i].equals(search)) insti = "AUSIAS";
        }
        int pos = -3;
        if (search.substring(0,2).equals("P3") || search.substring(0,2).equals("P2") || search.substring(0,2).equals("P1") || search.substring(0,2).equals("PB") || search.substring(0,2).equals("S1") || search.substring(0,2).equals("S2")) {
            planta = search.substring(0,2);
        }
        
        else {
            for (int i = 0; i<codis.length; i++) {
                if (search.equals(codis[i])) pos = i;
            }
            pos /= 3;
            switch (pos) {
                case 0:
                    planta = "P3";
                    break;
                case 1:
                    planta = "P2";
                    break;
                case 2:
                    planta = "P1";
                    break;
                case 3:
                    planta = "S1";
                    break;
                case 4:
                    planta = "S2";
                    break;
            
                default:
                    break;
            }
        }
        if (pos==-1) return;
        System.out.println(insti + " " + planta);

    }
}