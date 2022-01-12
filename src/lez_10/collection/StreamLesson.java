package lez_10.collection;

import java.text.DateFormatSymbols;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.*;

public class StreamLesson {

    public static void main(String[] args){

        /**
         * Lo Stream può essere creato a partire da:
         * - Array;
         * - Serie di elementi;
         * - Collection;
         *
         * Importante specificare la tipizzazione dello Stream altrimenti verra creato automaticamene uno
         * Stream<Object>
         */

        // Creazione Array -> Stream
        String[] coloriArray = new String[]{"bianco", "rosso", "giallo", "blu", "verde"};
        Stream<String> streamColorArray = java.util.Arrays.stream(coloriArray);

        // Creazione Stream da una lista di elementi
        Stream<String> streamColorLista = Stream.of("bianco", "rosso", "giallo", "blu", "verde");

        // Creazione Collection -> Stream
        Collection<String> coloriList = java.util.Arrays.asList(coloriArray);
        Stream<String> streamColorCollection = coloriList.stream();

        // Creazione Stream vuoto
        Stream<String> streamVuoto = Stream.empty();


        /**
         * BUILDER: In questo modo si andranno ad inserire i valori desiderati uno alla volta
         */
        Stream<String> streamBuild = Stream.<String>builder().add("bianco").add("rosso").add("giallo").build();
        streamBuild = Stream.<String>builder().add("blu").add("verde").build();

        /**
         * GENERATE: Il metodo generate() accetta un Supplier<T> per la generazione degli elementi
         * Va ricordato che verrà generato uno stream di lunghezza infinita quindi sta al programmatore impostare
         * un limite, raggiunto il quale la generazione verrà interrotta
         */
        Stream<Double> streamRandom = Stream.generate(new java.util.Random()::nextDouble).limit(10);

        /**
         * ITERATE: Verrà creato uno Stream di 10 numeri pari che parte dal primo parametro 2 ed arriva a 20
         */
        Stream<Integer> streamNumeriPari = Stream.iterate(2, n -> n + 2).limit(10);

        /**
         * Non essendo possibile tipizzare lo Stream con tipi primitivi, ma solo con tipi oggetto, Java 8 mette
         * a disposizione 3 Interfacce:
         * - IntStream;
         * - LongStream;
         * - DoubleStream;
         *
         * range(int startInclusive, int endExclusive) inlcude l'elemento di partenza ed esclude quello  arrivo
         * rangeClosed(int startInclusive, intInclusive) include entrambi i parametri
         */
        IntStream intStream = IntStream.range(1, 10);
        LongStream longStream = LongStream.range(1, 10);
        DoubleStream doubleStream = intStream.asDoubleStream();

        /**
         * STRINGHE: Per generare stringhe vale la pena ricordare che anche la classe java.util.regex.Pattern può
         * essere molto utile per generare degli stream dato che è stato aggiunto il metodo splitAsStream()
         */
        // Crea uno stringa che poi viene suddivisa in 5 parti
        Stream<String> stringStream = Pattern.compile(",").splitAsStream("bianco,rosso,giallo,blu,verde");


        /**
         * OPERAZIONI SUGLI STREAM
         * Le operazioni eseguibili sono di 2 tipi:
         * - Intermediate Operation = quelle operazioni che danno come risultato uno Stream<T>, concatenabili.
         *   Sono lazy, quindi vengono eseguite solo se necessarie al fine di eseguire una Terminal Operation.
         * - Terminal Operation = quelle operazioni che restituiscono un tipo definito.
         */

        // Genero uno Stream con lo Stringhe passate come parametro
        Stream.of("verde", "bianco", "rosso", "verde", "giallo", "blu", "verde")
                // intermediate operation -> restituisce lo stream rimuovendo gli elementi uguali (usa equals())
                .distinct()
                // intermediate operation -> ordina naturalmente lo stream (alfabetico)
                .sorted()
                // terminal operation -> restituisce tutti gli elementi in un oggetto di tipo List
                .collect(Collectors.toList());


        /**
         * ITERATING & MATCHING
         * L'aspetto più conosciuto degli Stream è quello di poter semplificare il codice quando si tratta di
         * eseguire cicli e filtri che a volte rendono tutto pesante da vedere e prolisso
         */

        // Data una lista di numeri viene restituito true se esiste un numero > 0, false altrimenti
        List<Integer> numbers = Arrays.asList(-2,0,10,15,3,-6);

        // Senza stream
        System.out.println("*** Senza stream ***");
        for(Integer i : numbers){
            if(i>0){
                System.out.println(true);
            }
            else System.out.println(false);
        }

        // Con stream
        System.out.println("*** Con stream ***");
        boolean resultAny = numbers.stream().anyMatch(numb -> numb > 0);
        boolean resultAll = numbers.stream().allMatch(numb -> numb > 0);
        boolean resultNone = numbers.stream().noneMatch(numb -> numb > 0);
        System.out.println("Esiste almeno un numero che verifica la condizione? " + resultAny);
        System.out.println("Tutti i numeri verificano la condizione? " + resultAll);
        System.out.println("Tutti i numeri non verificano la condizione? " + resultNone);


        /**
         * FILTERING
         * Il metodo filter() consente di escludere tutti gli elementi che non soddisfano il Predicate
         * Essendo una Intermediate Operation può essere usata più volte per eseguire filtri in serie.
         */

        // Data una lista di Integer vogliamo avere solo quelli non nulli, > 0 e pari
        List<Integer> numeriInteri = Arrays.asList(-2, 0, null, 10, 15, 3, -6, 12);

        // Senza lo Stream
        ListIterator<Integer> iter = numeriInteri.listIterator();
        /*
        while(iter.hasNext()){
            Integer numero = iter.next();
            if(numero == null || numero <= 0 || numero % 2 != 0){
                iter.remove();
            }
        }
        */

        // Con lo Stream
        System.out.println("\n Filtro i numeri non nulli, maggiori di zero e pari: ");
        numeriInteri.stream()
                .filter(Objects::nonNull)
                .filter(numero -> numero > 0)
                .filter(numero -> numero % 2 == 0)
                .forEach(System.out::println);
        ;


        /**
         * MAPPING
         * I metodi di mapping consentono di poter applicare una funzione all'elemento dello Stream per trasformarlo in
         * altro
         */

        // Utilizzo uno Stream di Integer dove ogni elemento rappresenta il numero del mese, mentre il metodo
        // map() eseguirà la conversione da numero a parola
        // NB: in Java i mesi partono da: 0 (Gennaio) a: 11 (Dicembre)
        Stream<Integer> mesiIntStream = Stream
                .iterate(0, n -> n + 1)
                .limit(12);
        Stream<String> mesiStringStream = mesiIntStream
                .map(numb -> new DateFormatSymbols().getMonths()[numb]);

        //Stampare lo stream
        mesiStringStream.forEach(System.out::println);


        /**
         * COLLECTORS
         * Cosa me ne faccio dello Stream dopo aver eseguito le operazioni che m'interessano?
         * Semplice, lo converto nuovamente nel tipo che m'interessa, a tal proposito Java 8 ha messo a disposizione
         * la classe Collectors che ci offre una serie di metodi per la soluzione dei casi più gettonati
         */

        // List e Set di colori che contengono la lettera 'b'
        List<String> listColori = streamColorCollection.filter(colore -> colore.contains("b"))
                .collect(Collectors.toList());
        Set<String> setColori = streamColorCollection.filter(colore -> colore.contains("b"))
                .collect(Collectors.toSet());

        // String
        String colori = streamColorLista.filter(colore -> colore.contains("b"))
                .collect(Collectors.joining(","));

        // Map
        Map<Integer, List<String>> mapColori = streamColorCollection
                .collect(Collectors.groupingBy(String::length));
    }
}
