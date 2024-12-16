import java.util.*;

public class nomsUsuari {

    static Scanner in;

    public static void main(String[] args) {
        
        in = new Scanner(System.in);

        String text = in.nextLine();
        String result = "";
        String resultFinal = "";

        
        while (resultFinal.length()<9) {
            for (int i = 0; i<text.length(); i++) {
                char ch = Character.toLowerCase(text.charAt(i));
                boolean found = false;
    
                for (int j = 0; j<result.length(); j++) {
                    if (ch == result.charAt(j)) {
                        found = true;
                        break;
                    }
                }
    
                if (!found && Character.isLetter(ch)) result += ch;
    
                if (result.length()==9) break;
                
            }
            resultFinal += result;
            if (resultFinal.length()!=9) resultFinal += '0';
            result = "";
        }

        System.out.println(resultFinal);

    }
}