package lez_1;

import java.util.Scanner;

public class OperatoriAritmetici {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        computeValues(a, b);
    }

    private static void computeValues(int a, int b) {

        int somma = a + b;
        int differenza = a - b;
        int moltiplicazione = a * b;
        int divisione = a / b;

        System.out.println("Il risultato della somma è: "+somma);
        System.out.println("Il risultato della differenza è: "+differenza);
        System.out.println("Il risultato della moltiplicazione è: "+moltiplicazione);
        System.out.println("Il risultato della divisione è: "+divisione);

    }
}
