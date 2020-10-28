package lez_6.lampadina;

public class Lampadina {

    private Stato stato;
    private int numeroDiClick;


    public Lampadina(int c){
        this.stato = Stato.SPENTA;
        this.numeroDiClick = c;
    }

    public Stato getStato(){
        return stato;
    }

    public void setStato(Stato s){
        this.stato = s;
    }

    public Stato verificaStato(){
        if(numeroDiClick == 0){
            setStato(Stato.ROTTA);
        }
        return getStato();
    }


    public int decrementaClik(){
        return numeroDiClick--;
    }


    public int getNumeroDiClick(){
        return numeroDiClick;
    }
}
