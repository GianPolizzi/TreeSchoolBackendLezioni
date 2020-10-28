package lez_7.numero_romano;

public class NumeroRomano {

    private String num_romano;

    //Costruttore
    public NumeroRomano(String nr){
        this.num_romano = nr;
    }

    public String getNumRomano(){
        return num_romano;
    }

    public void setNumRomano(String nr){
        this.num_romano = nr;
    }

    public int convertiNumDaRomanoInArabo(String[] nr){
        int somma = 0;
        for (int i=0; i<nr.length; i++){
            //Restituisce la prima volta M
            Numeri x = Numeri.valueOf(nr[i]);
            if(i+1 >= nr.length){
                somma = somma + x.getNum_arabi();
            }
            else{
                Numeri prossima = Numeri.valueOf(nr[i+1]);
                if(prossima.getNum_arabi() > x.getNum_arabi()){
                    //somma
                    somma = somma - x.getNum_arabi();
                }
                else {
                    somma = somma + x.getNum_arabi();
                }
            }
        }
        return somma;
    }
}
