package lez_9.distributore_bevande;

public class Cappuccino extends Prodotto{

    public Cappuccino(String codice, double prezzo){
        super(codice, prezzo);
    }

    @Override
    public String toString() {
        return super.toString()+": Cappuccino";
    }
}
