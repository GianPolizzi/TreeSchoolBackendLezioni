package lez_9.distributore_bevande;

public class Caffe extends  Prodotto{

    public Caffe(String codice, double prezzo){
        super(codice, prezzo);
    }

    @Override
    public String toString() {
        return super.toString()+": Caffè";
    }
}
