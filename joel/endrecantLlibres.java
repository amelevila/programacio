import java.util.*;

public class endrecantLlibres {

    static Scanner in;

    public static void main(String[] args) {
        
        in = new java.util.Scanner(System.in);

        String text = in.nextLine();
    
        char[] llibres = new char [text.length()];
        for (int i = 0; i<text.length(); i++) {
            llibres[i] = text.charAt(i);
        }

        int result = 0;
        for (int i = 0; i<llibres.length; i++) {
            if (llibres[i] == 'M') {
                for (int j = i; j<llibres.length; j++) {
                    if (llibres[j]=='G') {
                        llibres[i] = 'G';
                        llibres[j] = 'M';
                        result++;
                        break;
                    }
                }
            }

            if (llibres[i] == 'P') {
                for (int j = llibres.length-1; j>=i; j--) {
                    if (llibres[j]=='G') {
                        llibres[i] = 'G';
                        llibres[j] = 'P';
                        result++;
                        break;
                    }
                }
            }
            
            if (llibres[i] == 'P') {
                for (int j = i; j<llibres.length; j++) {
                    if (llibres[j]=='M') {
                        llibres[i] = 'M';
                        llibres[j] = 'P';
                        result++;
                        break;
                    }
                }
            }
            
        }

        /*
        for (int i = 0; i<llibres.length; i++) {
            System.out.print(llibres[i]);
        }
        System.out.println();
        */

        System.out.println(result);

    }
}