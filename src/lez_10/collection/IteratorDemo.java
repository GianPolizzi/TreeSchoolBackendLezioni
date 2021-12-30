package lez_10.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

    public static void main(String args[]) {
        // Creo un array list
        ArrayList lettere = new ArrayList();

        // aggiungo elementi all'array list
        lettere.add("C");
        lettere.add("A");
        lettere.add("E");
        lettere.add("B");
        lettere.add("D");
        lettere.add("F");

        // Istanzio l'oggetto iterator per mostrare il contenuto dell'array list lettere
        System.out.print("Contenuto originale dell'array lettere: ");
        Iterator itrlett = lettere.iterator();

        while(itrlett.hasNext()) {
            Object element = itrlett.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Modifico gli oggetti prima di iterarli
        ListIterator litr = lettere.listIterator();

        while(litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + "+");
        }
        System.out.print("Contenuto modificato dell'array lettere: ");
        itrlett = lettere.iterator();

        while(itrlett.hasNext()) {
            Object element = itrlett.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Adesso mostro la lista invertita
        System.out.print("Contenuto modificato ed invertito dell'array lettere: ");

        while(litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
