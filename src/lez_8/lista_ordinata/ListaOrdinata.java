package lez_8.lista_ordinata;

import java.util.Arrays;

public class ListaOrdinata {

    private Integer[] lista;
    private int count = 0;

    public ListaOrdinata(Integer[] arrayLista){
        this.lista = arrayLista;
    }

    public void showLista(){
        for(int i=0; i<lista.length; i++){
            System.out.println("Elemento ["+i+"] = "+lista[i]);
        }
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
            System.out.println("Espando la lista!");
            espandiLista();
        }
        boolean presente = false;
        for(int i=0; i<lista.length; i++){
            if(lista[i] == null){
                lista[i] = newElem;
                presente = true;
                count++;
                System.out.println("L'elemento "+lista[i]+" è stato inserito!");
                System.out.println("Contatore = "+count);
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

    public int indexOf(int elem){
        System.out.println("\nRicerco l'elemento......");
        return ricercaBin(lista, elem, 0, lista.length-1);
    }


    private static int ricercaBin(Integer[] array, int elem, int inizio, int fine){
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

    public void remove(int elem){
        int limite = 0;
        boolean trovato = false;
        for(int i=0; i<lista.length; i++){
            if(elem == lista[i]){
                trovato = true;
                limite = i;
                lista[i] = null;
                System.out.println("Elemento "+elem+" eliminato!");
                count--;
                break;
            }
        }
        if(trovato){
            for(int j=limite+1; j<lista.length; j++){
                System.out.println("Prima di spostare"+lista[j-1]);
                //Sposto a sinistra l'array
                lista[j-1] = lista[j];
                System.out.println("Dopo aver spostato"+lista[j-1]);
            }
            //Pongo l'ultimo elemento = null;
            lista[lista.length-1] = null;
        }
    }
}
