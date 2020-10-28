package lez_2;

import java.util.Scanner;

public class Fattoriale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire un numero: ");
        long num = sc.nextInt();
        calcolaFattoriale(num);
    }

    //Calcola il fattoriale
    public static long calcolaFattoriale(long n) {
        if(n==0 || n==1){
            System.out.println("Fattoriale = "+n);
            return 1;
        }
        long tmp = 1;
        for(long i=n; i>=1; i--){
            //n*(n-1)*..*2*1;
            tmp = tmp*i;
        }
        System.out.println("Risultato = "+tmp);
        return n;
    }
}
