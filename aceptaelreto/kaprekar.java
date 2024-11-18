// Esquema de la entrada: número de casos
import java.util.*;

public class kaprekar {

    static Scanner in;

    public static void casoDePrueba() {
        //demanar numero i iniciar resultat (count)
        int num = in.nextInt();
        int count = 0;
        //repetir fins que num sigui 6174
        while (num!=6174){
            //inicialitzar totes les variables
            int[] arrInicial = new int[4];
            int numDesce = 0;
            int numAsce = 0;
            int temp = num;
            //omplir array Inicial amb els digits de num
            for (int i = 3; i>=0; i--){
                arrInicial[i] = temp%10;
                temp = temp/10;
            }
            //si tots els digits son iguals, retornar 8
            if (arrInicial[0]==arrInicial[1] && arrInicial[0]==arrInicial[2] && arrInicial[0]==arrInicial[3]){
                count = 8;
                num = 6174;
            }
            //sino, fes tot el programa
            else {
                //inicialitza arrays ascendent i descendent com a copies de 
                //l'array inicial
                int[] arrDesce = Arrays.copyOf(arrInicial, 4);
                int[] arrAsce = Arrays.copyOf(arrInicial, 4);
                //ordenar ascendent i descendent
                Arrays.sort(arrAsce);
                for (int i = 0; i<4; i++){
                    arrDesce[i]=arrAsce[arrAsce.length-i-1];
                }
                //passar els arrays a numeros (int)
                int posicio = 1000;
                for (int i = 0; i<4; i++){
                    numAsce = numAsce + arrAsce[i]*posicio;
                    posicio = posicio/10;
                }
                posicio = 1000;
                for (int i = 0; i<4; i++){
                    numDesce = numDesce + arrDesce[i]*posicio;
                    posicio = posicio/10;
                } 
                //calcular el seguent nombre i sumar 1 al contador
                num = numDesce - numAsce;
                count ++;
            }
        }
    //imprimir resultat
    System.out.println(count);
    
    } // casoDePrueba

public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    int numCasos = in.nextInt();
    for (int i = 0; i < numCasos; i++)
        casoDePrueba();

    } // main

} // class kaprekar

