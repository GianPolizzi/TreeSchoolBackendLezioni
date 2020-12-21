package lez_5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Algoritmo di ordinamento semplice che fa emergere per primi in numeri maggiori dell'array (come le bolle)
 *
 * 1-Confronto il primo elemento con il secondo
 * 2-Se primo > secondo inverte i 2 elementi
 * 3-Operazione ripetuta N-1 volte fino a portare l'elemento maggiore a destra dell'array;
 * 4-Si mette un segnale per non conteggiare più l'ultimo elemento che è già ordinato;
 * 5-Si ripetono i passi (1) (2) (3) (4) fino ad ordinare tutti gli elementi
 *
 * COMPLESSITA' PER NUMERO DI CONFRONTI
 * - caso peggiore e medio : O(n^2)
 * - caso migliore : O(n)               [vettore parzialmente ordinato]
 *
 * COMPLESSITA' PER SCAMBI
 * - caso peggiore e medio : O(n^2)
 * - caso migliore : O(1)
 */

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire numeri interi (separati dalla virgola): ");
        String a = sc.nextLine();

        int[] array = parseNumbers(a);
        System.out.println("Array inserito: "+Arrays.toString(array));

        bubbleSort(array);
    }

    //CONVERTO LA STRINGA IN ARRAY DI INTERI
    static int[] parseNumbers(String s) {
        //inserite qui il vostro codice
        String[] str = s.split(",");
        int[] arrayInteri = new int[str.length];
        for(int i=0; i<str.length; i++){
            //Converto il valore
            arrayInteri[i] = Integer.parseInt(String.valueOf(str[i]));
        }
        return arrayInteri;
    }

    //BUBBLESORT
    public static void bubbleSort(int[] array){
        for(int i=0; i<array.length; i++){
            boolean scambiato = false;
            for(int j=0; j<array.length-1; j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    scambiato = true;
                    System.out.println("Elemento "+array[j+1]+" scambiato con "+array[j]);
                }
                System.out.println("Array: "+Arrays.toString(array));
            }
            if(!scambiato) break;
        }
    }
}
