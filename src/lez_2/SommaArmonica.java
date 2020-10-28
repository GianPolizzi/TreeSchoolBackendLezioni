package lez_2;

import java.util.Scanner;

public class SommaArmonica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire un numero: ");
        double num = sc.nextInt();
        harmonicSum(num);
    }

    //Calcola il fattoriale
    public static double harmonicSum(double n) {
        if(n==0){
            System.out.println("Impossibile effettuare la somma armonica!");
            return 0;
        }
        double tmp = 0;
        for(double i=n; i>=1; i--){
            //1+(1/2)+...+(1/n)
            tmp += (1/i);
            System.out.println(1/i);
        }
        System.out.println("Risultato = "+tmp);
        return n;
    }
}
