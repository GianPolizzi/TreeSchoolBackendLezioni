package lez_9.distributore_bevande;

public class DistributoreDiBevande {

    private int capacitaDistributore;
    private double saldo = 0.0;
    private double resto = 0.0;
    Prodotto[] arrayProdotti;


    public DistributoreDiBevande(int capacitaDistributore) {
        this.capacitaDistributore = capacitaDistributore;
        arrayProdotti = new Prodotto[capacitaDistributore];
    }

    public int getNumProdottiDisponibili() {
        return capacitaDistributore;
    }



    public void caricaProdotto(Prodotto p){
        //In creazione è 10
        if(capacitaDistributore == 0){
            System.out.println("Distributore PIENO! Impossibile inserire altre bevande!");
        }
        else{
            for(int i=0; i<arrayProdotti.length; i++){
                if(arrayProdotti[i] == null){
                    arrayProdotti[i] = p;
                    capacitaDistributore--;
                    System.out.println("L'elemento "+arrayProdotti[i]+" è stato inserito!");
                    break;
                }
            }
        }
        System.out.println("Numero spazi liberi = "+getNumProdottiDisponibili());
    }

    public void prodottiDisponibili(){
        System.out.println("Lista prodotti disponibili");
        for (int i=0; i<arrayProdotti.length; i++){
            System.out.println(arrayProdotti[i]);
        }
    }

    public void inserisciImporto(double importo){
        System.out.println("Importo inserito = "+importo);
        saldo = saldo + importo;
        System.out.println("Saldo attuale = "+saldoAttuale());
    }

    public Prodotto scegliProdotto(String codice){
        int vuoto = 0;
        boolean erogato = false;
        Prodotto selez = null;
        System.out.println("Hai selezionato : "+codice);
        for (int i=0; i<arrayProdotti.length; i++){
            if(saldoAttuale() >= 1.0 && codice.equals(arrayProdotti[i].getCodice())){
                System.out.println("Erogazione del "+codice+" in corso...");
                saldo = saldo - arrayProdotti[i].getPrezzo();
                selez = arrayProdotti[i];
                arrayProdotti[i] = null;
                vuoto = i;
                erogato = true;
                capacitaDistributore++;
                break;
            }
            else if(saldoAttuale() >= 0.5 && saldoAttuale() < 1.0 && codice.equals("caffe")){
                System.out.println("Erogazione del "+codice+" in corso...");
                saldo = saldo - arrayProdotti[i].getPrezzo();
                selez = arrayProdotti[i];
                arrayProdotti[i] = null;
                vuoto = i;
                erogato = true;
                capacitaDistributore++;
                break;
            }
            else{
                System.out.println("Credito insufficiente!");
                erogato = false;
                break;
            }
        }
        if(erogato){
            for(int j=vuoto+1; j<arrayProdotti.length; j++){
                //System.out.println("Prima di spostare"+lista[j-1]);
                //Sposto a sinistra l'array
                arrayProdotti[j-1] = arrayProdotti[j];
                //System.out.println("Dopo aver spostato"+lista[j-1]);
            }
            arrayProdotti[arrayProdotti.length-1] = null;
        }
        return selez;
    }

    public double saldoAttuale(){
        return saldo;
    }

    public double getResto(){
        if(saldoAttuale() < 1.0 || saldoAttuale() < 5.0 || saldoAttuale() > 5.0){
            resto = saldoAttuale();
        }
        return resto;
    }
}