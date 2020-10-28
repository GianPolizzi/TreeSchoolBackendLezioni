package lez_3;

import java.util.Scanner;

public class Anagrammi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire la stringa 1: ");
        String stringa1 = sc.nextLine();
        System.out.println("Inserire la stringa 2: ");
        String stringa2 = sc.nextLine();
        verificaAnagramma(stringa1, stringa2);
    }

    //Controlla la lunghezza delle 2 stringhe
    public static boolean verificaLunghezza(String str1, String str2){
        if(str1.length() != str2.length()){
            System.out.println("Le stringhe sono DIVERSE in lunghezza");
            return false;
        }
        else{
            System.out.println("Le stringhe hanno la STESSA lunghezza!");
            return true;
        }
    }

    //Controlla lettera per lettera le 2 stringhe
    public static void verificaAnagramma(String str1, String str2){
        if(verificaLunghezza(str1, str2)){
            str1 = str1.toUpperCase();
            str2 = str2.toUpperCase();
            char[] c1 = str1.toCharArray();
            char[] c2 = str2.toCharArray();
            int count = 0;


            for(int i=0; i<c1.length; i++){
                for(int j=0; j<c2.length; j++){
                    if(c1[i] != c2[j]){
                        System.out.println("La lettera "+c1[i]+" della prima stringa non è uguale" +
                                " alla lettera "+c2[j]+" della seconda stringa");
                    }
                    else{
                        System.out.println("La lettera "+c1[i]+" della prima stringa è UGUALE" +
                                " alla lettera "+c2[j]+" della seconda stringa");
                        count++;
                        //Devo trasformare la lettera in un numero così quel controllo sarà saltato alla prossima iterazione
                        c2[j] = '0';
                        //str2 = str2.replace(str2.charAt(j), '0');
                        System.out.print(c2);
                        break;
                    }
                }
                if(count == c2.length){
                    System.out.println("Le 2 stringhe "+c1+" e "+c2+" sono ANAGRAMMI");
                    System.out.println("Contatore = "+count+" e lunghezza = "+c2.length);
                    break;
                }
            }
            if(count == c2.length){
                System.out.println("Le 2 stringhe sono ANAGRAMMI");
            }
            else{
                System.out.println("Le 2 stringhe non sono ANAGRAMMI");
            }

        }
    }
}
