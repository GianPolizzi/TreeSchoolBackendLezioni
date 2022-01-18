package lez_10.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * L'interfaccia Map<K,V> è usata per immagazzinare le associazioni tra una Key ed un Value.
 * Di solito è utilizzato per mantenere in memoria basi di dati.
 * La classe HashMap<K,V> è una classe standard di libreria che implementa una mappa.
 */
public class Mappe {

    /**
     * .put(Key, Value)
     * Inserisco una coppia chiave / valore nella mappa
     */
    public static void aggiungiElemMappa(Map<Integer, String> mappa){
        mappa.put(1, "Alta priorità");
        mappa.put(2, "Media priorità");
        mappa.put(3, "Bassa priorità");
    }

    public static void main(String[] args){
        System.out.println("***** MAP *****");
        Map<Integer, String> mappa = new HashMap<Integer, String>();
    }
}
