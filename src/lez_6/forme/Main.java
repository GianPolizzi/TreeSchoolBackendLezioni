package lez_6.forme;


import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //Quadrato
        Quadrato q1 = new Quadrato(4);
        System.out.println("Il lato del quadrato è "+q1.getLato());
        System.out.println("Il perimentro del quadrato è "+q1.perimetroQuadrato());
        q1.disegnoQuadrato();
        System.out.println("Colore modificato: "+q1.modificaCol());

        //Cerchio
        Cerchio c1 = new Cerchio(1);
        System.out.println("\nIl raggio del cerchio è "+c1.getRaggio());
        System.out.println("La circonferenza del cerchio è "+c1.calcolaCirconferenza());
        System.out.println("L'area del cerchio è "+c1.calcolaArea());

        //Colori
        Colore col1 = new Colore();
        //System.out.println("\nRGB Colore nero = "+ Arrays.toString(col1.getNero()));
        //System.out.println("RGB Colore bianco = "+ Arrays.toString(col1.getBianco()));

    }
}
