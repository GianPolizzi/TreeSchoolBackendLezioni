package lez_3;

import java.util.Arrays;

public class CopiaArray {

    static int[] array1 = new int[10];
    static int[] array2 = new int[10];

    private static void riempiArray(){
        for(int i=0; i<10; i++){
            System.out.println("Inserire elemento ["+i+"] : "+i);
            array1[i] = i;
        }
    }

    private static void copiaArray(){
        for(int i=0; i<array1.length; i++){
            if(array1[i] % 2 == 0){
                array2[i] = array1[i];
            }
            else{
                array2[i] = array1[i] * 2;
            }
        }
    }

    private static void stampaArray(){
        System.out.println((Arrays.toString(array2)));
    }

    public static void main(String[] args){
        riempiArray();
        copiaArray();
        stampaArray();
    }
}
