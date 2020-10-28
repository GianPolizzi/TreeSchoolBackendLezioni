package lez_8.biblioteca;

import java.util.Arrays;

public class Biblioteca {

    private int[] elenco;

    //Costruttore
    public Biblioteca(int[] el){
        //In creazione ordino subito l'elenco
        this.elenco = mergeSort(el);
    }

    public boolean esisteLibro(int indice){
        for(int i=0; i<elenco.length; i++){
            if(indice == elenco[i]){
                System.out.println("Esiste il libro con indice: "+indice);
                return true;
            }
        }
        return false;
    }

    public int[] getIndiciLibriOrdinati(){
        return elenco;
    }


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

    private static int[] dividiArray(int[] a, int inizio, int fine){
        int[] nuovoArray = new int[fine - inizio];

        for(int i=0; i<nuovoArray.length; i++){
            nuovoArray[i] = a[inizio+i];
        }
        System.out.println("Funzione dividi: "+ Arrays.toString(nuovoArray));
        return nuovoArray;
    }

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
