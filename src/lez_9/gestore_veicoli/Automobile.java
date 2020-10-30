package lez_9.gestore_veicoli;

public class Automobile extends Veicolo {

    private int numMaxPorte;
    Veicolo v;

    public Automobile(String t, int p, int numMaxPorte) {
        setTarga(t);
        setPosti(p);
        this.numMaxPorte = numMaxPorte;
    }

    public int getNumMaxPorte() {
        return numMaxPorte;
    }

    public void setNumMaxPorte(int numMaxPorte) {
        this.numMaxPorte = numMaxPorte;
    }

    @Override
    public String toString() {
        return "Automobile { " +
                "Targa = " +getTarga()+
                " : Numero Max di porte = " + getNumMaxPorte() +
                " }";
    }
}
