package lez_1;

import java.util.Scanner;

public class PariDispari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = sc.nextInt();
        checkEvenOdd(number);
    }

    private static void checkEvenOdd(int number) {
        //Modulo a 2 = Restituisce il resto della divisione di 2 numeri passati come argomento,
        // 0 - senza resto -> Pari
        // 1 - con resto -> Dispari
        if ((number % 2) == 0 ){
            System.out.println("Il numero "+number+" è pari");
        }
        else{
            System.out.println("Il numero "+number+" è dispari");
        }
    }
}
