package lez_1;

import java.util.Scanner;

public class ContaDoppie {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire stringa da controllare: ");
        String a = sc.nextLine();
        contaDuplicate(a);

    }

    //Da sistemare
    public static void contaDuplicate(String str){
        int count;
        String lettera = "";
        String[] arrStr = str.split("");
        for(int i=0; i<arrStr.length; i++){
            count = 1;
            if(!lettera.equals(arrStr[i])){
                for(int j=i+1; j<arrStr.length; j++){
                    if(arrStr[i].equals(arrStr[j])){
                        lettera = arrStr[i];
                        count++;
                    }
                }
                System.out.println("La lettera: "+arrStr[i]+ " alla posizione "+i+" è presente "+count+ " volte");
            }
        }
    }
}
