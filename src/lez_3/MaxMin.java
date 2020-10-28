package lez_3;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Inserire numeri interi (separati dalla virgola):");
        String a = sc.nextLine();
        int[] values = parseNumbers(a);
        computeMinAndMax(values);
    }

    static int[] parseNumbers(String s) {
        //inserite qui il vostro codice
        String[] str = s.split(",");
        System.out.println(Arrays.toString(str));
        int[] arrayInteri = new int[str.length];
        for(int i=0; i<str.length; i++){
            //Converto il valore
            arrayInteri[i] = Integer.parseInt(String.valueOf(str[i]));
            System.out.println(arrayInteri[i]);
        }
        return arrayInteri;
    }

    static void computeMinAndMax(int[] values) {
        //inserite qui il vostro codice
        for(int i=0; i<values.length; i++){
            boolean flag = false;
            for(int j=0; j<values.length-1; j++){
                //Se l' elemento j e maggiore del successivo allora scambio i valori
                if(values[j]>values[j+1]) {
                    int k = values[j];
                    values[j] = values[j+1];
                    values[j+1] = k;
                    flag = true; //Lo setto a true per indicare che é avvenuto uno scambio
                }
            }
            if(!flag) break; //Se flag=false allora vuol dire che nell' ultima iterazione
            //non ci sono stati scambi, quindi il metodo può terminare
            //poiché l' array risulta ordinato
        }

        System.out.println("Max = "+values[values.length-1]);
        System.out.println("min = "+values[0]);
    }

    public void calcolaMinMaxIterativo(int[] values){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<values.length; i++){
            if(values[i] > max){
                max = values[i];
            }
            if(values[i] < min){
                min = values[i];
            }
        }
        System.out.println("MAX = "+max);
        System.out.println("Min = "+min);
    }
}