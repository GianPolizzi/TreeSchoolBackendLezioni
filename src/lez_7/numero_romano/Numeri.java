package lez_7.numero_romano;

public enum Numeri {

    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

    private final int num_arabi;

    //Costruttore
    Numeri(int na) {
        this.num_arabi = na;
    }

    public int getNum_arabi(){
        return num_arabi;
    }
}
