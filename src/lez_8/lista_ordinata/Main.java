package lez_8.lista_ordinata;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int numElemLista;
        int newElem;
        int elemCercato;
        int elemDaEliminare;
        int scelta = 10;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Quanti elementi vuoi inserire nella lista?");
        numElemLista = sc.nextInt();
        Integer[] arrayNumeri = new Integer[numElemLista];

        ListaOrdinata lista = new ListaOrdinata(arrayNumeri);

        while(scelta != 0){
            System.out.println("\n*** LISTA ORDINATA ***\n");
            System.out.println("1 - Inserire un nuovo elemento");
            System.out.println("2 - Mostra la lista");
            System.out.println("3 - Ricerca tramite elemento");
            System.out.println("4 - Elimina elemento");
            System.out.println("0 - ESCI");

            System.out.println("\nSeleziona un'operazione");
            scelta = sc.nextInt();

            switch (scelta){
                case 1:
                    System.out.println("Digitare elemento da inserire: ");
                    newElem = sc1.nextInt();
                    lista.insertLista(newElem);
                    break;
                case 2:
                    System.out.println("Lista completa: ");
                    lista.showLista();
                    break;
                case 3:
                    System.out.println("Inserire elemento da ricercare: ");
                    elemCercato = sc2.nextInt();
                    lista.indexOf(elemCercato);
                    break;
                case 4:
                    System.out.println("Inserire elemento da eliminare: ");
                    elemDaEliminare = sc3.nextInt();
                    lista.remove(elemDaEliminare);
                    break;
                case 0:
                    scelta = 0;
                    break;
                default:
                    System.out.println("Comando non esistente!");
            }
        }
        System.out.println("*** FINE PROGRAMMA ***");
    }

}
