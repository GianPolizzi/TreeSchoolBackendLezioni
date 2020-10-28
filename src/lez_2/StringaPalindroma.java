package lez_2;

import java.util.Scanner;

public class StringaPalindroma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire stringa da controllare: ");
        String s = sc.nextLine();
        controllaStringa(s);
    }

    private static boolean controllaStringa(String s) {
        char[] s1 = s.toCharArray();

        for (int i=0; i<s1.length; i++) {
            if(s1[i] == s.charAt(s1.length - (1+i) )) {
                System.out.println("Posizione "+i+" -> [" +s1[i]+ "] = Posizione: "+(s1.length - (1+i))+" [" + s.charAt(s1.length - (1+i)) + "]");
            }
            else{
                System.out.println("La stringa: "+s+" non è palindroma!");
                return false;
            }

        }
        return true;
    }
}
