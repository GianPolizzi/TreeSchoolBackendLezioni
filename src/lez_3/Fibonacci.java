package lez_3;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        fibonacciSerie(index);
    }

    static void fibonacciSerie(int index) {

        int[] arrayFib = new int[index];

        for(int i=0; i<arrayFib.length; i++){
            if(i==0){
                arrayFib[i] = 0;
                System.out.println(arrayFib[i]);
                continue;
                //Passa alla iterazione i+1;
            }
            if(i==1){
                arrayFib[i] = 1;
                System.out.println(arrayFib[i]);
                continue;
            }
            arrayFib[i] = (arrayFib[i-1]) + (arrayFib[i-2]);
        }

        System.out.println(Arrays.toString(arrayFib));
    }
}
