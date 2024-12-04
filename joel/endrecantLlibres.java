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
        char temp;
        for (int i = 0; i<llibres.length; i++) {
            if (llibres[i] != 'G') {
                for (int j = i; j<llibres.length; j++) {
                    if (llibres[j]=='G') {
                        temp = llibres[i];
                        llibres[i] = llibres[j];
                        llibres[j] = temp;
                        result++;
                        break;
                    }
                }
            }
            if (llibres[i] == 'P') {
                for (int j = i; j<llibres.length; j++) {
                    if (llibres[j]=='M') {
                        temp = llibres[i];
                        llibres[i] = llibres[j];
                        llibres[j] = temp;
                        result++;
                        break;
                    }
                }
            }
        }

        ///*
        for (int i = 0; i<llibres.length; i++) {
            System.out.print(llibres[i]);
        }
        System.out.println();
        //*/

        System.out.println(result);

    }
}