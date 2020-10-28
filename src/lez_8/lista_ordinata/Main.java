package lez_8.lista_ordinata;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int numElem;
        int newElem;
        int scelta = 10;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Quanti elementi vuoi inserire nella lista?");
        numElem = sc.nextInt();
        int[] arrayNumeri = new int[numElem];

        ListaOrdinata lista = new ListaOrdinata(arrayNumeri);

        while(scelta != 0){
            System.out.println("\n*** LISTA ORDINATA ***\n");
            System.out.println("1 - Inserire un nuovo elemento");
            System.out.println("2 - Mostra la lista");
            System.out.println("3 - Inserisci elemento");
            System.out.println("4 - Ricerca");
            System.out.println("5 - Elimina elemento");
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

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    //IndexOF e sposto l'array di un elemento indietro

                    break;
                case 6:
                    break;
                default:
                    System.out.println("*** FINE PROGRAMMA ***");
            }
        }



        for(int j=0; j<arrayNumeri.length; j++){
            System.out.println("Inserire elemento ["+j+"]");
            arrayNumeri[j] = sc.nextInt();
        }

        System.out.println("Stampa lista disordinata: ");
        System.out.println(Arrays.toString(arrayNumeri));

    }

}
