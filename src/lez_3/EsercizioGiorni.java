package lez_3;

import java.util.Scanner;

public class EsercizioGiorni {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire secondi: ");
        int sec = sc.nextInt();
        Tempo(sec);
    }

    public static void Tempo(int secondi){
        double minuti = secondi / 60.0;
        double ore = minuti / 60;
        double giorni = ore / 24;

        System.out.println("Secondi: "+secondi);
        System.out.println("Minuti: "+minuti);
        System.out.println("Ore: "+ore);
        System.out.println("Giorni: "+giorni);
    }


}
