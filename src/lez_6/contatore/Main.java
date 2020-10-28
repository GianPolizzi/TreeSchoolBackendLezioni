package lez_6.contatore;

public class Main {

    public static void main(String[] args){
        Contatore contatore = new Contatore(2);
        System.out.println("Valore contatore: "+contatore.getCount());

        contatore.incrementaCount(); //3
        System.out.println("Valore contatore incrementato: "+contatore.getCount());

        contatore.resetCount();  //0
        System.out.println("Valore contatore a zero: "+contatore.getCount());

        contatore.resetCount(1);
        System.out.println("Valore contatore resettato: "+contatore.getCount());

    }
}
