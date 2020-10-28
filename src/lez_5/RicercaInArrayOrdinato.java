package lez_5;

import java.util.Arrays;
import java.util.Scanner;

public class RicercaInArrayOrdinato {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire numeri interi (separati dalla virgola): ");
        String a = sc.nextLine();

        System.out.println("Inserire numero da ricercare all'interno dell'array: ");
        int num = sc.nextInt();

        int[] arrayInteri = parseNumbers(a);
        ordinaArray(arrayInteri);
        cercaElemento(arrayInteri, num);

        ricercaBinaria(arrayInteri, num);

    }

    //CONVERTO LA STRINGA IN ARRAY DI INTERI
    static int[] parseNumbers(String s) {
        //inserite qui il vostro codice
        String[] str = s.split(",");
        System.out.println("Array inserito: "+Arrays.toString(str));
        int[] arrayInteri = new int[str.length];
        for(int i=0; i<str.length; i++){
            //Converto il valore
            arrayInteri[i] = Integer.parseInt(String.valueOf(str[i]));
        }
        return arrayInteri;
    }

    //ORDINO L'ARRAY IN MODO CRESCENTE
    static void ordinaArray(int[] values) {
        //inserite qui il vostro codice
        for(int i=0; i<values.length; i++){
            boolean flag = false;
            for(int j=0; j<values.length-1; j++){
                //Se l' elemento j e maggiore del successivo allora scambio i valori
                if(values[j]>values[j+1]) {
                    int k = values[j];
                    values[j] = values[j+1];
                    values[j+1] = k;
                    flag = true; //Lo setto a true per indicare che é avvenuto uno scambio
                }
            }
            if(!flag) break; //Se flag=false allora vuol dire che nell' ultima iterazione
            //non ci sono stati scambi, quindi il metodo può terminare
            //poiché l' array risulta ordinato
        }
        System.out.println("\nArray ordinato: "+Arrays.toString(values));
    }

    //CERCO ELEMENTO ALL'INTERNO DELL'ARRAY
    private static void cercaElemento(int[] array, int elem){
        System.out.println("\n*** Ricerca normale ***");
        for(int i=0; i<array.length; i++){
            if(array[i] == elem){
                System.out.println("Elemento "+elem+" trovato alla posizione ["+i+"]");
            }
        }
    }

    //CERCO ELEMENTO ALL'INTERNO DELL'ARRAY CON "RICERCA BINARIA"
    private static int ricercaBinaria(int[] array, int elem){
        System.out.println("\n*** Ricerca binaria ***");
        return ricercaBin(array, elem, 0, array.length-1);
    }

    private static int ricercaBin(int[] array, int elem, int inizio, int fine){
        //Se l'elemento non viene trovato
        if(inizio > fine){
            System.out.println("Elemento: "+elem+ " inesistente!");
            return -1;
        }
        //Divido in 2 parti l'array
        int centro = (inizio + fine)/2;
        //Se l'elemento centrale = elemento cercato
        if(array[centro] == elem){
            System.out.println("Elemento: "+elem+" trovato alla posizione ["+centro+"]");
            return centro;
        }

        if(array[centro] < elem){
            return ricercaBin(array, elem, centro+1, fine);
        }
        else{
            return  ricercaBin(array, elem, inizio, centro-1);
            }
    }
}
