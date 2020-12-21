package lez_5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Algoritmo ricorsivo "Dividi et Impera" più complesso ma molto efficiente
 * A differenza del QuickSort richiede molto più spazio in memoria ma richiede sempre meno tempo
 *
 * 1-Divido l'array in 2 parti uguali (senza permutare);
 * 2-Ordino ricorsivamente le 2 parti;
 * 3-Ripeto la (1) e (2) fino a quando i vari array formati non saranno ordinati;
 * 4-Fondo (Merge) le 2 parti ordinate di ogni array;
 *
 * Complessità : T(n) = 2T(n/2) + O(n) = O(n * log(n) )
 */

public class MergeSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire dimensione dell'array: ");
        int dim = sc.nextInt();
        int[] array = new int[dim];

        //Riempio l'array
        for(int i=0; i<array.length; i++){
            System.out.println("Inserire elemento ["+i+"]: ");
            array[i] = sc.nextInt();
        }
        System.out.println("Array riempito: "+ Arrays.toString(array));
        //Ordino l'array
        mergeSort(array);
    }

    //Metodo principale (ricorsivo)-> Complessità logaritmica : O(n*log(n))
    private static int[] mergeSort(int[] arr){
        //Se l'array ha un solo elemento è gia ordinato
        if(arr.length == 1){
            return arr;
        }
        //Funzioni ricorsive
        int[] arrayDestro = mergeSort(dividiArray(arr,arr.length/2, arr.length));

        int[] arraySinistro = mergeSort(dividiArray(arr,0, arr.length/2));

        return unisciArray(arrayDestro, arraySinistro);
    }

    //DIVIDI ARRAY
    private static int[] dividiArray(int[] a, int inizio, int fine){
        int[] nuovoArray = new int[fine - inizio];

        for(int i=0; i<nuovoArray.length; i++){
            nuovoArray[i] = a[inizio+i];
        }
        System.out.println("Funzione dividi: "+Arrays.toString(nuovoArray));
        return nuovoArray;
    }

    //MERGE (Fusione) Complessità lineare : O(n)
    private static  int[] unisciArray(int[] a1, int[] a2){
        int[] arrayUnito = new int[a1.length + a2.length];
        int i=0;
        int j=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]<a2[j]){
                arrayUnito[i+j] = a1[i];
                i++;
            }
            else{
                arrayUnito[i+j] = a2[j];
                j++;
            }
        }
        if(i<a1.length){
            for(int k=i; k<a1.length; k++){
                arrayUnito[k+j] = a1[k];
            }
        }
        if(j<a2.length){
            for(int k=j; k<a2.length; k++){
                arrayUnito[k+i] = a2[k];
            }
        }
        System.out.println(Arrays.toString(arrayUnito));
        return arrayUnito;
    }
}