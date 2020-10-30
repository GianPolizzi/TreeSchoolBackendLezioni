package lez_9.forme_geometriche;

public class Quadrilatero {

    protected int lato;


    public Quadrilatero(){
        this.lato = getLato();
    }



    public int getLato() {
        return lato;
    }

    public void setLato(int lato) {
        this.lato = lato;
    }

    @Override
    public String toString() {
        return "Quadrilatero";
    }
}
