package lez_2;
import java.util.Scanner;

public class OccorrenzeInStringa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter character a: ");
        String a = sc.nextLine();
        System.out.print("Enter string b: ");
        String b = sc.nextLine();
        countOccurrences(a.charAt(0), b);
    }

    static void countOccurrences(char a, String b) {
        //Converto la stringa b in un array di char
        char[] b1 = b.toCharArray();
        //Definisco un contatore per contare quante volte trovo la lettera dentro la stringa
        int count = 0;
        for(int i=0; i<b1.length; i++){
            if(b1[i] == a){
                count++;
            }
        }
        System.out.println("Lettera '"+a+"' trovata "+count+" volte");
    }
}
