package lez_1;

public class ManipolazioneStringhe {
    //Forma d'inizializzazione detta "String literal"
    String titolo = "Manipolazione delle stringhe";
    String paragrafo = "Qualsiasi cosa";

    //METODI UTILI

    //Lunghezza di una stringa
    int lunghezza = titolo.length();

    //Accedere ai singoli caratteri della stringa
    char m = titolo.charAt(0);
    char n = titolo.charAt(2);

    //Convertire stringa in array di char
    char[] strchar = titolo.toCharArray();

    //Estrarre una sottostringa ("delle stringhe") --> Legge a partire da 14
    String a = titolo.substring(14);
    //Estrarre una sottostringa ("pola") --> Legge a partire da 4 fino a 7 incluso
    String b = titolo.substring(4,7);

    //Stringa che contiene la sequenza dei caratteri specificati
    boolean bool1 = titolo.contains("delle");

    //Confrontare stringa con un oggetto specificato
    boolean bool2 = titolo.equals(paragrafo);

    //Resistuisce true se la stringa è vuota (0 caratteri)
    boolean bool3 = titolo.isEmpty();

    //Suddivide la stringa intorno ad ogni occorrenza specificata come argomento e restituisce un array con le sottostringhe
    String[] split = titolo.split(" "); //Array di 3 stringhe

    //Ritorna una copia della stringa di partenza eliminando tutti gli spazi bianchi all'inizio ed alla fine della stringa
    String trim = titolo.trim();
}