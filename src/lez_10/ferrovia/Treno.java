package lez_10.ferrovia;

public class Treno {

    private int codice;
    private int velocita;
    private int numMaxVagoni;
    private StatoPorte stato;
    private int numPasseggeri;

    public Treno(){

    }

    public Treno(int codice, int velocita, int numMaxVagoni, StatoPorte stato, int numPasseggeri) {
        this.codice = codice;
        this.velocita = velocita;
        this.numMaxVagoni = numMaxVagoni;
        this.stato = stato;
        this.numPasseggeri = numPasseggeri;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    public int getNumMaxVagoni() {
        return numMaxVagoni;
    }

    public void setNumMaxVagoni(int numMaxVagoni) {
        this.numMaxVagoni = numMaxVagoni;
    }

    public StatoPorte getStato() {
        return stato;
    }

    public void setStato(StatoPorte stato) {
        this.stato = stato;
    }

    public int getNumPasseggeri() {
        return numPasseggeri;
    }

    public void setNumPasseggeri(int numPasseggeri) {
        this.numPasseggeri = numPasseggeri;
    }

    public void partire(){
        if(getVelocita() == 0){
            setVelocita(1);
        }
    }

    public void frenare(){
        if(getVelocita() != 0){
            setVelocita(0);
        }
    }

    public void entraInStazione(){
        System.out.println("Sto entrando in stazione");
        frenare();
    }

    public void togglePasseggero(){
        //Fa salire o scendere un passeggero
    }

    public StatoPorte togglePorte(){
        if(getStato() == StatoPorte.APERTE){
            setStato(StatoPorte.CHIUSE);
            System.out.println("Chiusura porte");
        }
        else{
            setStato(StatoPorte.APERTE);
            System.out.println("Apertura porte");
        }
        return getStato();
    }
}
