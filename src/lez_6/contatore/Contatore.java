package lez_6.contatore;

public class Contatore {
    //Attributi
    private int count;

    //Costruttore
    public Contatore(){
        count = 0;
    }

    public Contatore(int count){
        this.count = count;
    }


    //Metodi
    public int getCount(){
        return count;
    }

    public int incrementaCount(){
        return count++;
    }

    public void resetCount(){
        count = 0;
    }

    public void resetCount(int valore){
        if(count < valore){
            count = valore;
        }
        else{
            System.out.println("Il valore è maggiore rispetto al contatore!");
        }
    }
}
