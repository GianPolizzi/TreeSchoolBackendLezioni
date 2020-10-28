package lez_1;

import java.util.Scanner;

public class InvertiStringa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String a = sc.nextLine();
        reverseString(a);
    }

    private static void reverseString(String s) {
        String[] split = s.split(" ");
        //Per Stringhe più lunghe di 2 parole
        for(int i = split.length-1; i>=0; i--){
            System.out.println(split[i]);
        }
    }
}
