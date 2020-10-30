package lez_9.forme_geometriche;

public class Rettangolo extends Quadrilatero{

    private int lato2;

    public Rettangolo(int base, int altezza){
        this.lato = base;
        this.lato2 = altezza;
    }

    public int getPerimetro(){
        return (lato + lato2) * 2;
    }

    public int getArea(){
        return lato * lato2;
    }


    @Override
    public String toString() {
        return super.toString()+" --> Rettangolo";
    }
}
