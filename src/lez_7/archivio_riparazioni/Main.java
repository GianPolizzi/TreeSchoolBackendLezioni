package lez_7.archivio_riparazioni;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Riparazione rip = new Riparazione();
        Tecnico tecnico = new Tecnico();

        String via, numCiv, priorita, nomeTec,cognomeTec;

        Scanner sc = new Scanner(System.in);
        Scanner scV = new Scanner(System.in);
        Scanner scN = new Scanner(System.in);
        Scanner scP = new Scanner(System.in);
        Scanner scNT = new Scanner(System.in);
        Scanner scCT = new Scanner(System.in);
        int scelta = 10;

        //Inizializzo la tabella delle riparazioni;
        rip.inizializzaTabellaRiparazioni();
        rip.showTabellaRiparazioni();

        while(scelta != 0){
            System.out.println("\n*** Programma Ditta Riparazioni ***\n");
            System.out.println("1 - Inserire nuova riparazione");
            System.out.println("2 - Mostra la lista delle riparazioni");
            System.out.println("3 - Mostra riparazione con priorità MAX");
            System.out.println("4 - Inserire tecnico");
            System.out.println("5 - Assegnare tecnico ad una riparazione");
            System.out.println("6 - Manda in ferie tencici");
            System.out.println("0 - ESCI");

            System.out.println("\nSeleziona un'operazione");
            scelta = sc.nextInt();

            switch (scelta){
                case 1:
                    System.out.println("Digitare via: ");
                    via = scV.nextLine();
                    System.out.println("Digitare numero civico: ");
                    numCiv = scN.nextLine();
                    System.out.println("Selezionare priorità: ");
                    priorita = scP.nextLine();
                    rip.addRiparazione(via, numCiv, priorita);
                    break;
                case 2:
                    System.out.println("Tabella Riparazioni");
                    rip.showTabellaRiparazioni();
                    break;
                case 3:
                    System.out.println("Riparazioni con priorità MAX");
                    System.out.println(Arrays.toString(rip.showMaxPriority()));
                    break;
                case 4:
                    System.out.println("Digitare nome del tecnico: ");
                    nomeTec = scNT.nextLine();
                    System.out.println("Digitare cognome del tecnico: ");
                    cognomeTec = scCT.nextLine();
                    tecnico.setNome(nomeTec);
                    tecnico.setCognome(cognomeTec);
                    break;
                case 5:
                    System.out.println("Tabella Tecnici");

                    break;
                case 6:
                    break;
                default:
                    System.out.println("*** FINE PROGRAMMA ***");
            }
        }

    }
}
