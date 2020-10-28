package lez_8.minimum_maximum_recursive;

import java.util.Arrays;

public class MaxMin {

    private int[] arrayI;

    public MaxMin(int[] i){
        this.arrayI = i;
    }

    public int getMax(){
        return arrayI[arrayI.length-1];
    }

    public int getMin(){
        return arrayI[0];
    }

    //Algoritmo iterativo per MAX e MIN
    public void calcolaMinMaxIterativo(int[] values){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<values.length; i++){
            if(values[i] > max){
                max = values[i];
            }
            if(values[i] < min){
                min = values[i];
            }
        }
        System.out.println("MAX = "+max);
        System.out.println("Min = "+min);
    }


    public int calcolaMaxRicorsivo(int[] values, int index){
        int max;
        if(values.length-1 == index){
            return values[index];
        }
        return calcolaMaxRicorsivo(values, index+1);
    }


    //Algoritmo ricorsivo complessità O(n*log(n))
    public int[] mergeSort(int[] arr){
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
