package lez_4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Impiccato {

    public static String parola = "ombrello";
    public static char[] criptata = new char[8];
    public static int count = parola.length();
    public static int errori = 6;

    public static void main(String args[]){

        start(parola);
        while(count!=0 && errori!=0){
            System.out.println("\nInserire lettera per verificare il match: ");
            Scanner sc = new Scanner(System.in);
            String lettera = sc.next();
            char l = lettera.charAt(0);
            match(l);

            if(errori==0){
                System.out.println("GAME OVER");
            }

        }
        System.out.println("*** HAI VINTO ***");
    }

    public static void start(String parola){
        criptata = parola.toCharArray();

        for (int i=0; i< criptata.length; i++){
            criptata[i] = '_';
            System.out.print(" "+criptata[i]+ " ");
        }
    }

    public static void match(char carattere){
        char[] parolaArray = parola.toCharArray();
        int contaCiclo = 0;
        for(int i=0; i< parolaArray.length; i++) {
            if (parolaArray[i] == carattere) {
                criptata[i] = carattere;
                count--;
                System.out.println("Trovata");
            }
            /* Da rivedere la condizione */
            else if (parolaArray[i] != carattere) {
                contaCiclo++;
                if (contaCiclo == parolaArray.length) {
                    errori--;
                    System.out.println("Errore");
                }
            }
        }

        switch (errori) {
            case 5 -> System.out.println("  O  ");

            case 4 -> {
                System.out.println("  O  ");
                System.out.println("  |  ");
            }
            case 3 -> {
                System.out.println("  O  ");
                System.out.println(" /|  ");
            }
            case 2 -> {
                System.out.println("  O  ");
                System.out.println(" /|\\");
            }
            case 1 -> {
                System.out.println("  O  ");
                System.out.println(" /|\\");
                System.out.println(" |   ");
            }
            case 0 -> {
                System.out.println("  O  ");
                System.out.println(" /|\\");
                System.out.println(" | | ");
            }
        }

        for(int i=0; i<criptata.length; i++) {
            System.out.print(" " + criptata[i] + " ");
        }
    }
}