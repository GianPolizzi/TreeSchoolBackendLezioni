package lez_10.collection;

import java.util.*;

/**
 * Input -> Lista di interi duplicati
 * Output -> Mappa interi con coppie ordinate <Key = numero, Value = ricorrenza>
 */

public class ListToMap {

    /**
     * Inserisco elementi nella lista
     */
    public static void insertLista(List<Integer> lista){
        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(2);
        lista.add(3);
        lista.add(3);
        lista.add(3);
        lista.add(3);
        lista.add(4);
        lista.add(4);
        lista.add(5);
    }

    /**
     * Metodo con Iterator per mostrare la lista
     */
    public static void showLista(List<Integer> lista){
        Iterator<Integer> iter = lista.iterator();
        System.out.println("Lista Interi");
        while (iter.hasNext()){
            Integer num = (Integer) iter.next();
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

    /**
     * Metodo con Iterator per mostrare la lista (più semplice)
     */
    public static void showListaAlter(List<Integer> lista){
        for (Integer elem : lista) {
            System.out.println("Elemento: " + elem);
        }
    }

    /**
     * Metodo con Iterator per contare le occorrenze: Lista -> Mappa
     */
    public static Map<Integer, Integer> contaDuplicati(List<Integer> lista){
        Map<Integer, Integer> mappa = new HashMap<Integer, Integer>();
        Iterator<Integer> iter = lista.iterator();
        while (iter.hasNext()){
            Integer num = (Integer) iter.next();
            if(mappa.get(num) == null){
                mappa.put(num, 1);
            }
            else{
                mappa.put(num, mappa.get(num)+1);
            }
        }
        return mappa;
    }

    /**
     * Metodo per contare le occorrenze (più semplice): Lista -> Mappa
     */
    public static Map<Integer, Integer> contaDuplicatiAlter(List<Integer> lista){
        Map<Integer, Integer> mappa = new HashMap<Integer, Integer>();
        for (Integer elem : lista){
            mappa.merge(elem, 1, Integer::sum);
        }
        return mappa;
    }

    public static void showMappa(Map<Integer, Integer> mappa){
        System.out.println("Mappa Interi e ricorrenze");
        for(Map.Entry<Integer,Integer> entry : mappa.entrySet()){
            System.out.println("Key (numero) = " + entry.getKey() + ", Value (ricorrenza) = " + entry.getValue());
        }
    }

    public static void main(String[] args){
        List<Integer> listaInteri = new ArrayList<Integer>();
        Map<Integer, Integer> mappaInteri = new HashMap<Integer, Integer>();

        insertLista(listaInteri);
        showLista(listaInteri);
        //showMappa(contaDuplicati(listaInteri));
        showMappa(contaDuplicatiAlter(listaInteri));

    }
}