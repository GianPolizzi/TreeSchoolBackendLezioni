package lez_6.forme;

public class Cerchio {

    private int raggio;
    private final double PI_GRECO = Math.PI;
    //private Colore = color;

    public Cerchio(int r){
        this.raggio = r;
    }

    public double getRaggio(){
        return raggio;
    }

    public double calcolaCirconferenza(){
        return (raggio * 2 * PI_GRECO);
    }

    public double calcolaArea(){
        return (raggio * raggio * PI_GRECO);
    }
}
