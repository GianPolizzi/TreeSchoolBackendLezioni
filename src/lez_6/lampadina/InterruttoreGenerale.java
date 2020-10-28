package lez_6.lampadina;

public class InterruttoreGenerale {
    //True = Passa corrente
    //False = Non passa corrente
    private boolean corrente = false;


    public boolean getCorrente(){
        return corrente;
    }

    public void setCorrente(boolean c){
        this.corrente = c;
    }

    public boolean toogleCorrente(){
        if(corrente == true){
            setCorrente(false);
        }
        else{
            setCorrente(true);
        }
        return corrente;
    }
}
