package lez_4;

import java.util.Scanner;

public class CifrarioCesare {

    static char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire la parola da criptare: ");
        String parola = sc.nextLine();
        System.out.println("Inserire la chiave numerica per criptare: ");
        int key = sc.nextInt();
        leggi(parola);
        cripta(parola, key);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("\nInserire la parola da decriptare: ");
        String parolaCript = sc2.nextLine();
        System.out.println("Inserire la chiave numerica per decriptare: ");
        int keyDecript = sc.nextInt();
        leggi(parolaCript);
        decripta(parolaCript, keyDecript);

    }

    public static void leggi(String p){
        System.out.println("Parola inserita: ");
        for(int i=0; i<p.length(); i++) {
            System.out.print(p.toCharArray()[i]);
        }
    }

    public static void cripta(String p, int k){
        char[] cript = new char[p.length()];
        int count = 0;

        for(int i=0; i<p.length(); i++){
            for(int j=0; j<alfabeto.length; j++){
                if(p.charAt(i) == alfabeto[j]){
                    cript[count] = alfabeto[(j+k)%26];
                    count++;
                }
            }
        }
        System.out.println("\nParola criptata: ");
        System.out.println(cript);
    }

    public static void decripta(String p, int k){
        char[] cript = new char[p.length()];
        int count = 0;

        for(int i=0; i<p.length(); i++){
            for(int j=0; j<alfabeto.length; j++){
                if(p.charAt(i) == alfabeto[j]){
                    cript[count] = alfabeto[(j-k)%26];
                    count++;
                }
            }
        }
        System.out.println("\nParola decriptata: ");
        System.out.println(cript);
    }
}
