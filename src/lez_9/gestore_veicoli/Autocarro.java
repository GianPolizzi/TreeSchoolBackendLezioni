package lez_9.gestore_veicoli;

public class Autocarro extends Veicolo {

    private int capacitaMaxCarico;

    public Autocarro(String t, int p, int capacitaMaxCarico) {
        setTarga(t);
        setPosti(p);
        this.capacitaMaxCarico = capacitaMaxCarico;
    }

    public int getCapacitaMaxCarico() {
        return capacitaMaxCarico;
    }

    public void setCapacitaMaxCarico(int capacitaMaxCarico) {
        this.capacitaMaxCarico = capacitaMaxCarico;
    }

    @Override
    public String toString() {
        return "Autocarro { " +
                "Targa = " +getTarga()+
                " : Capacità Max di carico = " + getCapacitaMaxCarico() +
                " }";
    }
}
