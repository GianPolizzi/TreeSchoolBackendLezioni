package lez_5;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire numeri interi (separati dalla virgola): ");
        String a = sc.nextLine();

        int[] array = parseNumbers(a);

        quickSort(array, 0, array.length-1);
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

    //QUICKSORT
    //La complessità dell'algoritmo dipende dal PARTITION
    public static void quickSort(int[] array, int primo, int ultimo){
        System.out.println("Array = " + Arrays.toString(array));
        if(primo<ultimo){
            int pivot = dividiArray(array, primo, ultimo);
            quickSort(array, primo, pivot-1);
            quickSort(array, pivot+1, ultimo);
        }
    }

    //PARTITION
    //Caso peggiore: O(n^2)         [Se si sceglie come Pivot l'elemento più grande o più piccolo]
    //Caso migliore: O(n*log(n))
    public static int dividiArray(int[] array, int primo, int ultimo){
        int pivot = array[ultimo];
        System.out.println("Pivot: "+pivot);
        int i = primo-1;
        for(int j=primo; j<ultimo; j++){
            if(array[j] <= pivot){
                System.out.println("Il numero: "+array[j]+" è <= del pivot");
                i++;
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
            else{
                System.out.println("Il numero: "+array[j]+" è > del pivot");
                System.out.println("Scambio "+array[j]+" con "+pivot);
            }
        }
        int tmp = array[i+1];
        array[i+1] = array[ultimo];
        array[ultimo] = tmp;
        return i+1;
    }
}
