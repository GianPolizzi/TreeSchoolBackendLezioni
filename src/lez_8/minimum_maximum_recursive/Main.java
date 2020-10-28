package lez_8.minimum_maximum_recursive;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        int numElem;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quanti elementi vuoi inserire nell'array?");
        numElem = sc.nextInt();
        int[] arrayNumeri = new int[numElem];

        //MaxMin[] arrayMaxMin = new MaxMin(numElem);

        for(int j=0; j<arrayNumeri.length; j++){
            System.out.println("Inserire elemento ["+j+"]");
            arrayNumeri[j] = sc.nextInt();
        }

        System.out.println("Stampa array disordinato: ");
        System.out.println(Arrays.toString(arrayNumeri));

        MaxMin estremi = new MaxMin(arrayNumeri);
        estremi.mergeSort(arrayNumeri);

        System.out.println("Elemento MAX = "+estremi.getMax());
        System.out.println("Elemento Min = "+estremi.getMin());
    }
}
