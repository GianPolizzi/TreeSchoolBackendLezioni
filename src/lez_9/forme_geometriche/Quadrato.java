package lez_9.forme_geometriche;

public class Quadrato extends Quadrilatero{


    public Quadrato(int lato){
        this.lato = lato;
    }


    public int getPerimetro(){
        return lato * 4;
    }

    public int getArea(){
        return lato * lato;
    }

    @Override
    public String toString() {
        return super.toString()+" --> Quadrato";
    }


}
