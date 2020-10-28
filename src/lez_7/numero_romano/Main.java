package lez_7.numero_romano;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire numero romano che desideri convertire: ");
        String numRomano = sc.nextLine();
        NumeroRomano nr1 = new NumeroRomano(numRomano);

        String numRomMaiuscolo = nr1.getNumRomano().toUpperCase();
        System.out.println("Numero inserito = "+numRomMaiuscolo);

        String[] splitNum = numRomMaiuscolo.split("");
        System.out.println(Arrays.toString(splitNum));

        System.out.println(nr1.convertiNumDaRomanoInArabo(splitNum));

    }
}
