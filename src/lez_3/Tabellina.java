package lez_3;

import java.util.Arrays;
import java.util.Scanner;

public class Tabellina {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire la tabellina da calcolare: ");
        int elem1 = sc.nextInt();
        System.out.print("Inserire limite: ");
        int elem2 = sc.nextInt();
        calcolaTabellina(elem1, elem2);
    }

    public static int[] calcolaTabellina(int n, int m){
        int[] arrayTab = new int[m+1];

        for(int i=0; i<arrayTab.length; i++){
            arrayTab[i] = n * i;
        }
        System.out.println(Arrays.toString(arrayTab));
        return arrayTab;
    }
}
