package lez_9.gestore_veicoli;

public class Main {

    public static void main(String[] args){

        Automobile auto1 = new Automobile("AK147MA", 4, 4);
        System.out.println(auto1.toString());

        Autocarro carro1 = new Autocarro("ZA878YK", 4, 2);
        System.out.println(carro1.toString());

    }
}
