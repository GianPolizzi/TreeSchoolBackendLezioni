package lez_1;

import java.util.Scanner;

public class RimpiazzaIntrusi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Inserire lettera che si desidera cambiare: ");
        String a=sc.nextLine();
        System.out.print("Inserire lettera che si desidera sostituire: ");
        String b=sc.nextLine();
        System.out.print("Inserire stringa completa:");
        String c=sc.nextLine();
        replaceIntruder(a, b, c);
    }

    private static void replaceIntruder(String a, String b , String c) {
        //SPLIT = Divide la stringa in un array dove ogni porzione è suddivisa da uno spazio
        String[] split = c.split(" ");
        System.out.println("Stringa originale: "+c);
        System.out.println("Stringa modificata: "+split[0]+" "+split[1].replaceAll(a,b)+" "+split[2]);
    }
}
