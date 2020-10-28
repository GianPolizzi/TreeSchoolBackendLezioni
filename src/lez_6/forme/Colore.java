package lez_6.forme;

public class Colore {

    private int[] colore = new int[3];

    public Colore(){
        for(int i=0; i<colore.length; i++){
            colore[i] = 0;
        }
    }

    public void setNero(){
        for(int i=0; i<colore.length; i++){
            colore[i] = 0;
        }
    }

    public void setBianco(){
        for(int i=0; i<colore.length; i++){
            colore[i] = 255;
        }
    }

    public int[] getColore(){
        return colore;
    }

    public int[] modificaColore(){
        for(int i=0; i<colore.length; i++){
            if(colore[i] == 0){
                colore[i] = 255;
            }
            else{
                colore[i] = 0;
            }
        }
        return colore;
    }
}
