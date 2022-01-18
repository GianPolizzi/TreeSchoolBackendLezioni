package lez_10.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Analizziamo l'utilizzo degli Stream introdotti con la versione Java 8 a supporto del Collection Framework
 * L'oggetto principale attorno al quale ruota tutto è rappresentato dall'interfaccia Stream<T> che comprende
 * un insieme di classi per gestire sequenze di elementi.
 *
 * Lo Stream può essere creato a partire da:
 * - Array;
 * - Serie di elementi;
 * - Collection;
 */

public class StreamDemo {

    // Definisco una Lista di Stringhe (colori)
    public static List<String> listaColori = new ArrayList<String>();

    // Definisco uno stream per la lista colori precedente
    public Stream<String> streamListaColori = listaColori.stream();



    // OPERAZIONI DI CONFIGURAZIONE

    /**
     * FILTRAGGIO: si utilizza il metodo filter() che riceve in ingresso un oggetto che implementa l'interfaccia
     * java.util.function.Predicate il quale definisce un solo metodo con signature boolean test(T t) che riceve in
     * ingresso un item della collezione e determina se filtrarlo o meno.
     */
    Stream<String> streamFiltrato = streamListaColori.filter(new Predicate<String>() {
        @Override
        public boolean test(String s) {
            // Filtro tutte le stringhe che iniziano con B
            return s.startsWith("B");
        }
    });
    // L'operazione è solo configurata e non sarà eseguita fino all'applicazione di un metodo di elaborazione

    /**
     * MAPPING: consiste nel mappare gli oggetti della collezione in altri oggetti da essi derivati. Per tale scopo
     * l'oggetto Stream espone il metodo map() che riceve in ingresso un oggetto che implementa l'interfaccia
     * java.util.function.Function -> definisce il metodo apply() che esegue il lavoro di mapping vero e proprio
     */
    Stream<Integer> streamMappato = streamFiltrato.map(new Function<String, Integer>() {
        @Override
        public Integer apply(String s) {
            // Ogni colore è mappato in un intero che rappresenta tutta la lunghezza della stringa
            return s.length();
        }
    });
    // L'operazione è solo configurata e non sarà eseguita fino all'applicazione di un metodo di elaborazione


    /**
     * LIMIT: Riduce la dimensione dello stream ad un valore massimo specificato eliminando gli item in eccesso
     */
    Stream<Integer> streamLimitato = streamMappato.limit(2);


    /**
     * SORTED: Ordina lo stream e può essere utilizzato senza parametri, quindi l'ordinamento sarà quello naturale
     * associato al tipo di elementi usati oppure può accettare un oggetto di tipo Comparator
     */
    Stream<String> streamOrdinato = streamListaColori.sorted(new Comparator<String>() {
         @Override
         public int compare(String colore1, String colore2) {
             //return Integer.compare(colore1.length(),colore2.length());
             return Integer.valueOf(colore1.length()).compareTo(Integer.valueOf(colore2.length()));
         }
     }
    );


    // OPERAZIONI DI ELABORAZIONE

    /**
     * COLLECT: principale operazione di elaborazione, che riceve in input un oggetto Collector. Tale oggetto
     * è utilizzato per combinare elementi appartenenti ad uno stream. Alcuni esempi di operazioni sono:
     *
     * - inserimento degli elementi in una nuova lista;
     * - inserimento degli elementi in un set;
     * - conversione degli elementi in stringhe e concatenazione;
     * - raggruppamento degli elementi;
     * - calcolo della somma dei valori assunti da una proprietà degli elementi;
     * - partizionamento degli elementi.
     *
     * Collectors espone molti metodi statici, lasciando all'utente la libertà d'implementare il proprio Collector
     */

    // Inserimento in una nuova lista
    public void insertElemInNewList(){
        streamMappato.collect(Collectors.toList());
    }

    // Inserimento in una mappa
    public void insertElemInNewMap(){
        streamMappato.collect(Collectors.toSet());
    }

    // Concatenamento
    public void concatenamento(){
        streamFiltrato.collect(Collectors.joining(", "));
    }


    /**
     * MIN / MAX: restituiscono il valore minimo o massimo tra gli elementi presenti nello stream
     * I due operatori richiedono in input un oggetto java.util.Comparator e restituiscono un oggetto
     * java.util.Optional che è un oggetto contenitore che può o meno contenere un valore nullo
     */

    // Trova Max
    public void trovaMax(Stream streamMappato){
        streamMappato.max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
    }

    /**
     * COUNT: restituisce il numero (long) di elementi nello stream dopo che è stato filtrato
     */

    public Long getNumeroElementiStream(){
        return streamFiltrato.count();
    }

    /**
     * REDUCE: consente di ridurre gli elementi di uno stream in un singolo oggetto. Il metodo reduce() richiede
     * come parametro di input un oggetto che implementa l'interfaccia BinaryOperator la quale definisce il metodo
     * apply() -> la signature prevede in input un parametro accumlatore ed un item dello stream. In output
     * restituirà un oggetto Optional, ma nel caso sia vuoto restituirà null
     */

    public void getStreamRidotto(){
        streamMappato.reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer accumulatore, Integer item) {
                return accumulatore + item;
            }
        });
    }



    public static void main(String[] args){

        riempiListaColori();

        visualizzaListaColori();

    }


    // Riempio la lista colori
    public static void riempiListaColori(){
        listaColori.add("Bianco");
        listaColori.add("Rosso");
        listaColori.add("Giallo");
        listaColori.add("Blu");
        listaColori.add("Verde");
    }

    public static void visualizzaListaColori(){
        for (String colore : listaColori){
            System.out.print("\n Colore: " + colore);
        }

    }


}
