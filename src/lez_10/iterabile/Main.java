package lez_10.iterabile;

public class Main {

    public static void main(String[] args) {

        /*
        int[] elementi = new int[]{5, 7};
        ListaDiInteri lista = new ListaDiInteri(elementi);

        checkLista(lista);
        lista.reset();
        checkLista(lista);


        String s = "ab";
        MiaStringa miaStringa = new MiaStringa(s);

        checkStringa(miaStringa);
        miaStringa.reset();
        checkStringa(miaStringa);
    }

    private static void checkStringa(Iterabile stringa){

        if (stringa.hasNext())
            System.out.println("OK");
        else
            System.out.println("ERRORE");


        if ((char)stringa.next() == 'a')
            System.out.println("OK");
        else
            System.out.println("ERRORE");


        if ((char)stringa.next() == 'b')
            System.out.println("OK");
        else
            System.out.println("ERRORE");


        if (!stringa.hasNext())
            System.out.println("OK");
        else
            System.out.println("ERRORE");
    }


    private static void checkLista(Iterabile lista){

        if (lista.hasNext())
            System.out.println("OK");
        else
            System.out.println("ERRORE");


        if ((int)lista.next() == 5)
            System.out.println("OK");
        else
            System.out.println("ERRORE");


        if ((int)lista.next() == 7)
            System.out.println("OK");
        else
            System.out.println("ERRORE");


        if (!lista.hasNext())
            System.out.println("OK");
        else
            System.out.println("ERRORE");
    }

    */

        //LISTA

        ListaDiInteri lista = new ListaDiInteri();
        checkListaInteri(lista);

/*
        MiaStringa stringa = new MiaStringa();
        checkMiaStringa(stringa);

 */

    }


    private static void checkMiaStringa(Lista stringa){
        System.out.println(stringa.size() == 0 ? "OK" : "ERRORE");

        stringa.add('a');
        System.out.println(stringa.size() == 1 ? "OK" : "ERRORE");

        System.out.println((char)stringa.get(0) == 'a' ? "OK" : "ERRORE");

        stringa.add('b');
        stringa.add('c');

        System.out.println(stringa.remove(0) ? "OK" : "ERRORE");

        System.out.println(stringa.contains('b') ? "OK" : "ERRORE");
        System.out.println(!stringa.contains('d') ? "OK" : "ERRORE");

        stringa.clear();

        System.out.println(stringa.size() == 0 ? "OK" : "ERRORE");

        System.out.println(!stringa.contains('a') ? "OK" : "ERRORE");
    }

    private static void checkListaInteri(Lista lista){
        System.out.println(lista.size() == 0 ? "OK" : "ERRORE");

        lista.add(5);
        System.out.println(lista.size() == 1 ? "OK" : "ERRORE");

        System.out.println((int)lista.get(0) == 5 ? "OK" : "ERRORE");

        lista.add(10);
        lista.add(40);

        System.out.println(lista.remove(1) ? "OK" : "ERRORE");

        System.out.println(lista.contains(40) ? "OK" : "ERRORE");
        System.out.println(!lista.contains(56) ? "OK" : "ERRORE");

        lista.clear();

        System.out.println(lista.size() == 0 ? "OK" : "ERRORE");

        System.out.println(!lista.contains(5) ? "OK" : "ERRORE");
    }

}
