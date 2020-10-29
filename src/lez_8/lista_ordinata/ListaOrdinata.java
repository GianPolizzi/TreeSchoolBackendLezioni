package lez_8.lista_ordinata;

import java.util.Arrays;

public class ListaOrdinata {

    private Integer[] lista;
    private int count = 0;

    public ListaOrdinata(Integer[] arrayLista){
        this.lista = arrayLista;
    }

    public void showLista(Integer[] array){
        System.out.println(Arrays.toString(array));
    }

    public void espandiLista(){
        Integer[] arrayEsp = new Integer[lista.length * 2];
        for(int i=0; i<count; i++){
            arrayEsp[i] = lista[i];
        }
        lista = arrayEsp;
    }

    public void insertLista(int newElem){
        if(count == lista.length){
            System.out.println("Devo espandere la lista!");
            espandiLista();
            System.out.println(Arrays.toString(lista));
        }
        boolean presente = false;
        for(int i=0; i<lista.length; i++){
            if(lista[i] == null){
                lista[i] = newElem;
                presente = true;
                count++;
                System.out.println("L'elemento è stato inserito!");
                break;
            }
            else if(newElem < lista[i]){
                for(int j=lista.length-1; j>i; j--){
                    //Sposto a destra l'array
                    lista[j] = lista[j-1];
                }
            //Inserisco l'elemento nuovo
            lista[i] = newElem;
            System.out.println("L'elemento è stato inserito (Array ordinato)!");
            presente = true;
            count++;
            break;
            }
        }
        if(!presente){
            System.out.println("LISTA PIENA! L'elemento non può essere inserito!");
        }
    }


    public void indexOf(int elem){

    }

    public void remove(int elem){

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
