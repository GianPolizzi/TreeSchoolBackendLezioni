package lez_10.collection;

import java.util.*;

/**
 * Le interfacce principali di tipo Collezione sono 3:
 * - Collection<T>
 * - Set<T>    (estende Collection<T>): non ammette elementi ripetuti e non ordina i propri elementi
 * - List<T>   (estende Collection<T>): ammette elementi ripetuti ed ordina i propri elementi
 *
 * Le classi di libreria solitamente impiegate per usare ed implementare queste interfacce sono 2:
 * - HashSet<T>     (implementa Set<T>)
 * - ArrayList<T>   (implementa List<T>)
 */
public class Collezioni {

    /**
     * ".add"
     * Se l'elemento da aggiungere non è gia contenuto nel Set viene inserito e sarà restituito true
     * Se l'elemento esiste già nel Set non viene inserito e sarà restituito false
     */
    public static void aggiungiElemSet(Set<String> set){
        set.add("Cravatta");
        set.add("Scarpe");
        set.add("Giacca");
        set.add("Camicia");
        set.add("Giacca"); //Questo non verrà inserito nel Set
    }

    /**
     * Scorre e mostra il set col ciclo forEach
     */
    public static void mostraElementiSet(Set<String> set){
        if(!set.isEmpty()){
            System.out.println("L'array contiene "+set.size()+" elementi:");
            for(String s : set){
                System.out.println(s);
            }
        }
    }

    /**
     * ".add(elemento)"
     * Aggiunge l'elemento alla fine della lista e normalmente restituisce true. Se restituisce false dev'essere
     * successo qualcosa di grave durante l'esecuzione
     */
    public static void aggiungiElemList(List<String> list){
        list.add("Gelato");
        list.add("Spaghetti");
        list.add("Braciole");
        list.add("Frutta");
        list.add("Antipasto");
        list.add("Vino");
    }

    /**
     * ".remove(elemento)"
     * Rimuove l'elemento specificato dalla lista se c'è
     */
    public static List<String> rimuoviElemList(List<String> lista, String elem){
        if(!lista.isEmpty() && lista.contains(elem)){
            lista.remove(elem);
            System.out.println("\nElemento "+elem+ " rimosso!");
        }
        return lista;
    }

    /**
     * ".sort(Comparator.criterio)"
     * Ordina la lista nel modo che specifichiamo entro le parentesi
     */
    public static List<String> ordinaLista(List<String> lista){
        if(!lista.isEmpty()){
            System.out.println("Ordino la lista in ordine alfabetico...");
            lista.sort(Comparator.naturalOrder());
        }
        return lista;
    }

    /**
     * Scorre e mostra lista col ciclo forEach
     */
    public static void mostraLista(List<String> lista){
        if(!lista.isEmpty()){
            System.out.println("La lista contiene "+lista.size()+" elementi:");
            for (String s : lista){
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args){

        System.out.println("***** SET *****");
        Set<String> set = new HashSet<>();
        aggiungiElemSet(set);
        mostraElementiSet(set);

        System.out.println("\n***** LIST *****");
        List<String> lista = new ArrayList<>();
        aggiungiElemList(lista);
        mostraLista(ordinaLista(lista));
        mostraLista(rimuoviElemList(lista,"Frutta"));

    }
}
