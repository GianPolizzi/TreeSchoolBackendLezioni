package lez_2;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire stringa da invertire: ");
        String a = sc.nextLine();
        stringReverse(a);
    }

    static void stringReverse(String s) {
        char[] s1 = s.toCharArray();
        for(int i=s1.length-1; i>=0; i--){
            //print non va a capo come println
            System.out.print(s1[i]);
        }
    }
}
