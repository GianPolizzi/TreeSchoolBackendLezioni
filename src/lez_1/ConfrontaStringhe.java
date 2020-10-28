package lez_1;

import java.util.Scanner;

public class ConfrontaStringhe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire sringa 1: ");
        String a = sc.nextLine();
        System.out.print("Inserire stringa 2: ");
        String b = sc.nextLine();
        System.out.print("Inserire stringa 3: ");
        String c = sc.nextLine();
        compareStrings(a, b, c);

        //Stampa le proposizioni true e false
        System.out.println("1".equals(""+compareStrings2(a,b,c)));
        System.out.println("2".equals(""+compareStrings2(a,b,c)));
        System.out.println("3".equals(""+compareStrings2(a,b,c)));
    }

    //Stampa solo le stringhe uguali
    private static void compareStrings(String a, String b , String c) {
        //Trasformo le maiuscole in minuscole -> Così non faccio distinzione tra minuscole e maiuscole
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        String c1 = c.toLowerCase();

        System.out.println("\nConfronto le 3 stringhe...");

        if(a1.equals(b1) && b1.equals(c1)){
            System.out.println("Le stringhe "+a+", "+b+" e "+c+" sono uguali");
        }
        else if(a1.equals(b1)){
            System.out.println("Le stringhe "+a+" e "+b+" sono uguali");
        }
        else if(b1.equals(c1)){
            System.out.println("Le stringhe "+b+" e "+c+" sono uguali");
        }
        else if(c1.equals(a1)){
            System.out.println("Le stringhe "+a+" e "+c+" sono uguali");
        }
        else{
            System.out.println("Le stringhe sono tutte diverse!");
        }
    }

    //Metodo per stampare true e false
    private static int compareStrings2(String a, String b, String c){
        //Trasformo le maiuscole in minuscole -> Così non faccio distinzione tra minuscole e maiuscole
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        String c1 = c.toLowerCase();
        return a1.equals(b1) && b1.equals(c1) ? 3 : a1.equals(b1) || a1.equals(c1) || b1.equals(c1) ? 2 : 1;
    }
}
