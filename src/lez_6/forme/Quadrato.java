package lez_6.forme;

public class Quadrato {
    private int lato;
    Colore colore = new Colore();

    public Quadrato(int l){
        this.lato = l;
        colore.setNero();
    }

    public int getLato(){
        return lato;
    }

    public int[] modificaCol(){
        return colore.modificaColore();
    }


    public int perimetroQuadrato(){
        return lato*4;
    }

    public void disegnoQuadrato(){
        for(int i=0; i<lato; i++){
            for(int j=0; j<lato; j++){
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
    }
}
