package lez_6.lampadina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Lampadina lamp1 = new Lampadina(5);

        Interruttore interr1 = new Interruttore();
        Interruttore interr2 = new Interruttore();
        InterruttoreGenerale general = new InterruttoreGenerale();

        Scanner scan = new Scanner(System.in);
        String bottone;

        //Ripeti finchè la lampadina si fulmina
        while(!lamp1.verificaStato().equals(Stato.ROTTA)){
            System.out.println("In questo momento la lampadina è: "+lamp1.getStato());
            System.out.println("In questo momento il numero di click possibili è: "+lamp1.getNumeroDiClick());
            System.out.println("Quale interruttore vuoi premere?");
            System.out.println("1 - 2");
            bottone = scan.nextLine();
            general.toogleCorrente();
            System.out.println("La corrente sta circolando nel sistema: "+general.getCorrente());

            switch (bottone){
                case "1" :
                    interr1.toggleLampadina(lamp1, general);
                    lamp1.decrementaClik();
                    break;
                case "2" :
                    interr2.toggleLampadina(lamp1, general);
                    lamp1.decrementaClik();
                    break;
                default:
                    System.out.println("Hai premuto il bottone sbagliato!");
            }

        }
        System.out.println("Hai fulminato la lampadina!");
    }
}
