package lez_2;

import java.util.Scanner;

public class NumeriPrimi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire un numero: ");
        int num = sc.nextInt();
        controllaPrimo(num);
    }

    //Controlla se il numero è primo
    public static boolean controllaPrimo(int n) {
        if(n<3 && n>1){
            System.out.println(n+" è Primo");
            return true;
        }
        for(int i=3; i<=(n/2); i=i+2){

            if(n%i == 0){
                System.out.println(n+" è divisibile per "+i);
                System.out.println(n+" NON è un numero Primo!");
                return false;
            }
        }
        System.out.println(n+" è Primo!");
        return true;

    }
}
